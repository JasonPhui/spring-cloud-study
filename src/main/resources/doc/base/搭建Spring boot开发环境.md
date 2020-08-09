### 新建spring initializr项目
### 创建一个测试controller
```
/**
 * @Author ph
 * @Date 2020/8/7
 * @Description 测试controller
 * @Version V1.0
 */
@RestController
public class AppController {

    @RequestMapping("/")
    public String home() {
        return "hello world";
    }
}
```
### 编写测试用例
```
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class CloudApplicationTests {
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new AppController()).build();
    }

    @Test
    void hello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080").accept(MediaType.APPLICATION_JSON));
    }

}
```
- @RunWith: 引入spring对Junit4的支持
- @WebAppConfiguration: 开启Web应用配置，模拟ServletContext<br>
**注意：spring boot2.1.3.RELEASE中使用的Junit4.12，@Before注解是无效的，需要使用@BeforeEach**
### 运行项目
在项目中添加了spring-boot的maven插件，所以项目可以通过`mvn spring-boot:run`命令启动。
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.1</version>
    <configuration>
        <source>${java.version}</source>
        <target>${java.version}</target>
    </configuration>
</plugin>
```
在浏览器输入`http://localhost:8080/`即可看到"hello world"的输出结果
### 部署项目
通过`mvn install`命令将项目打包成jar包后即可通过`java -jar xxx.jar`启动应用
### 遇到的问题
在编写测试controller后启动项目报错
1. `Error:(3,29) java: 程序包org.junit.jupiter.api不存在`
添加jupiter依赖
```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <scope>test</scope>
</dependency>
```
