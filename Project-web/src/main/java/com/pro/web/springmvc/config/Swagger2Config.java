package com.pro.web.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.pro.web.springmvc.controller.api" })//配置controller路径
public class Swagger2Config {
    @Bean
    public Docket createRestfulApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//api信息
                .select()//构建api选择器
                .apis(RequestHandlerSelectors.basePackage("com.pro.web.springmvc.controller.api"))//api选择器选择api的包
                .paths(PathSelectors.any())//api选择器选择包路径下任何api显示在文档中
                .build();//创建文档
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("chop-api REST API文档")
                .description("使用Swagger UI构建SpringMVC REST风格的可视化文档")
                .termsOfServiceUrl("/swagger-ui.html")
                .version("1.0.0-SNAPSHOT")
                .build();
    }


}
