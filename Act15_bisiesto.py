anno=int(input("Escribe un año:"))
#es bisiesto si cumple a la vez estas condiciones
#divisible por 4, no es divisible por 100 o si lo es por 400
if (anno % 4 == 0 and anno % 100 != 0) or (anno % 400 == 0):
    print ("El año", anno, "es bisiesto")
else:
    print ("El año", anno, "no es bisiesto")
