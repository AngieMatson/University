'''
Programa que determine el valor de un pasaje en avión, conociendo la distancia a recorrer, el número de días de estancia,
y sabiendo que, si la distancia a recorrer es superior a 1000 Km y el número de días de estancia es superior a 7, 
la línea aérea le hace un descuento del 15%. (el precio por km. es de $5.000 aunque el mínimo a cobrar siempre es $100.000).
'''
#Definir variables
distancia = int(input("Ingrese la distancia que se recorrió = "))
dias = int(input("Ingrese el número de días de estancia = "))
km = 5000 #Mínimo a cobrar 100.000
#Procesos
total = (distancia * 5000)
if (distancia < 1000) and (dias < 7):
    print("El valor del pasaje es = $" + str(total) + " " + "y su estancia fue de" + " " + str(dias) +  " " + "días")
else:
    if (distancia > 1000) and (dias > 7):
        total = total - (total * 0.15)
        print("Le valor del pasa es = $" + str(total) + " (con descuento del 15%) " +  "y su estancia fue de" + " " + str(dias) + " " + "dias.")
