package com.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServiceStartUpListener implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
	
		System.out.println("-------------------系统初始化字典数据開始--------------");
		DictionaryUtil.initData(arg0);
        System.out.println("-------------------系统初始化字典数据結束--------------");
	
	
	}
	
}
