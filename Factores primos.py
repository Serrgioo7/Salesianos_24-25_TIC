def factores_primos():
    #Leo un número
    numero=int(input("Deme un número: "))      
    cont=2
    while(cont<=numero):
        if(numero%cont==0):
            print(str(cont))
            numero=numero/cont
        else:
            cont=cont+1


factores_primos()
