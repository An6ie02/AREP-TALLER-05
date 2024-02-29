function loadGetMsg1() {
    let number = document.getElementById("valueSen").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("getrespmsg1").innerHTML = this.responseText;
    }
    xhttp.open("GET", "/sin?value=" + number);
    xhttp.send();
}

function loadGetMsg2() {
    let number = document.getElementById("valueCos").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("getrespmsg2").innerHTML = this.responseText;
    }
    xhttp.open("GET", "/cos?value=" + number);
    xhttp.send();
}

function loadGetMsg3() {
    let number = document.getElementById("valuePal").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("getrespmsg3").innerHTML = this.responseText;
    }
    xhttp.open("GET", "/palindrome?value=" + number);
    xhttp.send();
}

function loadGetMsg4() {
    let number1 = document.getElementById("value1").value;
    let number2 = document.getElementById("value2").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        document.getElementById("getrespmsg4").innerHTML = this.responseText;
    }
    xhttp.open("GET", "/magnitude?value1=" + number1 + "&value2=" + number2);
    xhttp.send();
}