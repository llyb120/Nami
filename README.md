# Nami 迅捷式全栈开发框架

Nami是一款高质量、低码量的全栈式WEB开发框架。

希望你也可以从编程中感受到乐趣。

# 其疾如风

1. 我们需要安装JDK11，以及Maven。

2. 在依赖中加入它，例如
```xml
<dependency>
    <groupId>com.beeasy</groupId>
    <artifactId>web-core</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

3. 为了方便，我们可以将Maven中的代码编译设定为JDK11，Nami使用了JDK8新增的元数据反射，所以加入了`-parameters`参数
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.1</version>
    <configuration>
        <source>11</source>
        <target>11</target>
        <compilerArgs>
            <arg>-parameters</arg>
        </compilerArgs>
    </configuration>
</plugin>
```

4. 在根目录下加入`config.json`文件，具体的配置可参考下文。

5. 建立启动类，例如
```java
public class App {
    public static void main(String[] args) {
        Nami.start();
    }
}
```

6. 按下IDEA的启动，只需不要500ms，Nami既可启动成功。

# 其徐如林