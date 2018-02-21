/**
 * 
 */
function addProduct(){
	var productName=$("#productName").val();
	var stock = $("#stock").val();
	var price = $("#price").val();
	var category = $("#category").val();
	var description=$("#description").val();
	
	
	$("#productNameError").html('');
	$("#stockError").html('');
	$("#priceError").html('');
	$("#categoryError").html('');
	$("#descriptionError").html('');
	
	var validated=validateProduct(productName,stock,price,category,description);
	if(!validated){
		return;
	}
	
	var xmlNode = '<product>';
	xmlNode+='<productName>'+productName+'</productName>';
	xmlNode+='<price>'+price+'</price>';
	xmlNode+='<currentStock>'+stock+'</currentStock>';
	xmlNode+='<remarks>'+description+'</remarks>';
	xmlNode+='<category>'+category+'</category>';
	xmlNode+='</product>';
	
	
	$.ajax({
		url : "webapi/product/",
		type:'POST',
		data:xmlNode,
		contentType : 'application/xml',
		success : function(result) {
			window.location.href='seller?message=Product Succesfully Added';
		}
	});
}
function validateProduct(productName,stock,price,category,description){
	var validated=true;
	if(productName.trim()==""){
		validated=false;
		$("#productNameError").html('Enter Proper Product Name');
	}
	if(stock.trim()==""|| isNaN(stock)){
		validated=false;
		$("#stockError").html('Enter Number of stock of the product avalaible');
	}
	if(price.trim()==""|| isNaN(price)){
		validated=false;
		$("#priceError").html('Enter the price of the product');
	}
	if(category.trim()==""){
		validated=false;
		$("#categoryError").html('Enter the category of the product');
	}
	if(description.trim()==""){
		validated=false;
		$("#descriptionError").html('Write something about the product');
	}
	return validated;
}


function cancel(){
	window.location.href='seller';
}