'''
Programa que lea las cinco notas obtenidas por un estudiante y calcule su nota final, 
sabiendo que las cada nota tiene el siguiente valor: n1 (15%), n2 (20%), n3 (15%), n4 (30%), n5 (20%).
Si la nota obtenida es menor a 2,0 deberá indicarle al estudiante que no puede habilitar, 
si la nota obtenida es menor a 3 deberá indicar que reprobó,
si la nota es mayor o igual a 3 deberá indicar que aprobó y si es mayor a 4,5 extenderá un mensaje de felicitación al estudiante.
'''
#Definir variables, constantes, acumuladores y lógicos
contador = 1
promedio = 0
p1 = 0.15
p2 = 0.2
p3 = 0.15
p4 = 0.3
p5 = 0.2
while contador <= 5 :
    nota = float(input("Ingrese la nota" + " " + str(contador) + " = "))
    if (nota >= 0) and ( nota <= 5):
        if contador == 1:
            promedio = promedio +(nota * p1)
        if contador == 2:
            promedio = promedio + (nota * p2)
        if contador == 3:
            promedio = promedio + (nota * p3)
        if contador == 4:
            promedio = promedio + (nota * p4)
        if contador == 5:
            promedio = promedio + (nota * p5)
        contador += 1
if promedio < 2.0:
    print("Su promedio es de = " + str(promedio) + ", por esa razón NO puede habilitar.") 
else:
    if promedio < 3:
        print("Su promedio es de = " + str(promedio) + ", por esa razón Reprobó :c.")
    else:
        if (promedio >= 3) and (promedio <= 4.5) :
            print("Su promedio es de = " + str(promedio) + ", por esa razón ¡Aprobó!.")
        else:
            if promedio > 4.5:
                print("Su promedio es de = " + str(promedio) + ", por esa razón... ¡Aprobó! Felicitaciones... Never Give Up! :D")