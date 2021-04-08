'use strict'    
/*
Programa que pida dos números y que nos diga cuál es mayor, menor o si son iguales
PLUS: Si los números no son un número que lo vuelva a pedir
*/
var n1 = parseInt(prompt("Ingresa el primer número", 0));
var n2 = parseInt(prompt("Ingresa el segundo número", 0));
console.log(n1, n2);

while(n1 <= 0 || n2 <= 0 || isNaN(n1) || isNaN(n2)){ // PLUS
    n1 = parseInt(prompt("Ingresa el primer número", 0)); //Prompt es para pedir números por parte del usuario 
    n2 = parseInt(prompt("Ingresa el segundo número", 0));
}

if(n1 > n2){
    alert("El número mayor es = " +  n1);
    alert("El número menor es =  " +  n2);
} else{
    if(n2 > n1){
        alert("El número mayor es = " + n2);
        alert("El número menor es = " + n1);
    }
} if(n1 == n2){
    alert("Son iguales");
}