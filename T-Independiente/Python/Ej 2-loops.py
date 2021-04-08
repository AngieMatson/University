#Mostrar cuál número es menor o mayor dependiendo del número y se detiene cuando se ingresa un valor negativo

mayor = 0
menor = 0
agregar = True
num = 1
numb = 0
while agregar:
    numb = int(input("Numero " + str(num) + " = "))
    if numb > 0: #Siendo 0 falso y mayor que 0 verdadero para continuar
        if numb > mayor:
            mayor = numb
        if numb < menor or num==1:
            menor = numb
        num += 1
    else:
        agregar== False
        break
print("El número mayor es = ", mayor)
print("El número menor es = ", menor)