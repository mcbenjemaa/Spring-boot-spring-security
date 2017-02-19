app.controller('usersController', function($scope,$http,$timeout) {
    $scope.headingTitle = "User List";
    $http.defaults.headers.common['Authorization'] = 'Basic YWRtaW46YWRtaW4=';
    $scope.users =[];
   
    
   
    var retrieveItems = function () {
        // get a list of items from the api located at '/api/items'
        $http.get('api/user/findall')
          .success(function (response) {
        	  $scope.users = response;

            // check for item changes
            $timeout(retrieveItems, 5000);
          }
        );
      };
      retrieveItems();

});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});