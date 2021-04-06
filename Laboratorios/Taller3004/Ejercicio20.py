'''
Programa que dada una cantidad de dinero,
determine la menor cantidad de billetes de cada denominación que se puede entregar.
'''
# Definir variables, acumuladores
valor = 0
cien = 0
cincuenta = 0
veinte = 0
diez = 0
cinco = 0
mil = 0
#Proceso
valor = int(input("Ingrese la cantidad de dinero = "))
if valor >= 1:
    # Billete 100.000
    cien = int(valor / 100000)
    reserva = valor % 100000
    #Billete 50.000
    cincuenta = int(reserva / 50000)
    reserva = reserva % 50000
    #Billete 20.000
    veinte = int(reserva / 20000)
    reserva = reserva % 20000
    #Billete 10.000
    diez = int(reserva / 10000)
    reserva = reserva % 10000
    #Billete 5.000
    cinco = int(reserva / 5000)
    reserva = reserva % 5000
    #Billete 1.000
    mil = int(reserva / 1000)
    reserva = reserva % 1000
    #IMPRIMIR
    print("La cantidad mínima de cada billete son:")
    print(str(cien) + " de 100.000" + "\n"+ str(cincuenta) + " de 50.000" + "\n" + str(veinte) + " de 20.000" + "\n" + str(diez) + " de 10.000" + "\n" + str(cinco) + " de 5.000" + "\n" + str(mil)+ " de 1.000" )
else:
    print("La cantidad de billetes ingresados es incorrecta, no se permiten valores negativos.")