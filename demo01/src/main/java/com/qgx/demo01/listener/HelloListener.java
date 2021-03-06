package com.qgx.demo01.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
public class HelloListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("初始化hello  listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
