function idInput(p){
//	console.log($($(p).parent().prev().prev()[0]).html())
	$("#idInput").val($($(p).parent().parent().children()[0]).html());
}

function nameInput(p){
	$("#nameInput").val($($(p).parent().parent().children()[1]).html());
	$("#updateClassifyForm").attr("action",$("#updateClassifyForm").attr("action")+$($(p).parent().parent().children()[0]).html())
}
