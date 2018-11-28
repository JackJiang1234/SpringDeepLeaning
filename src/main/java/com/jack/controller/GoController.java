package com.jack.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.ServletConfigPropertySource;
import org.springframework.web.context.support.StandardServletEnvironment;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.http.HttpServlet;

@Controller
public class GoController implements EnvironmentAware {

    private final Log logger = LogFactory.getLog(GoController.class);

    //处理HEAD类型的”/”请求
    @RequestMapping(value={"/"},method= {RequestMethod.HEAD})
    public String head() {
        return "go.jsp";
    }
    //处理GET类型的"/index"和”/”请求
    @RequestMapping(value={"/index","/"},method= {RequestMethod.GET})
    public String index(Model model) throws Exception {
        logger.info("======processed by index=======");
        //返回msg参数
        model.addAttribute("msg", "Go Go Go!");
        return "index.jsp";
    }

    private void test(){
        HttpServlet servlet;
        HttpServletBean httpServletBean;
        FrameworkServlet frameworkServlet;
        DispatcherServlet dispatcherServlet;
        ContextLoaderListener listener;
    }

    private  Environment environment = null;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        //ServletConfigPropertySource source;
        //StandardServletEnvironment standardServletEnvironment;
    }
}
