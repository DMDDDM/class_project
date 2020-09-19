package cn.dmdddm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan(basePackages="cn.dmdddm.dao")
public class RunDirectionBoot implements WebMvcConfigurer {

    public static void main(String[] args) {

        SpringApplication.run(RunDirectionBoot.class, args);
    }
}