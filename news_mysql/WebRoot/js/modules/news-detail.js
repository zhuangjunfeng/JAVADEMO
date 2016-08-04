$(function(){
    detailNews(GetRequest().newsId);
});

/*****************独立方法*********************/
/**
 * @decription：新闻详情显示
 * @author：zhuangjf
 */
function detailNews(news_id){
    var param="newsId="+news_id;
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
            var news_content=news.newsContent;
            var detail_news="<h3> <b>"
            	+news.newsTitle+"</b></h3><span>作者："
            	+news.newsAuthor+"</span><span>"
            	+news.newsType+"</span><span>"
            	+news.editorTime+"</span>";         
            $("#show_detail").html(detail_news);
            $("#detail_newsContent").html(news_content);
    }
    });
}
/**
 * @decription：获取URL?后的字符串
 * @author：zhuangjf
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



 