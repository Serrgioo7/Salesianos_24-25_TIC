#Un programa en el que el usuario tiene que adivinar
#el número que el ordenador ha elegido al azar. El programa
#va respondiendo mayor o menor cuando el usuario le va
#proponiendo números
import random
import time

def adivina():
    print("Voy a elegir al azar un número del 1 al 10 y tú tienes que adivinarlo.")
    seguir=raw_input("¿Estás preparado (S/N)?")
    semilla=time.time()
    random.seed(semilla)
    numero=int(random.random()*10)%10+1
    print("NUMERO: "+str(numero))
    while(seguir=='S'):
        respuesta=input("¿Qué número he pensado? (1-10) ")
        if(respuesta<numero):
            print("MAYOR")
        if(respuesta>numero):
            print("MENOR")
        if(respuesta==numero):
            print("HAS ACERTADO")
            seguir='N'
    print("SE ACABÓ EL JUEGO")

adivina()
