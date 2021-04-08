'use strict'

// Parámetros en funciones

function calculadora(numero1, numero2){
    console.log("Suma = " + (numero1 + numero2));  
    console.log("Resta = " + (numero1 - numero2));
    console.log("Multiplicación = " + (numero1 *numero2));
    console.log("División = " + (numero1 /numero2));
    console.log("------------------------------------------");
}
// Parámetros para que la función varíe
calculadora(2,4);
calculadora(18,4);

// Funciones con bucles

for( var i = 1; i <=10 ; i++){
    console.log(i);
    calculadora(i, 5);
}
