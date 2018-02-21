/**
 * 
 */
$("document").ready(function() {
	
	$("#priceLink").click(function() {
		$("#noItem").hide();
		$("#resultTable").hide();
		$("#category").hide();
		$("#priceRange").show();
		$("#categoryLink").removeClass("active");
		$("#priceLink").addClass("active");
	});

	$("#categoryLink").click(function() {
		$("#noItem").hide();
		$("#resultTable").hide();
		$("#category").show();
		$("#priceRange").hide();
		$("#categoryLink").addClass("active");
		$("#priceLink").removeClass("active");
	});

	$("#seller").click(function() {
		window.location.href = "loginPage";
	});

	$("#category-get").click(function() {
		var category = $("#categorySelect").val();
		getProductsByCategory(category);
	});


	function getProductsByCategory(category) {
		$("#noItem").hide();
		$("#resultTable").hide();
		$.get({
			url : "webapi/product/filter/" + category,
			contentType : 'application/json',
			success : function(result) {
				populateResult(result);
			}
		})
	}

	
	function populateResult(products) {
		if (products.length == 0) {
			$("#noItem").show();
			return;
		}
		$("#resultTable").show();
		$("#tableBody").empty();
		var row;
		products.forEach(function(data,index){
			if(data.currentStock!=0){
				row += '<tr><td>' + data.productName + '</td><td>' + data.currentStock + '</td><td>' + data.price + '</td><td>'+data.remarks+'</td><td><button class="btn btn-primary" onClick="buyProduct('+data.productId+')" value='+data.productId+'>Buy</button>'+'</td></tr>';
			}
		});
		$("#tableBody").append(row);
		return;
	}
	
	$("#price-get").click(function(){
		$("#emptyValue").hide();
		$("#noItem").hide();
		$("#resultTable").hide();
		var startValue=$("#startingPrice").val();
		var maxValue=$("#maxPrice").val();
		if(startValue.trim()=="" || maxValue.trim()==""){
			$("#emptyValue").show();
			return;
		}
		getProductsByPriceRange(startValue,maxValue);
		
	});
	
	function getProductsByPriceRange(startValue,maxValue){
			$("#noItem").hide();
			$("#resultTable").hide();
			$.get({
				url : "webapi/product/filter?startPrice=" + startValue+"&maxPrice="+maxValue,
				contentType : 'application/json',
				success : function(result) {
					populateResult(result);
				}
			})
	}
});

function buyProduct(productId){
	console.log("inside Buy product");
	$.ajax({
		url : "webapi/product/buy/"+productId,
		type:'PUT',
		contentType : 'application/json',
		success : function(result) {
			
		}
	});
}
