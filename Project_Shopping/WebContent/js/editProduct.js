/**
 * 
 */
$("document").ready(function(){
	
	$.get({
		url : "webapi/product/"+productId,
		contentType : 'application/xml',
		success : function(result) {
			addEditResult(result);
		}
	});
	
	function addEditResult(result){
		var product=result.getElementsByTagName('product')[0];
		var productName = product.getElementsByTagName('productName')[0].innerHTML;
		var price = product.getElementsByTagName('price')[0].innerHTML;
		var currentStock = product.getElementsByTagName('currentStock')[0].innerHTML;
		var remarks = product.getElementsByTagName('remarks')[0].innerHTML;
		var category = product.getElementsByTagName('category')[0].innerHTML;
		$("#productName").val(productName);
		$("#price").val(price);
		$("#description").val(remarks);
		$("#stock").val(currentStock);
		$("#category").val(category);
	}
	
	$("#back").click(function(){
		window.location.href='seller';
	})
});

function deleteProduct(){
	$.ajax({
		url : "webapi/product/"+productId,
		type:'DELETE',
		contentType : 'application/xml',
		success : function(result) {
			window.location.href='seller?message=Product Succesfully Deleted';
		}
	});
}

function updateProduct(){
	var productName=$("#productName").val();
	var price=$("#price").val();
	var remarks=$("#description").val();
	var stock=$("#stock").val();
	var category=$("#category").val();
	
	var xmlNode = '<product>';
	xmlNode+='<productName>'+productName+'</productName>';
	xmlNode+='<price>'+price+'</price>';
	xmlNode+='<currentStock>'+stock+'</currentStock>';
	xmlNode+='<remarks>'+remarks+'</remarks>';
	xmlNode+='<category>'+category+'</category>';
	xmlNode+='</product>';
	
	
	$.ajax({
		url : "webapi/product/"+productId,
		type:'PUT',
		data:xmlNode,
		contentType : 'application/xml',
		success : function(result) {
			window.location.href='seller?message=Product Succesfully Updated';
		}
	});
	
	
}

