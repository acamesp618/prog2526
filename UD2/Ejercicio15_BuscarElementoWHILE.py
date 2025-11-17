def posicion (x, y):
    i = 0
    while i < len(y):
        if x == lista[i]:
            return i
        i += 1
    return -1

lista = [5,9,7,6,8,2,1,4,3,0]
n= int(input("Escribe un número: "))

print("El número se encuentra en la posición: ",posicion(n, lista))