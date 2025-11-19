p = [[5.0, 10.5],[8.2, 15.0],[1.5, 3.0]]
total = 0

for i in range (len(p)): #Solo queremos recorrer las filas
    total += p[i][1] #Al conocer la columna se coloca un 1
print(f"La suma es: {total}€")