$(function(){
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
	            success:function(){
	            	window.location.href="news.html";
	            }
	        });
	    });
});