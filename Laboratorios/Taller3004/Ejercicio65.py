matriz = [[1,2,4], [8,9,7], [10,15,90], [21,100,-3]]
matriz2 = [[9,18,15], [81,12,21], [10,15,21], [1,0,5]]
#Matriz 1
print("MATRIZ 1 = ")
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        print(matriz[i][j], end="\t")
    print("")
#Matriz 2
print("MATRIZ 2 = ")
for i in range(len(matriz2)):
    for j in range(len(matriz2[i])):
        print(matriz2[i][j], end="\t")
    print("")
#Resultado de la suma
print("RESULTADO =")
for i in range(len(matriz)):
    for j in range(len(matriz2[i])):
        valor = matriz[i][j] + matriz2[i][j]
        print(valor, end="\t")
    print("")