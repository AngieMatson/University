# Programa que dada una cantidad de segundos indique cuántos minutos representan
#Variables y constantes
segundos = float(input("Ingrese la cantidad de segundos que desea convertir = "))
segundosMinuto = 60.0
#Procesos
minutos = segundos / segundosMinuto
print("Los minutos correspondientes al valor ingresado son = " + str(minutos) + " minutos")