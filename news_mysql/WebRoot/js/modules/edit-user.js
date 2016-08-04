$(function(){
	/**页面加载时查询全部用户**/
	queryUser();
	/**
	 * @decription：调用增加用户
	 * @author：zhuangjf
	 * @param：#add-user模态窗中保存按钮
	 */
	$(function(){
		 $("#add-user").click(function(){		    
			 var params ="yhxm="+$("#yhxm").val() 
         	+ "&yhxb="+ $("#yhxb").val() 
         	+ "&yhyx="+ $("#yhyx").val() 
         	+ "&password=" + $("#password").val()
         	+"&yhzh="+$("#yhzh").val();
		 $.ajax({
		     url:"system/addSysUser.shtml",
		     type:"POST",
		     data:params,
		     error:function(XMLHttpRequest, textStatus, errorThrown){
		     if(XMLHttpRequest.responseText=="loginError"){
		    	 window.location.href="login.html";
		      	}
		     },
		     success:function(){
		    	 window.location.href="user.html";
		     }
		        });
		    });
	});
	/**
	 * @decription:调用登出方法
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
})
/*****************独立方法*********************/
/**查询全部用户**/
function queryUser(){
    $.ajax({
        type:"POST",
        url:"system/querySysUser.shtml",
        dataType:"json",
        error:function(XMLHttpRequest, textStatus, errorThrown){
        	if(XMLHttpRequest.responseText=="loginError"){
        		window.location.href="login.html";
        	}
        },
        success:function(data){
            var userList=data.userList;           
            var userListHtml="<tr><th><input id='checked-all' type='checkbox'><label>全选</label></th><th>账&nbsp;&nbsp;号</th><th>姓&nbsp;&nbsp;名</th><th>性&nbsp;&nbsp;别</th><th>邮&nbsp;&nbsp;箱</th><th>密&nbsp;&nbsp;码</th><th>操&nbsp;&nbsp;作</th></tr>";
            $.each(userList,function(i,n){
            	i+=1;
            	userListHtml=userListHtml+"<tr><td class='list-id'><input type='checkbox'><label>"
            	+i+"</label></td><td><span>"
            	+n.yhzh+"</span><input type='text' class='e_yhzh'></td><td><span>"
            	+n.yhxm+"</span><input type='text'  class='e_yhxm'></td><td><span>"
            	+n.yhxb+"</span><input type='text'  class='e_yhxb' ></td><td><span>"
            	+n.yhyx+"</span><input type='text'  class='e_yhyx'></td><td><span>"
            	+n.password+"</span><input type='text' class='e_password'></td><td class='user-edit'><a  class='glyphicon glyphicon-edit user_edit' data-id='"
            	+n.yhId+"'></a><a class='glyphicon glyphicon-ok update-news'  data-id='"
            	+n.yhId+"'></a><span class='glyphicon glyphicon-remove del-user' data-id='"
            	+n.yhId+"'>";
            });
            $("#show_uesr_list").html(userListHtml);
            $(".del-user").click(function(){
            	delUser($(this).attr("data-id"));
            });   
            $(".update-news").click(function(){           	
            	var yhId=$(this).attr("data-id");
            	var yhxm=$(this).parent().siblings().children(".e_yhxm").val();
            	var yhxb=$(this).parent().siblings().children(".e_yhxb").val();
            	var yhyx= $(this).parent().siblings().children(".e_yhyx").val();
            	var password=$(this).parent().siblings().children(".e_password").val();
            	var yhzh=$(this).parent().siblings().children(".e_yhzh").val();            	
            	updateUser(yhId,yhxm,yhxb,yhyx,yhzh,password);
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
           
               
        }
    });
}
/**
 * @decription：更新用户
 * @author zhuangjf
 * @param yhId 用户id
 * @param yhxm 用户姓名	
 * @param yhxb 用户性别
 * @param yhyx 用户邮箱
 * @param yhzh 用户账户
 * @param password 用户密码
 */
	function updateUser(yhId,yhxm,yhxb,yhyx,yhzh,password){
		var params ="yhxm="+yhxm 
            	+ "&yhxb="+yhxb 
            	+ "&yhyx="+yhyx
            	+ "&password=" +password
            	+"&yhzh="+yhzh
            	+"&yhId="+yhId;
		$.ajax({
			type : "POST",
			dataType : "json",
			url : 'system/updateSysUser.shtml',
			data : params,
			error:function(XMLHttpRequest, textStatus, errorThrown){
				if(XMLHttpRequest.responseText=="loginError"){
					window.location.href="login.html";
				}
			},
			success : function(data) {
				queryUser();
			}
		});     
}
/**
 * @decription:删除用户
 * @author zhuangjf
 * @param yhId 用户id
 */
function delUser(yhId){
    var param="yhId="+yhId;
    $.ajax({
        type:"POST",
        dataType:"json",
        url:"system/delSysUser.shtml",
        data:param,
        error:function(XMLHttpRequest, textStatus, errorThrown){
        	if(XMLHttpRequest.responseText=="loginError"){
        		window.location.href="login.html";
        	}
        },
        success:function(){
        	queryUser();
        }
    });
}