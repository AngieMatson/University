suma=0
materias = ["Matemáticas", "Física", "Química", "Historia", "Lenguaje"]#lista con las materias principales
lista = []#lista en la cual seran almacenados datos
for subject in materias: #for el cual sirve para sacar los pbjetod de la lista por orden y almacenarlos en subject
    score = input("¿Qué nota has sacado en " + subject + "? = ")
    suma=suma+int(score)# es un  acomulador
    lista.append(score)#agregar valores a la lista
for i in range(len(materias)):# sacar el indice(lista) de cada materia y poder sacarlas a pantalla mas adelante
    print(" - En " + materias[i] + " has sacado " + lista[i])#con el indice(lista) almacenado en i podemos sacar en pantalla cada materia
print("El promedio de todas sus notas es =", suma/5)