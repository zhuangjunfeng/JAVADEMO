$(function(){
	$(function(){
		$("#login").click(function(){
			var params ="yhzh="+$("#yhzh").val()
					+"&password="+$("#password").val();
//			alert(params);
			$.ajax({
					url:"system/login.shtml",
		            type:"POST",
		            data:params,
		            success:function(){
		            window.location.href="news.html";
		           }
	});
});
});
});