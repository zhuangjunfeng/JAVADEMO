
$(function(){
	/**checkbox全选**/
	$("#checked-all").click(function(){
        	if($(this).attr("checked")==true)
        	{
        		$('input:checkbox').each(function () 
        		{
        			$(this).attr('checked',false);
        		});
        	}else
        	{
        		$('input:checkbox').each(function() 
        			{
        			$(this).attr('checked', true);
        			});
        	}
    });
	 /**user<span> <input>切换**/
    var o_edit=document.getElementsByClassName("user_edit");
    var o_ok=document.getElementsByClassName("glyphicon-ok");   
    $(o_edit).click(function()
    {
        	//切换icon
         	$(this).hide();
         	$(this).next(".glyphicon-ok").show();
         	//替换内容
         	$(this).parent().siblings().children("input").show();//显示input
         	var o_input=$(this).parent().siblings().not(".list-id").children("input");//获取input对象
         	var o_span=$(this).parent().siblings().not(".list-id").children("span");//获取span对象
         	/*
         	 * 循环赋值给input
         	 * */
         	for(var x=0;x<o_span.length;x++)
         	{
            var o_val=new Array();         //o_val 存储span的html
             o_val[x]=$(o_span[x]).html();
            $(o_input[x]).val(o_val[x]);
         	}
         	$(this).parent().siblings().not(".list-id").children("span").html("");

    });
    //点击OK按钮
    $(o_ok).click(function(){
        $(this).hide();
        $(this).prev(".glyphicon-edit").show();
        var o_input=$(this).parent().siblings().not(".list-id").children("input");//获取input对象
        var o_span=$(this).parent().siblings().not(".list-id").children("span");//获取span对象
        /*
         * 循环赋值给input
         * */
        for(var x=0;x<o_input.length;x++){
            var o_val=new Array();                              //o_val 存储span的html
            o_val[x]=$(o_input[x]).val();
            $(o_span[x]).html(o_val[x]);
        }       
        $(this).parent().siblings().not(".list-id").children("input").hide();//隐藏input
    });
    $("#save").click(function(){
    	var newsContent=editor.getContent();
        var news="newsAuthor="+$("#newsAuthor").val()
        		+"&newsTitle="+$("#newsTitle").val()
        		+"&newsType="+$("#newsType").val()
        		+"&editorTime="+$("#editorTime").val()
        		+"&newsContent="+newsContent;

        $.ajax({
            url:"system/addNews.shtml",
            type:"POST",
            data:news,
            
        });
    });
    $("#update-news").click(function(){
        updateNews();
    });
    /**查询全部新闻**/
    query();
   
});

/*****************独立方法*********************/
/**查询全部新闻**/
function query(){
    $.ajax({
        type:"POST",
        url:"system/queryNews.shtml",
        dataType:"json",
        success:function(data){
            var newsList=data.newsList;           
            var newsListHtml="<tr><th><input id='checked-all' type='checkbox'><label>全选</label></th><th>标&nbsp;&nbsp;题</th><th>作&nbsp;&nbsp;者</th><th>类&nbsp;&nbsp;型</th><th>时&nbsp;&nbsp;间</th><th>操&nbsp;&nbsp;作</th></tr>";
            $.each(newsList,function(i,n){
            	i+=1;
            	newsListHtml=newsListHtml+"<tr><td class='list-id'><input type='checkbox'><label>"
            	+i+"</label></td><td>"
            	+n.newsTitle+"</td><td>"
            	+n.newsAuthor+"</td><td>"
            	+n.newsType+"</td><td>"
            	+n.editorTime+"</td><td class='user-edit'><a  class='glyphicon glyphicon-edit news-edit' href='edit-news.html?newsId="
            	+n.newsId+"'></a><a   class='glyphicon glyphicon-eye-open' href='news-detail.html?newsId="
            	+n.newsId+"'></a><span class='glyphicon glyphicon-remove del-news'  data-toggle='modal' data-target='#myModal' data-id='"
            	+n.newsId+"'></span><span class='glyphicon glyphicon-share'></span></td></tr>";
            });
            $("#show_list").html(newsListHtml);
            $(".del-news").click(function(){
            	delNews($(this).attr("data-id"));
            });     
        }
    });
}
/*删除新闻*/
function delNews(newsId){
    var param="newsId="+newsId;
    $.ajax({
        type:"POST",
        dataType:"json",
        url:"system/delNews.shtml",
        data:param,
        success:function(){
            query();
        }
    });
}





