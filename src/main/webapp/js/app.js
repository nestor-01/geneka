(function () {
	var app = angular.module('store', []);
	app.controller('StoreController', function(){
		this.product = gem;
	});
	var gem = {
		name: 'name1',
		price:3.3,
		description: '...',
		canPurchase: true,
		soldOut: true
	}
})();