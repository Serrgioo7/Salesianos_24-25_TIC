
import random
import time

def dado():
    semilla=time.time()
    random.seed(semilla)
    suma_jugador1=0
    suma_jugador2=0
    for cont in range(1,2):
        respuesta=raw_input("¿Quieres que tire el dado dado del JUGADOR 1(S/N)? ")
        tirada=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada))
        
        respuesta=raw_input("¿Quieres que tire un dado del JUGADOR 2(S/N)? ")
        tirada2=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada2))
        
        respuesta=raw_input("¿Quieres que tire un dado del JUGADOR 1(S/N)? ")
        tirada=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada))
        
        respuesta=raw_input("¿Quieres que tire un dado del JUGADOR 2(S/N)? ")
        tirada2=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada2))

        respuesta=raw_input("¿Quieres que tire un dado del JUGADOR 1(S/N)? ")
        tirada=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada))

        respuesta=raw_input("¿Quieres que tire un dado del JUGADOR 2(S/N)? ")
        tirada2=int(1+(random.random()*10)%6)
        print("Ha salido un "+str(tirada2))
        
        suma_jugador1=suma_jugador1+ tirada
        suma_jugador2=suma_jugador2+tirada2

        
        
    print("La suma del jugador 1 es -> "+str(suma_jugador1))
    print("La suma del jugador 2 es -> "+str(suma_jugador2))



    if (suma_jugador2>suma_jugador1):
        print("El jugador 2 ha GANADO!!!")
    else:

        
        print("El jugador 1 ha GANADO!!!")

dado()
