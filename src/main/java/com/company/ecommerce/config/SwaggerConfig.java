//package com.company.ecommerce.config;
//
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    public Docket myApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(basePackage("com.company.ecommerce"))
//                .paths(regex("/api.*"))
//                .build().apiInfo(apiEndPointInfo());
//    }
//
//    private ApiInfo apiEndPointInfo(){
//        return new ApiInfoBuilder().title("SPRING BOOT")
//                .description("Hello")
//                .contact("bla bla bla")
//                .license("Apache 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .version("1.0.0")
//                .build();
//
//    }
//}
