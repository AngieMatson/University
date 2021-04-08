'use strict'
/* Funciones anónimas y callbacks
Es una función que no tiene nombre 
*/
var pelicula = function(nombre){
    return "La película es = " + nombre;
}
// Callback, ejecutar una función dentro de otra función
// Callback, es cuando el parámetro de una función  no es un valor o variable, sino una función 
function sumame(numero1, numero2, sumaYmuestra, sumaPorDos){
    var sumar =   numero1 + numero2;
    sumaYmuestra(sumar);
    sumaPorDos(sumar);
    return sumar;
}
// Funciones anónimas como callback
sumame(5,7, function(dato){
    console.log("La suma es = ", dato);
},
function(dato){
    console.log("La suma por dos es = ", (dato*2));

});