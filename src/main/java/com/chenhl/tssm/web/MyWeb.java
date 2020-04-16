package com.chenhl.tssm.web;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @创建人: chenhl
 * @创建时间: 2020/2/15
 * @描述:
 */
public class MyWeb extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setCharacterEncoding("utf-8");
        System.out.println("进入请求");
        PrintWriter writer = res.getWriter();
        writer.println("<h1>HttpServlet request</h1>");
    }
}
