#Creación cuenta
user = input("Ingrese el nombre de usuario que quiera usar para esta cuenta = ")
add = input("¿Desea Crear una contraseña segura? si o no = ")
if add == "si":
    #creacion de un cotraseña aleatoria
    import random #Importan la librería para generar números aleatorios
    lista=[]
    cond="si"
    numero=random.randint(1,100) #Generar números aleatorios.
    while cond=="si":
            cadena=input("Ingrese por favor una frase o letra para tu contraseña aleatoria = ")
            lista.append(cadena) #Se agrega a la lista predeterminada con el .append
            cond=input("¿Quieres ingresar otra frase o letra para tu contraseña? = ") 
    lisy= random.sample(lista,1) #Se genera de manera aleatoria.
    print("".join(lisy) + str(numero)) #Se retira los paréntesis 
else:
    password_new = input("Ingrese la contraseña = ")
#Validación de datos
user_Inicio = input("Ingrese su nombre de Usuario = ") 
password_Incion = input("Ingrese su contraseña = ")
if password_Incion == ("".join(lisy) + str(numero)) and user==user_Inicio: #Se determina una condición para así poder evaluar si los datos ingresados son iguales a los creados anteriorimente.
    print("Datos son correctos, será redirigido a la pantalla principal en pocos minutos.")
elif password_Incion== ("".join(lisy) + str(numero)) and user==user_Inicio:
    print("Datos son correctos, será redirigido a la pantalla principal en pocos minutos.")
else:
    print("Los datos son incorrectos.") 