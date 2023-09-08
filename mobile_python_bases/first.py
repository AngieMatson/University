# Import the library
from kivy.app import App
from kivy.uix.label import Label

# Initialize the application
class Myapp(App): # The app My app hereda de App
    def build(self): # Se define el método build por defecto
        return Label(text="Hello World") # Se define lo que retornará el método

if __name__ == "__main__": # Se verifica si el script se ejecuta por el principal
    Myapp().run() 
