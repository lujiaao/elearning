//$(function(){
//	function idInput(this){
//	console.log($($(this).parent().parent().prev().children().children()[0]).val())
////	$("#idInput").val()=$(this).parent().parent().prev().children().children()[0];
//}
//})



function idInput(p){
//	console.log($($(p).parent().prev().prev()[0]).html())
	$("#idInput").val($($(p).parent().parent().children()[0]).html());
}

function nameInput(p){
	$("#nameInput").val($($(p).parent().parent().children()[1]).html());
	console.log($("#updateCatelogForm").attr("action")+$($(p).parent().parent().children()[0]).html());
	$("#updateCatelogForm").attr("action","CatelogServlet?action=updateCatelog&catelogId="+$($(p).parent().parent().children()[0]).html())
}