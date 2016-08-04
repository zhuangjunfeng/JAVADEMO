package com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.model.Dictionary;
import com.opensymphony.xwork2.ActionContext;
import com.service.impl.DictionaryServiceImpl;

public class DictionaryUtil {
	private final static String DICTIONARY_CACHE = "dictionary";		
	/**
	 * @decription：初始化數據
	 * @date 2016-8-3下午8:24:52
	 * @author：zhuangjf
	 */
	public  static boolean initData(ServletContextEvent arg0){
		final WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext());
		final DictionaryServiceImpl dictionaryService = (DictionaryServiceImpl)springContext.getBean("dictionaryService"); // 关键代码  
         
        ServletContext application = arg0.getServletContext();
        List<Dictionary> dict = dictionaryService.queryDictionary();  
        application.setAttribute(DICTIONARY_CACHE, dict); 
		return true;
	}
	
	/**
	 * @decription：更新字典數據
	 * @date 2016-8-3下午8:27:42
	 * @author：zhuangjf
	 */
	public static boolean updateData(List<Dictionary> dict){
			return true;
	}
	/**
	 * @decription：查詢字典數據
	 * @date 2016-8-3下午8:28:32
	 * @author：zhuangjf
	 */
	public  static List queryData(String type,Map application){
		List<Dictionary> list=(List<Dictionary>) application.get("dictionary");
		List<Dictionary> resList=new ArrayList();		
		for(Dictionary dictionary:list){
			if(dictionary.getDictType().equals(type)){
				resList.add(dictionary);
			}
		}
		return resList;
	}
}
