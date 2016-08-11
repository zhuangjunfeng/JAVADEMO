$(function(){
	/**
	 * @decription：查询字典数据拼入页面
	 * @author：zhuangjf
	 */
	$.ajax({		
		url:"system/queryData.shtml",
		type:"POST",
		data:{type:"newsType"},
		success:function(data){
			var typeList=data.list;
			var typeHtml="";
			 $.each(typeList,function(i,n){
				 typeHtml+="<option>"+n.dictName+"</option>";           
			 });
			 $("#newsType").html(typeHtml);
		}
	});
	/**
	 * @decription:添加新闻
	 * @author：zhuangjf
	 * @param：#save 保存按钮
	 */
	 $("#save").click(function(){
	        $.ajax({
	            url:"system/addNews.shtml",
	            type:"POST",
	            data:{
	        		newsTitle:$("#newsTitle").val(),
	        		newsAuthor:$("#newsAuthor").val(),
	        		editorTime:$("#editorTime").val(),
	        		newsType:$("#newsType").val(),
	        		newsContent:editor.getContent()
	        		},
	            error:function(XMLHttpRequest, textStatus, errorThrown){
	            	if(XMLHttpRequest.responseText=="loginError"){
	            		window.location.href="login.html";
	            	}
	            },
	            success:function(){
	            	window.location.href="news.html";
	            }
	        });
	    });
	 /**
	  * @decription:登出方法
	  * @author：zhuangjf
	  * @param：#logout 退出按钮
	  */
	 $("#logout").click(function(){
		 $.ajax({
			 url:"system/logout.shtml",
	            type:"POST",	          
	            success:function(){
	            	window.location.href="login.html";
	            	}
		 });
	 });
});