
apiclient = (function() {

	return {

	getWeather :function (city) {
	    axios.get('/wheather/' + city).then(function (response) {
	        var texto = document.getElementById("clima");
	        texto.innerHTML = "";
	        for (datos in response.data) {
	            if (datos == "main") {
	                for (datos1 in response.data[datos]) {
	                	texto = document.getElementById("clima");
	                    var fila = document.createElement("tr");
	                    fila.setAttribute("class", "lead text-muted");
	                    fila.innerHTML = datos1 + ": " + response.data[datos][datos1];
	                    texto.appendChild(fila);
	                    console.log(response.data[datos][datos1]);
	                }
	            }
	        }
	    }).catch(function (error) {
	        console.log(error);
	        alert("error");
	    });
	}
	}

})();
