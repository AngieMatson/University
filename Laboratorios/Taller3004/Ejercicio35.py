'''
Programa que dado un usuario y una contraseña predefinida (por ejemplo usuario=”carlos" y contraseña=”1234”, 
le permita a un usuario digital su usuario y contraseña y
enviar un mensaje de inicio de sesión si lo digitado corresponde al usuario y contraseña predefinida.
'''
#Definir acumuladores y variables
nombre = 0
contra = 0
pregunta = input("¿Quieres registrarte? si o no = ")
if pregunta == "si": #Procesos - condicionales
    name = input("Ingrese un nombre de usuario = ")
    password = input("Ingrese una contraseña = ")
    print("Se ha registrado correctamente")
else:
    if pregunta == "no":
        print("Finish.")
entrar = "si"
while entrar == "si": #Procesos - Ciclo para pedir de nuevo los datos si son incorrectos
    entrar = input("¿Desea Iniciar Sesión? si o no = ")
    if entrar == "si":
        nombre = input(" Usuario = ")
        contra = input(" Contraseña = ")
        if (nombre == name) and (contra == password):
            print("Se ha iniciado exitosamente, en unos segundos será redirigido a la página principal.")
            break
        else:
            if nombre != name:
                print("Nombre Incorrecto.")
            else:
                if contra != password:
                    print("Contraseña incorrrecta.")
                else:
                    if (nombre != name) and (contra != password): 
                        print("Ambos datos ingresados son incorrectos.")
    else:
        print("Finish.")