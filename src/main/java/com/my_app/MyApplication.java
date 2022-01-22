package com.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = { "com.my_app.db_access", "com.my_app", "com.resources" })
@SpringBootApplication
@EnableJpaRepositories("com.my_app.db_access")
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);

    }

}
