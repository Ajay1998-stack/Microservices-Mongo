package com.stackRoute.MongoDB.configuration;

import com.stackRoute.MongoDB.repository.TrackRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
//@EnableMongoRepositories(basePackageClasses = TrackRepository.class)
//@Profile("prod")
public class WebConfiguration {
    @Bean
//    ServletRegistrationBean h2serveletRegistration(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
//        registrationBean.addUrlMappings("/console/*");
//        return registrationBean();
//    }
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
