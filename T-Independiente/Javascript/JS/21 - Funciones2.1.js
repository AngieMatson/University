'use strict'
// Parámetros opcionales
// Son parámetros que  ya vienen inicializados y luego los pasamos
function calculadora(numero1, numero2, mostrar = false){
    if ( mostrar == false){
        console.log("Suma = " + (numero1 + numero2));  
        console.log("Resta = " + (numero1 - numero2));
        console.log("Multiplicación = " + (numero1 *numero2));
        console.log("División = " + (numero1 /numero2));
    }else{
        document.write("Suma = " + (numero1 + numero2) + "</br>");
        document.write("Resta = " + (numero1 - numero2)+ " </br>");
        document.write("Multiplicación = " + (numero1 *numero2)+ " </br>");
        document.write("División = " + (numero1 /numero2)+ " </br>");
    }
}
calculadora(2, 5, false);