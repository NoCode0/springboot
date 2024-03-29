package com.atguigu.jsonData.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 项目启动的时候，将一些数据放在application域中。
 * @ClassName MyAppListener
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 57608
 * @Date 2019年3月11日 下午8:44:19
 * @version 1.0.0
 */
@WebListener
public class MyAppListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        //1、将项目路径放在application 域中
        servletContext.setAttribute("ctp", servletContext.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //2、项目关闭，销毁application域中所有数据
        //xxx
    }

}
