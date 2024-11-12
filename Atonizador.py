# -*- coding: cp1252 -*-
#Guardamos una palabra y la deletreamos

def usuario():
    nombre=raw_input("Nombre: ")
    Apelliado1=raw_input("Primer apellido: ")
    Apellido2=raw_input("Segundo apellido: ")
    Ano=raw_input("Año de nacimiento: ")
    usuario=apellido1[0:3]+apellido2[0:3]+nombre[0:3]+ano[2:4]
    print("USUARIO:" + usuario)

usuario()
