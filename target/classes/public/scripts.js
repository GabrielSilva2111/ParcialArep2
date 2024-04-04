

//Scripts que me traen la información correspondiente del get en LinealSearch
 function loadGetLinealSearchMsg() {
    let nameVar = document.getElementById("linealSearch").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
           document.getElementById("getrespmsg").innerHTML =
           this.responseText;
    };
    xhttp.open("GET", "/linealSearch?value="+nameVar);
    xhttp.send();
}

//Scripts que me traen la información correspondiente del get en BynarySearch
 function loadGetBinarySearchMsg() {
    let nameVar = document.getElementById("BinarySearch").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
           document.getElementById("getrespmsg").innerHTML =
           this.responseText;
    };
    xhttp.open("GET", "/BinarySearch?value="+nameVar);
    xhttp.send();
}