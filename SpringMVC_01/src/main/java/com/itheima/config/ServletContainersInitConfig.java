package com.itheima.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;


//web容器配置类
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
//    //加载SpringMVC配置类,产生SpringMVC容器(本质还是Spring容器)
//    protected WebApplicationContext createServletApplicationContext() {
//        //初始化WebApplicationContext对象
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        //加载指定配置类
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//    //设置由springmvc控制器处理的请求映射路径
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//    //加载spring配置类
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }

    //简化格式
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    //post请求乱码处理
    @Override
    protected Filter[] getServletFilters(){
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        return new Filter[]{filter};
    }
}
