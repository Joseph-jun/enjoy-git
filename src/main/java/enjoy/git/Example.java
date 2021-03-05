package enjoy.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Joseph.Tan
 * @date : 2021/3/5 14:29
 */
@RestController
@EnableAutoConfiguration
//@SpringBootApplication
public class Example {


    @RequestMapping("/")
    String home() {
        return "Hello Git! -V.08 -master update  ---merge合并分支";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }
}
