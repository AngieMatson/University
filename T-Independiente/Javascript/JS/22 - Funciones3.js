'use strict'
// Funciones dentro de otras
//Función mostrar por consola
function porConsola(numero1, numero2){
    console.log("Suma = " + (numero1 + numero2));  
    console.log("Resta = " + (numero1 - numero2));
    console.log("Multiplicación = " + (numero1 *numero2));
    console.log("División = " + (numero1 /numero2));
    console.log("------------------------------------------")
}
// Función mostrar por pantalla
function porPantalla(numero1, numero2){
    document.write("Suma = " + (numero1 + numero2) + "</br>");
    document.write("Resta = " + (numero1 - numero2)+ " </br>");
    document.write("Multiplicación = " + (numero1 *numero2)+ " </br>");
    document.write("División = " + (numero1 /numero2)+ " </br>");
}
// Función almacena las dos funciones anteriores
function calculadora(numero1,numero2, mostrar = false){
    if(mostrar == false){
        porConsola(numero1,numero2);
    }else{
        porPantalla(numero1,numero2);
    }
    return true;
}
calculadora(56, 2, false);
calculadora(16, 4, true);