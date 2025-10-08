#Tabla de multiplicar
num=int(input("Escribe un numero: "))
i= 0
#FOR porque conocemos el nº con el que queremos acabar
for i in range (0, 11):
    print(num, 'x', i, '=', num*i)
