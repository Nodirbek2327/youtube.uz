package com.example.config;


import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecuredFilterConfig {
    @Autowired
    private JWTFilter jwtFilter;

    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(jwtFilter);
        bean.addUrlPatterns("/api/v1/profile/admin/*");
        bean.addUrlPatterns("/api/v1/region/admin/*");
        bean.addUrlPatterns("/api/v1/category/admin/*");
        bean.addUrlPatterns("/api/v1/article_type/admin/*");
        bean.addUrlPatterns("/api/v1/article/admin/*");
        bean.addUrlPatterns("/api/v1/tag/admin/*");
        bean.addUrlPatterns("/api/v1/attach/admin/*");
        bean.addUrlPatterns("/api/v1/comment/admin/*");
        bean.addUrlPatterns("/api/v1/comment_like/admin/*");
        return bean;
    }
}
