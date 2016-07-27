
$(function(){
//    鐐瑰嚮鍏ㄩ�鎸夐挳锛岄�鎷╂墍鏈変俊鎭�
    $("#checked-all").click(function(){
        if($(this).attr("checked")==true){
            $('input:checkbox').each(function () {
                $(this).attr('checked',false);
            });
        }else{
            $('input:checkbox').each(function() {
                $(this).attr('checked', true);
            });
        }

    })
//    鐐瑰嚮缂栬緫鎸夐挳锛屾樉绀鸿緭鍏ユ锛岃幏鍙栧綋鍓嶅�
    var o_edit=document.getElementsByClassName("user_edit");
    var o_ok=document.getElementsByClassName("glyphicon-ok");
    //绗偣鍑荤紪杈戞寜閽�
    $(o_edit).click(function(){
        //鍒囨崲icon
         $(this).hide();
        $(this).next(".glyphicon-ok").show();
        //鏇挎崲鍐呭
        $(this).parent().siblings().children("input").show();//鏄剧ずinput
        var o_input=$(this).parent().siblings().not(".list-id").children("input");//鑾峰彇input瀵硅薄
        var o_span=$(this).parent().siblings().not(".list-id").children("span");//鑾峰彇span瀵硅薄
        /*
        * 寰幆璧嬪�缁檌nput
        * */
        for(var x=0;x<o_span.length;x++){
            var o_val=new Array();                              //o_val 瀛樺偍span鐨刪tml
             o_val[x]=$(o_span[x]).html();
            $(o_input[x]).val(o_val[x]);
        }

        $(this).parent().siblings().not(".list-id").children("span").html("");

    })
    //鐐瑰嚮OK鎸夐挳
    $(o_ok).click(function(){
        $(this).hide();
        $(this).prev(".glyphicon-edit").show();
        var o_input=$(this).parent().siblings().not(".list-id").children("input");//鑾峰彇input瀵硅薄
        var o_span=$(this).parent().siblings().not(".list-id").children("span");//鑾峰彇span瀵硅薄
        /*
         * 寰幆璧嬪�缁檚pan
         * */
        for(var x=0;x<o_input.length;x++){
            var o_val=new Array();                              //o_val 瀛樺偍span鐨刪tml
            o_val[x]=$(o_input[x]).val();
            $(o_span[x]).html(o_val[x]);
        }       
        $(this).parent().siblings().not(".list-id").children("input").hide();//闅愯棌input
    });

});

$("#save").click(function(){
	var newsContent=editor.getContent();
    var news="newsAuthor="+$("#newsAuthor").val()+"&newsTitle="+$("#newsTitle").val()
    			+"&newsType="+$("#newsType").val()+"&editorTime="+$("#editorTime").val()+"&newsContent="+newsContent;

    $.ajax({
        url:"system/addNews.shtml",
        type:"POST",
        data:news,
        
    });
});


$("#query").click(function query(){
    $.ajax({
        type:"POST",
        url:"system/queryNews.shtml",
        data:"",
        success:function(data){
            var newsList=data.NewsList;
            var newsListHtml="<tr><td>新闻Id</td><td>新闻标题</td><td>新闻作者</td><td>新闻类型</td><td>时间</td><td>操作</td></tr>";
            $.each(newsList,function(i,n){
                newsListHtml=newsListHtml+"<tr>"+"<td>"+n.newsId+"</td>"+"<td>"+n.newsTitle+"</td>"+"<td>"+n.newsAuthor+"</td>"+"<td>"+n.newsType+"</td>"+"<td>"+n.editorTime+"</td>"+"<td class='user-edit'>"+"<a href='add-news.html'  class='glyphicon glyphicon-edit '></a><a href='news-detail.html'  class='glyphicon glyphicon-eye-open '></a><span class='glyphicon glyphicon-remove' data-toggle='modal' data-target='#myModal'></span><span class='glyphicon glyphicon-share'></span>"+"</td>"+"</tr>";
                $("#show_list").html(newsListHtml);
            });
            alert(newsListHtml);
        }
    });
});

