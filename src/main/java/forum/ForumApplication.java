package forum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//提供一部处理机制，使用@Async注解可以使得方法不再主线程中进行
@EnableAsync
@SpringBootApplication(scanBasePackages = {"forum"})
@MapperScan(basePackages = {"forum.mappers"})
@EnableTransactionManagement
@EnableScheduling
public class ForumApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForumApplication.class, args);
    }
}
