def factores_primos():
    #Leo un n�mero
    numero=int(input("Deme un n�mero: "))      
    cont=2
    while(cont<=numero):
        if(numero%cont==0):
            print(str(cont))
            numero=numero/cont
        else:
            cont=cont+1


factores_primos()
