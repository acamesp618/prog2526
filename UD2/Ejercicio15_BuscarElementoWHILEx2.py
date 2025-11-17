def posicion (x, y):
    i = 0
    respuesta = -1
    while i < len(y) and respuesta == -1:
        if x == lista[i]:
            respuesta = i
        i += 1
    return (respuesta)

lista = [5,9,7,6,8,2,1,4,3,0]
n= int(input("Escribe un número: "))

print("El número se encuentra en la posición: ",posicion(n, lista))