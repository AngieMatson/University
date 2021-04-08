'use strict'
/* Calculadora:
1.Pida 2 números pon pantalla.
2, Si ingresamos mla un número que lo vuelva a solicitar.
3. En el cuerpo de la página, en una alerta  y por la consola el resultado de
sumar, restar, multiplicar y dividir esas dos cifras.
*/
var numero1 = parseInt(prompt("Ingresa el primer número = ", 0));
var numero2 = parseInt(prompt("Ingresa el segundo número = ", 0));

while (numero1 <= 0 || numero2 <= 0 || isNaN(numero1) || isNaN(numero2)){
    var numero1 = parseInt(prompt("Ingresa el primer número = ", 0));
    var numero2 = parseInt(prompt("Ingresa el segundo número = ", 0));    
}

var resultado = "El resultado de la suma es = "+(numero1 + numero2)+" </br>" + 
                "El resultado de la resta es = "+(numero1 - numero2)+" </br>" + 
                "El resultado de la multiplicación es = "+(numero1 * numero2)+" </br>" +
                "El resultado de la divisón es = "+(numero1 / numero2)+" </br>";
//Saltos de línea en consola y alerta son con \n 
var resultadoCMD =  "El resultado de la suma es = "+(numero1 + numero2)+" \n " + 
                    "El resultado de la resta es = "+(numero1 - numero2)+" \n " + 
                    "El resultado de la multiplicación es = "+(numero1 * numero2)+" \n " +
                    "El resultado de la divisón es = "+(numero1 / numero2)+" \n ";
document.write(resultado);
alert(resultadoCMD);
console.log(resultadoCMD);