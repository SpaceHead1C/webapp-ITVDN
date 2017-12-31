package com.vebinar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/** Configure:
 * • ViewResolver – Springs component wich looks my views in dir WEB-INF
 * • Configurer – determines ways to front pages
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.vebinar.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver getViewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
        viewResolver.setOrder(1);
        viewResolver.setPrefix("");
        viewResolver.setSuffix(".ftl");

        return viewResolver;
    }

    @Bean
    public FreeMarkerConfigurer getFreeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setTemplateLoaderPaths("/", "WEB-INF/views/");

        return configurer;
    }
}
