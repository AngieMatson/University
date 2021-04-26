A = int(input("¿Cuántos nombres de personas quieres ingresar? =  "))
B = []
C = []
x=0
y=0
for i in range (0,A): #Range agrega los nombres a la lista hasta el límite que se determina en la variable A.
 B.append(input("Ingresa el nombre de una persona a la que quieras agregrar a la lista = "))
print ("Estos son todos los nombres: " + ", ".join(B) + ":")
for j in range (0,A): #Range cuenta la cantidad de carácteres de cada valor ingresado determinado por la variable A.
 C.append(len(B[j]))
 print("  -  El nombre",B[x],"tiene",C[y],"letras.")
 x=x+1
 y=y+1