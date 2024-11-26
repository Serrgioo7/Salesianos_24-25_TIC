def MCM():
    num1 = int(input("dime un numero"))
    num2 = int(input("dime otro numero"))
    num3 = int(input("dime otro numero mas"))
    result = num1 * num2 * num3
    mcm=result
    for cont in range(result,1,-1):
        if (cont % num1 == 0 and cont%num2 == 0 and cont%num3 == 0):
            mcm= cont
    print("el MCM de los tres numeros es: "+ str(mcm))
MCM()
