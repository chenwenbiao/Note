package com.didispace;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//通过@Configuration注解让Spring来加载该类配置
@EnableSwagger2//通过@EnableSwagger2注解来启动Swagger2.
public class Swagger2 {

    /**
     * 再通过createRestApi函数创建Docket的Bean之后，apiInfo()用来创建该Api的基本信息
     * （这些基本信息会展现在文档页面中）。select()函数返回一个ApiSelectorBuilder实例用来
     * 控制哪些接口暴露给Swagger来展现，本例采用指定扫描的包路径来定义，Swagger会扫描该包
     * 下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）。
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.didispace.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("我是标题")
                .description("我是描述")
                .termsOfServiceUrl("myServiceUrl")
                .contact("许志江")
                .version("V2.0.1")
                .build();
    }

}
