package com.atguigu.jsonData.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.jsonData.service.EmployeeService;

@Component
public class LoginInterceptor implements HandlerInterceptor{
    
    @Autowired
    EmployeeService empService;

    /**
     * 该方法在目标方法之前被调用.
     * 若返回值为 true, 则继续调用后续的拦截器和目标方法. 
     * 若返回值为 false, 则不会再调用后续的拦截器和目标方法. 
     * 
     * 可以考虑做权限. 日志, 事务等. 
     */
    @SuppressWarnings("unused")
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        System.out.println("[FirstInterceptor] preHandle");
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String str = contextPath + "/main.html";
        
        if(str.equals(requestURI)){
            Object loginacct = null;
            Object userpswd = null;
            Boolean exist = false;
            loginacct = request.getParameter("loginacct");
            userpswd = request.getParameter("userpswd");
            if(loginacct != null && !loginacct.equals("") && userpswd != null && !userpswd.equals("")){
                //查询数据库
                exist = empService.isExist((String)loginacct, (String)userpswd);
                System.out.println(loginacct + "  ,  " + userpswd);
            }
            if(!exist){
                HttpSession session = request.getSession();
                session.setAttribute("errorInfo", "用户不存在");
                response.sendRedirect(contextPath + "/index.html");
            }
        }
        return true;
        
    }

    /**
     * 调用目标方法之后, 但渲染视图之前. 
     * 可以对请求域中的属性或视图做出修改. 
     */
    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("[FirstInterceptor] postHandle");
    }

    /**
     * 渲染视图之后被调用. 释放资源
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("[FirstInterceptor] afterCompletion");
    }

}
