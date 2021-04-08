'use strict'

//Tabla de multuplicar de un número introducido por pantalla

var numb = parseInt(prompt('¿De qué número quieres la tabla?', 1))

document.write("<h1> Tabla del "+ numb + "</h1>");
for (var i = 1; i <= 10; i++){
    document.write(i + "x" + numb + " = " + (i*numb) + "<br/>");
}

// Todas las tablas de multiplicar 
for (var c = 1; c <= 10; c++){
        document.write("<h1> Tabla del "+ c + "</h1>");
    for (var i = 1; i <= 10; i++){
        document.write(i + "x" + c + " = " + (i*c) + "<br/>");
    }
}       