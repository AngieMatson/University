contar = 1
contar2 = 0
total =  0 
notas = int(input("¿Cuántas notas deseas ingresar? = "))
while contar <= notas:
    grado = int(input("Ingrese la nota = "))
    total = total + grado
    contar += 1
    contar2 +=1
promedio = total / contar2
print ("Promedio de notas del grado escolar: " + str(promedio))