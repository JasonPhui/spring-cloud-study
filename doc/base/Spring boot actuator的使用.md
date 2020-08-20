### 1、添加actuator依赖
```$xslt
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
```
### 2、在application.properties中打开各个原生端点
```$xslt
#暴露所有端点
management.endpoints.web.exposure.include=*
#默认启用端点
management.endpoints.enabled-by-default=true
#指定端点启用
management.endpoint.shutdown.enabled=true
```
### 3、访问/actuator即可得到访问各个原生端点的url
原生端点分成三类：
 - 应用配置类，就是应用的各种配置，在应用启动时就已确定，包括自动配置信息报告、Bean创建信息报告、运行环境信息报告等
 - 度量指标类，是应用运行情况的度量指标，如内存、HTTP请求统计、外部资源指标等
 - 操作控制类，可以停止应用程序
