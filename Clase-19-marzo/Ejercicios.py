#Ejercicio1
for i in range(10):
    print(i)

print()

#Ejercicio2
for n in range(100,200,1):
    print(n)

print()

#Ejercicio3
for z in range(5, 20, 3):
    print(z)

print()

#Ejercicio4
numb1= int(input("Ingrese un número = "))
for h in range(numb1, numb1*2):
    print(h)

print()

#Ejercicio 5 y 6
frase = input("frase: ")
print("Las vocales de la frase son: ")
for r in "aeiou":
    if r in frase:
        print(r)
print()


#Ejercicio 7
total = 0
for m in range(101):
    total += m

print("Suma total = ", total)

print()

#Ejercicio 8
año1 = int(input("Ingrese el primer año = "))
año2 =int(input("Ingrese el segundo año = "))

for a in range(año1, año2 + 1):
    if not a % 10 == 0:
        continue
    if not a % 4 == 0:
        continue
    if a % 100 != 0 or a % 400 == 0:
        print(a)

#Ejercicio9
