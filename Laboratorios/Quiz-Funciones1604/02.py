def sumaDigitos(numero):
    suma=0
    while numero!=0:
        digito=numero%10
        suma=suma+digito
        numero=numero//10
    return suma
num=int(input("Ingrese el número a procesar, si desea dejar de ingresar datos escribir el 0: "))
while num!=0:
    print("La suma total es:",sumaDigitos(num))
    num=int(input("Ingrese el número a procesar, si desea dejar de ingresar datos escribir el 0: "))