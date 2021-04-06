#Programa que determine el IVA (19%) de una venta, si esta es mayor a 150.000 aplicar un descuento del 5%.
#Definir variables, acumuladores y lógicos
agregar = "si"
suma = 0
total = 0
totalIva = 0
totalIva2 = 0
#Proceso
while agregar == "si":
    valorProducto = int(input("Ingrese el valor del producto = "))
    if valorProducto > 0:
        if valorProducto >0:
            suma = suma + valorProducto
            total = suma
            totalIva = (suma * 0.19) + suma
            agregar = str(input("¿Quieres agregar más productos? si o no = "))
        if agregar == "no":
            print("El valor de su compra es = " + str(totalIva) + "\n")
        elif totalIva >=  150000:
            totalIva2 = totalIva - (totalIva * 0.05)
            print("El valor de su compra sin descuento es" + " " + str(totalIva) + " y " + "el valor totaal de la compra con el descuento del 5% es = " + str(totalIva2) + "\n")
    else:
        print("Valor incorrecto, no se permiten número negativos.")