

// Función para obtener la respuesta de la búsqueda lineal
function loadLinealSearch() {
    let list = document.getElementById("linealList").value;
    let value = document.getElementById("linealvalue").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("response").innerHTML = this.responseText;
    };
    xhttp.open("GET", "/linealSearch?list=" + list + "&value=" + value);
    xhttp.send();
}

// Función para obtener la respuesta de la búsqueda binaria
function loadBinarySearch() {
    let list = document.getElementById("binaryList").value;
    let value = document.getElementById("binaryValue").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("response").innerHTML = this.responseText;
    };
    xhttp.open("GET", "/binarySearch?list=" + list + "&value=" + value);
    xhttp.send();
}
