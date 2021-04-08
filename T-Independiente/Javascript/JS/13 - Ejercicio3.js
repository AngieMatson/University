'use strict'
/*
Hacer un programa que muestre todos los números que hay entre dos números que ingrese el usuario
*/
var n_inicial = parseInt(prompt("Ingrese el primer número",0));
var n_final = parseInt(prompt("Ingrese el segundo número", 0));

document.write("<h1> De " + n_inicial + " a " + n_final + " están estos números </h1>") //Título de rango
 // se define i para decir en qué puntoa arranca el rango
for(var i = n_inicial; i <= n_final; i++){
    document.write(i + "</br>"); 
    // </br> da saltos de línea entre los resultados
}