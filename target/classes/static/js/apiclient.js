apiclient = (function() {
	return {
		getWeather : function(city, callback) {		
			$.get("wheather/" + city, function(data) {
				callback(data);
			});

		},
		error : function() {
//			$('body').showMessage({thisMessage: ['Hey! Something bit me!']});
			alert("There was an error. Try again please!");
		}
	}

})();

