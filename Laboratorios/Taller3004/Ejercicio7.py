#Programa que de por pantalla el total de la venta sin IVA , con IVA , y el valor del IVA 
#Definir variables, contadores
mas = "true"
suma = 0
total = 0
totalIVA = 0
#Procesos
while mas == "true":
    nombreProducto = str(input("Ingrese el nombre del producto = "))
    producto = float(input("Ingrese el valor del producto = $ "))
    suma = suma + producto
    total = suma
    totalIVA = (total * 0.19) + total
    mas = str(input("¿Quieres ingresar más productos?, true o false = "))
    print()
#Imprimir
print("El total original de la compra es = " + str(total)  + "\n")
print("El valor del IVA = 19%" + "\n")
print("El valor total de la compra con IVA es = " + str(totalIVA) + "\n")