package com.util;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.model.Dictionary;
import com.service.impl.DictionaryServiceImpl;

public class ServiceStartUpListener implements ServletContextListener {
	
	
	
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
	
		System.out.println("-------------------系统初始化字典数据開始--------------");
		DictionaryUtil.initData(arg0);
        System.out.println("-------------------系统初始化字典数据結束--------------");
	
	
	}
	
}
