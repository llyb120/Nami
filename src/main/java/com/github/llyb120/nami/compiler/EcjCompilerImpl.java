package com.github.llyb120.nami.compiler;

import org.eclipse.jdt.core.compiler.CharOperation;
import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import org.eclipse.jdt.internal.compiler.lookup.TypeConstants;
import org.eclipse.jdt.internal.compiler.problem.AbortCompilationUnit;
import org.eclipse.jdt.internal.compiler.tool.EclipseCompiler;
import org.eclipse.jdt.internal.compiler.tool.EclipseCompilerImpl;
import org.eclipse.jdt.internal.compiler.util.HashtableOfObject;

import javax.annotation.processing.Processor;
import javax.tools.JavaFileObject;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EcjCompilerImpl extends EclipseCompilerImpl {
    private static final CompilationUnit[] NO_UNITS = new CompilationUnit[0];
    protected HashMap<CompilationUnit, JavaFileObject> javaFileObjectMap;
    protected Iterable<? extends JavaFileObject> compilationUnits;
    protected Processor[] processors;

    public EcjCompilerImpl(PrintWriter out, PrintWriter err, boolean systemExitWhenFinished) {
        super(out, err, systemExitWhenFinished);
    }

    @Override
    protected void initialize(PrintWriter outWriter, PrintWriter errWriter, boolean systemExit, Map<String, String> customDefaultOptions, CompilationProgress compilationProgress) {
        super.initialize(outWriter, errWriter, systemExit, customDefaultOptions, compilationProgress);
        this.javaFileObjectMap = new HashMap<>();
    }

    @Override
    public CompilationUnit[] getCompilationUnits() {
        // This method is largely a copy of Main#getCompilationUnits()
        if (this.compilationUnits == null) return NO_UNITS;
        HashtableOfObject knownFileNames = new HashtableOfObject();
        ArrayList<CompilationUnit> units = new ArrayList<>();
        for (int round = 0; round < 2; round++) {
            int i = 0;
            for (final JavaFileObject javaFileObject : this.compilationUnits) {
                String name = javaFileObject.getName();
                char[] charName = name.toCharArray();
                boolean isModuleInfo = CharOperation.endsWith(charName, TypeConstants.MODULE_INFO_FILE_NAME);
                if (isModuleInfo == (round==0)) { // 1st round: modules, 2nd round others (to ensure populating pathToModCU well in time)
                    if (knownFileNames.get(charName) != null)
                        throw new IllegalArgumentException(this.bind("unit.more", name)); //$NON-NLS-1$
                    knownFileNames.put(charName, charName);
//                    File file = new File(name);
//                    if (!file.exists())
//                        throw new IllegalArgumentException(this.bind("unit.missing", name)); //$NON-NLS-1$
                    CompilationUnit cu = new CompilationUnit(null,
                            name,
                            null,
                            this.destinationPaths[i],
                            shouldIgnoreOptionalProblems(this.ignoreOptionalProblemsFromFolders, name.toCharArray()), this.modNames[i]) {

                        @Override
                        public char[] getContents() {
                            try {
                                return javaFileObject.getCharContent(true).toString().toCharArray();
                            } catch(IOException e) {
                                e.printStackTrace();
                                throw new AbortCompilationUnit(null, e, null);
                            }
                        }
                    };
                    units.add(cu);
                    this.javaFileObjectMap.put(cu, javaFileObject);
                }
                i++;
            }
        }
        CompilationUnit[] result = new CompilationUnit[units.size()];
        units.toArray(result);
        return result;
    }


}
