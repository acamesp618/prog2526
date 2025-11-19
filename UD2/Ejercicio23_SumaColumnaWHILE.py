p = [[5.0, 10.5],[8.2, 15.0],[1.5, 3.0]]
total = 0
i=0
while i < len(p):
    total = total + p[i][1]#se va sumando el elemento
    i = i +1
print(f"La suma es: {total}€")