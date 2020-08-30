### 官网地址
版本:[Spring cloud版本选择](https://start.spring.io/actuator/info)
### Spring 版本选择
```
"spring-cloud": {
            "Finchley.M2": "Spring Boot >=2.0.0.M3 and <2.0.0.M5",
            "Finchley.M3": "Spring Boot >=2.0.0.M5 and <=2.0.0.M5",
            "Finchley.M4": "Spring Boot >=2.0.0.M6 and <=2.0.0.M6",
            "Finchley.M5": "Spring Boot >=2.0.0.M7 and <=2.0.0.M7",
            "Finchley.M6": "Spring Boot >=2.0.0.RC1 and <=2.0.0.RC1",
            "Finchley.M7": "Spring Boot >=2.0.0.RC2 and <=2.0.0.RC2",
            "Finchley.M9": "Spring Boot >=2.0.0.RELEASE and <=2.0.0.RELEASE",
            "Finchley.RC1": "Spring Boot >=2.0.1.RELEASE and <2.0.2.RELEASE",
            "Finchley.RC2": "Spring Boot >=2.0.2.RELEASE and <2.0.3.RELEASE",
            "Finchley.SR4": "Spring Boot >=2.0.3.RELEASE and <2.0.999.BUILD-SNAPSHOT",
            "Finchley.BUILD-SNAPSHOT": "Spring Boot >=2.0.999.BUILD-SNAPSHOT and <2.1.0.M3",
            "Greenwich.M1": "Spring Boot >=2.1.0.M3 and <2.1.0.RELEASE",
            "Greenwich.SR6": "Spring Boot >=2.1.0.RELEASE and <2.1.17.BUILD-SNAPSHOT",
            "Greenwich.BUILD-SNAPSHOT": "Spring Boot >=2.1.17.BUILD-SNAPSHOT and <2.2.0.M4",
            "Hoxton.SR7": "Spring Boot >=2.2.0.M4 and <2.3.4.BUILD-SNAPSHOT",
            "Hoxton.BUILD-SNAPSHOT": "Spring Boot >=2.3.4.BUILD-SNAPSHOT and <2.4.0.M1",
            "2020.0.0-SNAPSHOT": "Spring Boot >=2.4.0.M1"
        }
```
### Spring cloud Maven依赖
```
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Greenwich.SR2</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
</dependencyManagement>
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka</artifactId>
    </dependency>
</dependencies>
```