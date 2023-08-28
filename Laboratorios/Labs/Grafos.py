A = int(input())
B = int(input())
vertices = int(input())
puntosGrafo = int(input())

vector = [[0 for j in range(B)] for i in range(A)]
Copia = [[0 for j in range(B)] for i in range(A)]
Aristas = [0 for i in range(vertices)]
Puntos = [0 for i in range(puntosGrafo)]
guardado = [0 for i in range(A)]

for i in range(A):
    for j in range(B):
        vector[i][j] = int(input())
        Copia[i][j] = vector[i][j]

salvacion = 0
comp = 0
FF = 0
PP = 0
QQ = 0
WW = 0

while True:
    Sumatoria = 0
    for i in range(A):
        for j in range(B):
            Sumatoria += Copia[i][j]

    if Sumatoria == 0:
        break

    for FF in range(A):
        Valor = Copia[comp][FF]
        if Valor == 1:
            Puntos[PP] = comp
            Aristas[QQ] = FF
            Copia[comp][FF] = 0
            salvacion = 1
            break

    for ZZ in range(B):
        valor = Copia[ZZ][FF]
        if valor == 1:
            guardado[WW] = ZZ
            WW += 1

    if salvacion == 1:
        comp = guardado[WW-1]
    else:
        WW += 1
        comp = guardado[WW-1]

    PP += 1
    QQ += 1

print("Recorrido completo :3")
