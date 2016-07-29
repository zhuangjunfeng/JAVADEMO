
$(function(){
   $("#update-news").click(function(){
        updateNews();
    });
 
   querySingleNews(GetRequest().newsId);
});

/*****************独立方法*********************/
/**
 * 新闻单条查询
 * 
 */
function querySingleNews(news_id){
    var param="newsId="+news_id;
    $.ajax({
        type:"POST",
        dataType:"json",
        url:"system/querySingleNews.shtml",
        data:param,
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
/**更新新闻**/
function updateNews(){
    var params ="newsTitle="+$("#e_newsTitle").val() 
            + "&newsType="+ $("#e_newsType").val() 
            + "&newsAuthor="+ $("#e_newsAuthor").val() 
            + "&editorTime=" + $("#e_editorTime").val()
            + "&newsContent=" +editor.getContent()+"&newsId="+GetRequest().newsId;
    $.ajax({
        type : "POST",
        dataType : "json",
        url : 'system/updateNews.shtml',
        data : params,
        success : function(data) {
            query();
        }
    });     
}
/**获取Url中的参数**/
function GetRequest() { 
    var url = location.search; //获取url中"?"符后的字串 
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



 