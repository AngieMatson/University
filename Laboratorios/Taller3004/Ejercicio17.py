#Programa que dada una cantidad de segundos indique cuántas horas representan

#Definir varibles y constantes
segundos = float(input("Ingrese la cantidad de segundos que desea convertir = "))
segundosHora = 3600
#Procesos
hora = segundos / segundosHora
print("Las horas correspondientes al valor ingresado son = " + str(hora) + " horas")