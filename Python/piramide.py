#Este programa dibuja un cuadrado de las dimensiones que el usuario desee
def cuadrado():
  n_filas=int(input("De qu� tama�o quieres el cuadrado (1-10)"))
#Esto es un bucle anidado (nested)
  for fila in range(1,n_filas+1):
    for col in range(1,n_filas+1):
      print("* ",)
    print("\n") #\n hace un salto de linea

cuadrado()
