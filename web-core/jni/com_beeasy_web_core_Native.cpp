#include "com_beeasy_web_core_Native.h"
#include "ChakraCore.h"
#include <string>
#include <iostream>

using namespace std;

void JNICALL Java_com_beeasy_web_core_Native_test
  (JNIEnv *, jclass)
{
    JsRuntimeHandle runtime;
    JsContextRef context;
    JsValueRef result;
    unsigned currentSourceContext = 0;

    // Your script; try replace hello-world with something else
    wstring script = L"(()=>{return \'Hello world!\';})()";

    // Create a runtime.
    JsCreateRuntime(JsRuntimeAttributeNone, nullptr, &runtime);

    // Create an execution context.
    JsCreateContext(runtime, &context);

    // Now set the current execution context.
    JsSetCurrentContext(context);

    // Run the script.
    JsRunScript(script.c_str(), currentSourceContext++, L"", &result);

    // Convert your script result to String in JavaScript; redundant if your script returns a String
    JsValueRef resultJSString;
    JsConvertValueToString(result, &resultJSString);

    // Project script result back to C++.
    const wchar_t *resultWC;
    size_t stringLength;
    JsStringToPointer(resultJSString, &resultWC, &stringLength);

    wstring resultW(resultWC);
    cout << string(resultW.begin(), resultW.end()) << endl;
    system("pause");

    // Dispose runtime
    JsSetCurrentContext(JS_INVALID_REFERENCE);
    JsDisposeRuntime(runtime);

}