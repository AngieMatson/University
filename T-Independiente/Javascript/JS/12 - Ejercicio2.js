'use strict'
/*
Usar bucle, mostrar media y suma de los números ingresados hasta que que deos un número negativo
*/
var suma = 0;
var contador = 0;
do{
    var numero = parseInt(prompt("Ingresa números hasta que ingreses uno negativo",0));

    if (isNaN(numero)){ //Si el valor no es un número
        numero = 0;

    }else if(numero >= 0){
        suma =  suma + numero;
        contador ++; 
    }
    console.log(suma);
    console.log(contador);
} while(numero >= 0) //Sólo si se cumple aquella condición se sigue ejecutando

alert("La suma de todos los números es = " + suma);
alert("El promedio de todos los números es = " + (suma / contador));