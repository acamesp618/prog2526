a=int(input("Escribe un numero: "))
b=int(input("Escribe otro numero: "))
while b != 0:
    if a > b:
        a=a-b
    else:
        b=b-a
print("El Maximo Comun Divisor es: ",a)
