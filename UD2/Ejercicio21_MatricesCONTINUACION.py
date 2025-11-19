matriz = [[1,2,3],[4,5,6],[7,8,9]]
m2 = [[0,0,0],[0,0,0],[0,0,0]]

for fila in range(len(matriz)):
    for columna in range (len(matriz[fila])):
        # Si el elemento es multiplo de 2 lo muevo a m2
        if matriz[fila][columna] % 2 == 0:
            m2[fila][columna] = matriz[fila][columna]
            matriz[fila][columna] = 0
        

print("Matriz:")
for fila in matriz:
    print(fila)
print("m2:")
for fila in m2:
    print(fila)