$("document").ready(function(){
	$("#buyer").click(function(){
		window.location.href="buyer";
	})
	
	$.get({
			url : "webapi/product/",
			contentType : 'application/xml',
			success : function(result) {
				populateResult(result);
			}
		});
	
	function populateResult(result) {
		var products = result.getElementsByTagName('product');
		if (products.length == 0) {
			$("#noItem").show();
			return;
		}
		
		$("#resultTable").show();
		$("#tableBody").empty();
		var row;
		for(var index=0; index<products.length;index++){
			var product=products[index];
			var productId=product.getElementsByTagName('productId')[0].innerHTML;
			var productName = product.getElementsByTagName('productName')[0].innerHTML;
			var price = product.getElementsByTagName('price')[0].innerHTML;
			var currentStock = product.getElementsByTagName('currentStock')[0].innerHTML;
			var remarks = product.getElementsByTagName('remarks')[0].innerHTML;
			row += '<tr><td>' + productName + '</td><td>' + currentStock + '</td><td>' + price + '</td><td>'+remarks+'</td><td><button class="btn btn-primary" onClick="editProduct('+productId+')" value='+productId+'>Edit</button>'+'</td></tr>';
		}
		$("#tableBody").append(row);
		return;
	}
	
	$("#add").click(function(){
		window.location.href="add";
	})
});

function editProduct(productId){
	window.location.href='edit?productId='+productId;
}

