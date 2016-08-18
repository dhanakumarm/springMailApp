 
var app = angular.module('myApp', ['ngResource']);
var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/user/';

var REST_API_SERVICE_URI = 'http://localhost:8080/springsample/datafavorite/';

//Factory
app.factory('FavoriteFactory',function($http){
	
	return {
		fetchAllList:function(){
			return $http.get(REST_SERVICE_URI)
			.then(
					function(response){
						console.log(response);
						return response.data;
					}, 
					function(errResponse){
						console.error('Error while fetching users');
						return $q.reject(errResponse);
					}
			);
		},
		
		// get alll data favorite list
		fetchDataFavoriteList:function(){
			var res = $http.get(REST_API_SERVICE_URI+"getDataFavList");
			res.success(function(data, status, headers, config) {
				return data
			});
			/*res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});	*/
			
			return res;
			/* return $http.get(REST_API_SERVICE_URI+"getDataFavList")
			.then(
					function(response){
						console.log(response);
						return response.data;
					},
					function(errResponse){
						console.error("Error while fetching the data");
						return $q.reject(errResponse)
					}
			
			);*/
		}
	}
});



// controller
app.controller('FavoriteController',function($scope,FavoriteFactory){
	var self = this;
	self.users=[];
	self.dataFav=[];	
	
	self.fetchAllUsers = function(){
		FavoriteFactory.fetchAllList()
            .then(
					       function(d) {
					    	   self.users = d;
					       },
      					function(errResponse){
      						console.error('Error while fetching Currencies');
      					}
			       );
    };
    
    
    // get alll data favorite list
    self.fetchDataFavList = function(){
    	FavoriteFactory.fetchDataFavoriteList()
    	.success(function(res) {
    		self.dataFav = res;
        })
        .error(function(err) {
        	alert(err);
        });
    }
    
    
    self.calculatePsych = function(){
    	alert();
    }
    
//	$scope.headingTitle = FavoriteFactory.fetchAllList();
//  this.fetchAllUsers();
    this.fetchDataFavList();
});