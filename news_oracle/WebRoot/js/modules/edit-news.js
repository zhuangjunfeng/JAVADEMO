$(function(){
	/**
	 * @decription：调用更新新闻方法
	 * @param：#update-news edit-news页面保存按钮
	 */
	$("#update-news").click(function(){
        updateNews();
    	});
	/**
	 * @decription:登出方法
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
	/**
	 * @decription：页面加载时查询字典数据，成功后执行单条查询方法
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
			 $("#e_newsType").html(typeHtml);
			  querySingleNews();
		}
	});
 
 
});
/*****************独立方法*********************/
/**
 * @decription：新闻单条查询
 * @author：zhuangjf
 */
function querySingleNews(){
    var param="newsId="+GetRequest().newsId;
    
        $.ajax({
        type:"POST",
        dataType:"json",
        url:"system/querySingleNews.shtml",
        data:param,
        error:function(XMLHttpRequest, textStatus, errorThrown){
        	if(XMLHttpRequest.responseText=="loginError"){
        		window.location.href="login.html";
        	}
        },
        success:function(data){
            var singleList=data.singleList;
            var news=singleList[0];
            $("#e_newsTitle").val(news.newsTitle);
            $("#e_newsType").val(news.newsType);
            $("#e_editorTime").val(news.editorTime);
            $("#e_newsAuthor").val(news.newsAuthor);
            var newsContent=news.newsContent;
            editor.addListener("ready", function () {
            editor.setContent(newsContent,true);
        });
    }
    });
}
	/**
	 * @decription：更新新闻方法
	 * @author：zhuangjf
	 */
	function updateNews(){

		$.ajax({
			type : "POST",
			dataType : "json",
			url : 'system/updateNews.shtml',
			data : {
				newsId:GetRequest().newsId,
        		newsTitle:$("#e_newsTitle").val(),
        		newsAuthor:$("#e_newsAuthor").val(),
        		editorTime:$("#e_editorTime").val(),
        		newsType:$("#e_newsType").val(),
        		newsContent:editor.getContent()
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
				if(XMLHttpRequest.responseText=="loginError"){
        		window.location.href="login.html";
				}
			},
			success : function(data) {
        	window.location.href="news.html";
			}
		});     
}
/**
 * @theRequest：获取URL中？后字符串方法
 * @author zhuangjf
 * @returns {theRequest}
 */
function GetRequest() { 
    var url = location.search;
    var theRequest = new Object(); 
    if (url.indexOf("?") != -1) { 
    var str = url.substr(1); 
    strs = str.split("&"); 
    for(var i = 0; i < strs.length; i ++) { 
    theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]); 
    } 
    } 
    return theRequest; 
} 



 