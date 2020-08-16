### 项目搭建中遇到的问题
- 在添加eureka依赖时，不知道该添加<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
还是<artifactId>spring-cloud-starter-eureka-server</artifactId>，spring boot2.0以前用后者，2.0之后用前者
- 添加eureka时报无法找到依赖，错误原因是在<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>下写了<version>Greenwich.SR6</version>,
把项目版本当成包的版本了。 
### 启动eureka注册中心

