$(function(){
//    点击全选按钮，选择所有信息
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


// //    点击编辑按钮，显示输入框，获取当前值
//     var o_edit=document.getElementsByClassName("glyphicon-edit");
//     var o_ok=document.getElementsByClassName("glyphicon-ok");
//     //第点击编辑按钮
//     $(o_edit).click(function(){
//         //切换icon
//         $(this).hide();
//         $(this).next(".glyphicon-ok").show();
//         //替换内容
//         $(this).parent().siblings().children("input").show();//显示input
//         var o_input=$(this).parent().siblings().not(".list-id").children("input");//获取input对象
//         var o_span=$(this).parent().siblings().not(".list-id").children("span");//获取span对象
//         /*
//         * 循环赋值给input
//         * */
//         for(var x=0;x<o_span.length;x++){
//             var o_val=new Array();                              //o_val 存储span的html
//              o_val[x]=$(o_span[x]).html();
//             $(o_input[x]).val(o_val[x]);
//         }

//         $(this).parent().siblings().not(".list-id").children("span").html("");

//     })
//     //点击OK按钮
//     $(o_ok).click(function(){
//         $(this).hide();
//         $(this).prev(".glyphicon-edit").show();

//         var o_input=$(this).parent().siblings().not(".list-id").children("input");//获取input对象
//         var o_span=$(this).parent().siblings().not(".list-id").children("span");//获取span对象
//         /*
//          * 循环赋值给input
//          * */
//         for(var x=0;x<o_input.length;x++){
//             var o_val=new Array();                              //o_val 存储span的html
//             o_val[x]=$(o_input[x]).val();
//             $(o_span[x]).html(o_val[x]);
//         }
//         $(this).parent().siblings().not(".list-id").children("input").hide();//隐藏input
//     })

})
