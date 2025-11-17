matriz = [[1,2,3],[4,5,6],[7,8,9]]

#Imprimir elemento fila 1, columna 2
print(matriz[1][2])

#Imprimir el 5
print(matriz[1][1])

#Bucle que recorra solo la segunda fila
print(matriz[1])

#Mas sencillo
for fila in matriz[1]:
    print(fila, end=" ")

print()
#Mas complejo
for i in range (len(matriz)):
    print(matriz[1][i])


#Bucle que recorra toda la matriz e imprima todos sus elementos
for fila in matriz:
    for elemento in fila:
        print(elemento, end=" ")
    print()