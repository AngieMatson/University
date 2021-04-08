'use strict'
// Parámetros REST Y SPREAD
//Los tres puntos es para indicar el rest
function listadoFrutas(fruta1, fruta2, ...resto_de_frutas){
    console.log("Fruta 1 = " + fruta1);
    console.log("Fruta 2 = " + fruta2);
    console.log(resto_de_frutas);
}
listadoFrutas("Naranja", "Manzana", "Sandía","Melón", "Fresa");
// Otra forma de hacerlo    SPREAD
var frutas = ['Naranja','Manzana']
listadoFrutas(...frutas, "Sandía","Melón", "Fresa");