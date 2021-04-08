'use strict'
/*
    Mostrar todos los números impares que hay entre dos números ingresados por el usuario 
*/
var n1 = parseInt(prompt("Ingrese el primer número", 0));
var n2 = parseInt(prompt("Ingrese el segundo número", 0));

while(n1 < n2){
    n1 ++; //para que llegue hasta n2
    if(n1 % 2 != 0){
        console.log("El " + n1 + " es impar") //Mostrar todo los números impares en el rango
    }
}
