#Ejercicio1 - Rango del 0 a 9 
for i in range(10):
    print(i)

print()

#Ejercicio2 - Rango entre 100 y 199
for n in range(100,200,1):
    print(n)

print()

#Ejercicio3 - Rango de 5 inclusivo hasta 20 y que vaya de 3 en 3
for z in range(5, 20, 3):
    print(z)

print()

#Ejercicio4 - Rango con primer número ingresado y que llega hasta menos del doble del mismo
numb1= int(input("Ingrese un número = "))
for h in range(numb1, numb1*2):
    print(h)

print()

#Ejercicio 5 y 6 - Contar las vocales
frase = input("frase: ") 
print("Las vocales de la frase son: ")
for r in "aeiou":
    if r in frase:
        print(r)

print()

#Ejercicio 7 - Suma total 100
total = 0
for m in range(101):
    total += m

print("Suma total = ", total)

print()

#Ejercicio 8 - Año
año1 = int(input("Ingrese el primer año = "))
año2 =int(input("Ingrese el segundo año = "))

for a in range(año1, año2 + 1):
    if not a % 10 == 0:
        continue
    if not a % 4 == 0:
        continue
    if a % 100 != 0 or a % 400 == 0:
        print(a)

print()

#Ejercicio9 - Factorial
numero= int(input("Número:"))
fact=1
if numero!=0:
    for i in range(1,numero+1):
        fact=fact*i #
print("Factorial:", fact)

print()

#Ejercicio 10 - Sucesión de Fibonacci
n1 = 0
n2 = 1
print(n1)
print(n2)
for i in range(8):
    n3 = n1 + n2
    print(n3)
    n1 = n2
    n2 = n3
