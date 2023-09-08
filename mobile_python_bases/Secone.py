import kivy
from kivy.app import App
from kivy.uix.label import Label
from kivy.uix.gridlayout import GridLayout
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
# Se importa Kivy y lo que se requiera

# Crear las clases de acuerdo a las importaciones; las clases heredan de las importaciones

class MyGridLayout(GridLayout):
    def __init__(self, **kwargs):