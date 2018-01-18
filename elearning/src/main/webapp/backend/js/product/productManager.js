function idInput(p){
//	console.log($($(p).parent().prev().prev()[0]).html())
	$("#idInput").val($($(p).parent().prev().prev()[0]).html());
}

function catItem(p){
	

}


function catImg(p){
	
}

function catStyle(p){
	
}

function deleteProduct(p){
	$("#idInput").val($($(p).parent().parent().children()[0]).html());
}

function updateProduct(p){
	$("#updateProductName").val($($(p).parent().parent().children()[1]).html())
	$("#updateDescription").val($($(p).parent().parent().children()[3]).html())
	$("#updateRepertory").val($($(p).parent().parent().children()[4]).html())
	
	for(var i=0;i<$("#classifys option").length;i++){
		if($($("#classifys option")[i]).val()==$($(p).parent().parent().children()[0]).html()){
			$($("#classifys option")[i]).attr("selected","selected");
		}
	}
	
	$("#updateProductForm").attr("action","ProductServlet?action=updateProduct&productId="+$($(p).parent().parent().children()[0]).html())
}
