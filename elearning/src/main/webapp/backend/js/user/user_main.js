
$(function(){
	$('.del-btn').click(function(){
		var id = $(this).data('id');
		var account = $(this).data('account');
		$('#del-modal .modal-body .message').text("确定要删除"+account+"用户吗!");
		$('#del-modal .modal-footer .ok-btn').data("id",id);
		$('#del-modal').modal('show');
	});
	$('#del-modal .modal-footer .ok-btn').click(function(){
		window.location.href='userDel?id='+$(this).data('id');
	});
})
