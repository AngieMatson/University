nota1 = float(input("Ingrese la primera nota = "))
nota2 = float(input("Ingrese la segunda nota = "))
nota3 = float(input("Ingrese la tercera nota = "))
nota4 = float(input("Ingrese la cuarta nota  = "))
nota5 = float(input("Ingrese la quinta nota  = "))
Agregar = "no"
while Agregar:
    if nota1 and nota2 and nota3 and nota4 and nota5 < 0.0:
        print("No hay valores menores a 0")
        break
    if nota1 and nota2 and nota3 and nota4 and nota5 > 5.0:
        print("No hay valores mayores a 5")
        break
    definitiva = (nota1*0.15) + ( nota2*0.15) + (nota3*0.2) + (nota4*0.2) + (nota5*0.3)
    print(definitiva)
    if definitiva >= 3:
        print("Aprobó")
    else:
        print("No aprobó")
    Agregar = input("Si quiere agregar más notas decir True si no decir False = ")
    if Agregar == "no":
        break
    else:
        nota1 = float(input("Ingrese la primera nota = "))
        nota2 = float(input("Ingrese la segunda nota = "))
        nota3 = float(input("Ingrese la tercera nota = "))
        nota4 = float(input("Ingrese la cuarta nota  = "))
        nota5 = float(input("Ingrese la quinta nota  = "))

