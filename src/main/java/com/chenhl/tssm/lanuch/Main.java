package com.chenhl.tssm.lanuch;

import com.chenhl.tssm.web.MyWeb;
import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.core.StandardWrapper;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.startup.ContextConfig;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.EmptyResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @创建人: chenhl
 * @创建时间: 2020/2/12
 * @描述:
 */
public class Main {

//    public static void main(String[] args) throws Exception {
//
//        Tomcat tomcat = new Tomcat();
//        //Server server = tomcat.getServer();
//
//        //看源码发现,他只能设置一个service,直接拿默认的
//        Service service = tomcat.getService();
//
//        //创建连接器,并且添加对应的连接器,同时连接器指定端口
//        Connector connector = new Connector();
//        connector.setPort(8080);
//        service.addConnector(connector);
//
//        //创建一个引擎,放入service中
//        Engine engine = new StandardEngine();
//        service.setContainer(engine);
//        engine.setDefaultHost("localhost");
//        engine.setName("myTomcat");
//
//        //添加host
//        Host host = new StandardHost();
//        engine.addChild(host);
//        host.setName("localhost");
//        host.setAppBase("webapps");
//
//
//        //在对应的host下面创建一个 context 并制定他的工作路径
//        StandardContext context = (StandardContext) tomcat.addContext(host, "/tssm", "/C:/Transfar/owner/tssm/target");
//
//        //初始化ContextConfig配置
//        context.addLifecycleListener(new ContextConfig());
//
//        //加载指定位置的web.xml
//        //context.getServletContext().setAttribute("org.apache.catalina.deploy.alt_dd","/Users/bignosecat/IdeaProjects/xx/tomcat/src/main/resources/web.xml");
//
//        //初始化 默认的servlet,这里会 触发tomcat#initWebappDefaults 方法,等价于平时tomcat自动加载默认的conf/web.xml文件
//        //当然也可以手动加载,这里因为我没引用jsp的包,所以不自动加载.
//        context.addLifecycleListener(tomcat.getDefaultWebXmlListener());
//
//        //创建一个默认的Servlet 用来处理 html 等静态资源,如果上面设置了getDefaultWebXmlListener 可以不添加
////        Wrapper defaultServlet = new StandardWrapper();
////        defaultServlet.setServlet(new DefaultServlet());
////        defaultServlet.setName("default");
////        context.addChild(defaultServlet);
////        defaultServlet.addMapping("/");
//
//
//        //创建一个servlet
////        Wrapper myservlet = new StandardWrapper();
////        myservlet.setServlet(new MyWeb());
////        myservlet.setName("myServlet");
////        context.addChild(myservlet);
////        myservlet.addMapping("/helloworld");
//
//        //tomcat启动
//        tomcat.start();
//        //保持主线程不退出
//        tomcat.getServer().await();
//
//    }
}
