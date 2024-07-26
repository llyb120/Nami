# Nami 迅捷式全栈开发框架

Nami是一款高质量、低码量的全栈式WEB开发框架。

希望你也可以从编程中感受到乐趣。

## 其疾如风

兵法云，兵贵神速，兵不在多而在精，将不在勇而在谋。

人生苦短，当你厌倦了spring全家桶的臃肿与漫长的启动时间，相信Nami如闪电般的启动速度一定会惊艳到你。


1. 我们需要安装JDK11，以及Maven。

2. 在依赖中加入它，例如
```xml
<dependency>
    <groupId>com.github.llyb120</groupId>
    <artifactId>nami</artifactId>
    <version>1.0.1-RELEASE</version>
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

## 其徐如林

作为渐进式的框架，你不需要在一开始就掌握那种晦涩难懂的写法，根据业务的需要直接书写即可，Nami已帮你把一切都准备好。

### 书写控制器
```java
// 类直接继承Ctrl即可，所有public方法会暴露作为接口，无需再定义注解
public Test extends Ctrl {
    public String test(){
        return "success";
    }
}
```
### 定义Bean
```java
@Bean
public class ConfigBean {
}
```

### 定义AOP
```java
public class TestAop implements Aop {
 @Override
    public Object around(Request request, Response response, Expression expression) throws Exception {
//        System.out.println("full before aop");
        Object obj = expression.call();
//        System.out.println("full after aop");
        return obj;
    }
}
```

### 热加载
你对任意代码的变更无需再重启server，Nami会直接帮你应用所有变更。

### 版本控制
可使用@Version注解定义需要生效的类/方法，低于该版本的不会生效。
