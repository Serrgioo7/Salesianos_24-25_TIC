
import random
import time

def juego_dado():
    semilla=time.time()
    random.seed(semilla)
    suma_jugador1=0
    suma_jugador2=0
    continuar='S'
    while(continuar=='S'):
        respuesta=raw_input("¿Quieres que tire el dado dado del JUGADOR 1(S/N)? ")
        tirada=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada))
        suma_jugador1=suma_jugador1+ tirada
        continuar=raw_input("¿Continúas jugando (S/N)? ")
        if(continuar=='S'):
            respuesta=raw_input("¿Quieres que tire el dado dado del JUGADOR 1(S/N)? ")
            tirada=int(1+(random.random()*10)%6)
            print("Ha salido un "+str(tirada))
            suma_jugador1=suma_jugador1+ tirada
            continuar=raw_input("¿Continúas jugando (S/N)? ")
        else:
            respuesta=raw_input("¿Quieres que tire el dado del JUGADOR 2(S/N)? ")
            tirada2=int(1+(random.random()*10)%6)
            print("Ha salido un "+str(tirada2))
            suma_jugador2=suma_jugador2+tirada2
        
            

        
        
    print("La suma del jugador 1 es -> "+str(suma_jugador1))
    print("La suma del jugador 2 es -> "+str(suma_jugador2))



    if (suma_jugador2==suma_jugador1):
        print("Han EMPATADO!!!")
    elif(suma_jugador2>suma_jugador1):
        print("El jugador 2 ha GANADO!!!")
    else:

        print("El jugador 1 ha GANADO!!!")

juego_dado()
