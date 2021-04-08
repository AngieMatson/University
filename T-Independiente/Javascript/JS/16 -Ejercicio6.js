'use strict'
/*
Mostrar que un número es par o impar, 
1. ventana prompt
2. Si no es válido que pida de nuevo el número  
*/
// Definir la variable
var numero = parseInt(prompt("Ingrese un número = ", 0));
// Bucle con condiciones
while(isNaN(numero)){
    numero = parseInt(prompt("Ingrese un número = ", 0));
}

if(numero % 2 == 0){
    alert("El número " + numero + " es par");  
     
} else if (numero % 2 != 0){
    alert("El número " + numero + " es impar");
    }
