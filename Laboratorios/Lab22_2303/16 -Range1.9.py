c = 0 #Se inicializa la variable en 0 para que acumule
for i in range(1000): #Se utiliza el for para darle a la variable i un rango de 1000,siendo 1000 exclusivo
    ultimo_digito = (i ** 3) % 10 #Se define una nueva variable que almacena una operación para ver cuáles número naturales menores 1000 tiene un cubo terminado en 7
    if ultimo_digito == 7: 
        c = c + 1 #Si el residuo de la operación anterior es igual a 7 se le suma al contador un 1, contando cada número natural
print(c) #Se imprime por pantalla la cantidad de números que hay en el contador
