$(function(){
	$(function(){
		/**
		 * @decription:登录方法
		 * @author：zhuangjf
		 */
		$("#login").click(function(){
			var params ="yhzh="+$("#yhzh").val()
					+"&password="+$("#password").val();
			$.ajax({
					url:"system/login.shtml",
		            type:"POST",
		            data:params,
		            success:function(data){
		            	 var types = data.msg;		            
		                    if (types!= "success") {
		                        alert(types);
		                    }
		                    else{
		                    window.location.href="news.html";
		                    }
		                },
		                error: function () {alert("用户名密码验证失败");
		            }
			});
		});
	});
});