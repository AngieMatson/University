def sumaDigitos(numero): 
    suma=0
    while numero!=0:
        digito=numero%10
        suma=suma+digito
        numero=numero//10
    return suma
sumatoria=0
num=int(input("Ingrese el número a procesar, si desea dejar de ingresar datos escribir el 0: "))
while num!=0:
    print("La suma total es:",sumaDigitos(num))
    sumatoria=sumatoria+num
    num=int(input("Número a procesar: "))
print("La sumatoria es:", sumatoria)
print("Los dígitos son:", sumaDigitos(sumatoria))