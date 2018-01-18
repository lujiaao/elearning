function idInput(p) {
	//	console.log($($(p).parent().prev().prev()[0]).html())
	$("#idInput").val($($(p).parent().prev().prev()[0]).html());
}

function catItem(p) {


}


function catImg(p) {

}

function catStyle(p) {

}

function deleteItem(p) {
	$("#idInput").val($($(p).parent().parent().children()[0]).html());
}

function updateItem(p) {

	if ("是" == $($(p).parent().parent().children()[7]).html()) {
		$("#optionsRadios1").attr("checked", "checked");
	}

	$("#updateItemForm").attr("action", $("#updateItemForm").attr("action") + $($(p).parent().parent().children()[0]).html())
	$("#itemColor").val($($(p).parent().parent().children()[1]).html())
	$("#itemNo").val($($(p).parent().parent().children()[2]).html())
	$("#itemSize").val($($(p).parent().parent().children()[3]).html())
	$("#itemTexture").val($($(p).parent().parent().children()[4]).html())
	$("#itemPreviousPrice").val($($(p).parent().parent().children()[5]).html())
	$("#itemDiscountPrice").val($($(p).parent().parent().children()[6]).html())
	$("#itemRepertory").val($($(p).parent().parent().children()[8]).html())
}