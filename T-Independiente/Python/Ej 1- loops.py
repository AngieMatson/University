#Programa --> Hallar la cantidad de números ingresados, la suma total y el promedio

cantidad = 0
acum = 0
dato = int(input("Ingrese un número = "))
#Repetir
while dato != 0:
    dato = int(input("Ingrese otro número o escriba 0 para terminar = "))
    acum+=dato
    cantidad = cantidad + 1
    prom = acum/cantidad

print("La cantidad de números ingresados son = ", cantidad)
print("La suma total de datos es = ", acum)
print("El promedio es = ", prom)