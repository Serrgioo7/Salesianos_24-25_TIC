#Un programa en el que el usuario tiene que adivinar
#el n�mero que el ordenador ha elegido al azar. El programa
#va respondiendo mayor o menor cuando el usuario le va
#proponiendo n�meros
import random
import time

def adivina():
    print("Voy a elegir al azar un n�mero del 1 al 10 y t� tienes que adivinarlo.")
    seguir=raw_input("�Est�s preparado (S/N)?")
    semilla=time.time()
 
adivina()

