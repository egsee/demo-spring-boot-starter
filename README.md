# <center>自定义 spring-boot-starter 示例</center>

## 简介
包含两个模块

## demo-spring-boot-auto-configuration
自动配置模块

## demo-spring-boot-start
starter模块依赖自动配置模块


## 安装

项目根目录下运行 `mvn clean install`


## 使用

- maven项目 `pom.xml` 中添加依赖

```xml
 <dependency>
    <groupId>com.egsee.demo</groupId>
    <artifactId>demo-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
```

- `application.properties(.yml)`配置
```
com.egsee.demo.hello.to = egsee
com.egsee.demo.hello.message = This is a test spring-boot starter
```

- 使用服务
```java
import com.egsee.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    HelloService service;
    
    @ResponseBody
    @GetMapping("/greet")
    public String SayHello(){
        return service.greet();
    }
}
```
