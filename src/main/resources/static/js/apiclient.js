
apiclient = (function() {

	return {

	getWeather :function (city) {
	    axios.get('/wheather/' + city).then(function (response) {
	    	
	        var texto = document.getElementById("clima");
	        texto.innerHTML = "";
	        for (datos in response.data) {
	            if (datos == "main") {
	                for (datos1 in response.data[datos]) {
	                	$("#clima").find('tbody').empty();
	                	texto = document.getElementById("clima");
	                    var fila = document.createElement("td");
	                    
	                    fila.innerHTML = datos1 + ": " + response.data[datos][datos1];
	                    texto.appendChild(fila);
	                }
	            }
	        }
	    }).catch(function (error) {
	        alert("Ciudad no encotrada");


	    });
	}
	}

})();
