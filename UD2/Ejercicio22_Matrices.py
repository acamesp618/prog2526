matriz = [["A","B","C"],["D","E","F"],["G","H","I"]]

#Imprimir la matriz con un WHILE
i = 0
while i < 3:
    print(matriz[i])
    i+=1


print("------")
#Imprimir la matriz con un FOR
for i in range(3):
    print(matriz[i])

#Imprime matriz para que se muestre por consola los siguiente:
# A D G B E H C F I

fila = 0
columna = 0
while columna < len(matriz[0]):
    fila = 0
    while fila < len(matriz):
        print(matriz[fila][columna])
        fila = fila + 1
    columna = columna + 1

for i in range(len(m)):
    for j in range(len(m[i])):
        print(m[j][i])


    