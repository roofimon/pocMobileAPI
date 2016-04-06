package th.co.dtac.mobile.rtr;

<<<<<<< HEAD
import java.math.BigDecimal;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import th.co.dtac.mobile.rtr.repository.ProductRepository;
import th.co.dtac.mobile.rtr.th.co.dtac.mobile.rtr.model.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
//            System.out.println(beanName);
        }
    }
}
