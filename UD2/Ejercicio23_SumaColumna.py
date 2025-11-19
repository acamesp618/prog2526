p = [[5.0, 10.5],[8.2, 15.0],[1.5, 3.0]]
total = 0

for i in range (len(p)):
    for j in range (len(p[0])):
        if j == 1: #La columna tiene que ser indice 1
            total += p[i][j] #La suma se hace con el elemento
print(f"La suma es: {total}€")