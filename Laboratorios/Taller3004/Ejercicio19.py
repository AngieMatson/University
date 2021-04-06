'''
Programa que dada una cantidad de segundos indique cuántos horas minutos y segundos representan. 
Por ejemplo si el valor es 86399, imprimirá el siguiente resultado -->  23:59:59
'''
#Definir variables y constantes
valor = int(input("Ingrese el valor que desea convertir = "))
segundosHora = 3600
segundosMinutos = 60
#Proceso
hora = int(valor / segundosHora)
minutos = int((valor - (hora*segundosHora)) / 60)
segundos = valor - ((hora * 3600) + (minutos*60))

print("La hora exacta es = " + str(hora) + ":" + str(minutos) + ":" + str(segundos))
