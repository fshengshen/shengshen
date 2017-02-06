 //返回formJSON
$.fn.formJSON = function(){
    var data = $(this).serializeArray(),
        serialize = {};
    $.each(data, function(i, item){
        serialize[item.name] = item.value;
    });
    return serialize;
}
// 多文件上傳
// $.fn.multFileUpload = function(fileuploadObj){
//     $(this).each(function(){
//             debugger
//         var $this = $(this),
//             $miniFuploadEl = $this.find('.mini-fileupload'),
//             $addFileBtn = $this.find(".add-file-btn");

//         var data = {};

//         //添加文件
//         $addFileBtn.click(function(){
//             debugger
//             fileuploadObj.startUpload();
//         });

//         //移除附件
//         $this.on('click', '.remove-file-item', function(){
            
//             var $this = $(this),
//                 $item = $this.closest('.file-item'),
//                 url = $item.data('url');
//         });


//     });
// }

$(function(){
    // 登陆超时统一处理
    $(document).ajaxComplete(function(event, request, settings){
        try{
            var json = $.parseJSON(request.responseText);
            if(json.code == -1){
                alert('登录超时，请重新登陆！');
                top.location.href = json.url;
            }
        }catch(e){}
    })/*.ajaxError(function(){

    });*/
});