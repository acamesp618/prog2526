def posicion (n, lista):
    for i in range (len(lista)):
        if n == lista[i]:
            return("El número está en la posición: ", i)
        i+= 1
        
    return("El número no está en la lista")

lista = [5,9,7,6,8,2,1,4,3,0]
n= int(input("Escribe un número: "))

print(posicion(n, lista))