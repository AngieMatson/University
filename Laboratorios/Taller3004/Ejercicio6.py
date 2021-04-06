#Programa que calcule las notas de un estudiante
#Cada nota tiene un porcentaje difetente
rpta = "true"
while rpta == "true":
    #Se piden los valores
    nota1 = float(input("Ingrese el valor de la primera nota = "))
    nota2 = float(input("Ingrese el valor de la segunda nota = "))
    nota3 = float(input("Ingrese el valor de la tercera nota = "))
    nota4 = float(input("Ingrese el valor de la cuarta nota = "))
    nota5 = float(input("Ingrese el valor de la quinta nota = "))
    #Se establece una condición para que se ejecute apropiadamente 
    if (nota1 and nota2 and nota3 and nota4 and nota5 <= 5) and (nota1 and nota2 and nota3 and nota4 and nota5 >= 0):
        promedio = (nota1*0.15) + (nota2*0.2) + (nota3*0.15) + (nota4*0.3)+ (nota5*0.2) 
        print("El promedio de notas es = ", promedio)
        #Condición para determinar sí aprobó o perdió
        if promedio > 3:
            print("¡APROBÓ! :D ")
        else:
            print("PERDIÓ :c")
        rpta = str(input("¿Quieres ingresar más notas?, true or false = "))
    else:
        print("Lo números ingresados no son válidos, no se pueden ingresar números mayores a 5 o menores que 0. Vuelva a ingresar las notas.")
        continue
#IMPRIMIR
print("¡El programa se ha terminado de ejecutar con éxito!")
