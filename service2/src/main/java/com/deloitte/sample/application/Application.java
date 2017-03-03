package com.deloitte.sample.application;

import com.deloitte.sample.application.model.Car;
import com.deloitte.sample.application.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by akothiyal on 26/01/2017.
 */
@SpringBootApplication
@EnableSwagger2
public class Application {

    private final static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("car-api")
                .apiInfo(apiInfo());

    }

    @Bean
    public CommandLineRunner demo(CarRepository repository) {
        return (args) -> {
            // save a couple of currencies
            repository.save(new Car(1,"FIAT",false));
            repository.save(new Car(2,"UNO",true));

            // fetch all currencies
            log.info("Car found with findAll():");
            log.info("-------------------------------");
            for (Car car : repository.findAll()) {
                log.info(car.toString());
            }
        };
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Car API")
                .description("Sample REST services to try stuff and use swagger to expose it ")
                .termsOfServiceUrl("http://springfox.io")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }

}
