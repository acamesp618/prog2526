a=int(input("Escribe un numero: "))
if a == 2: print("Es primo")
else:
    i=2
    while i < a:
        if (a%i==0):
            print("No es primo")
            break
if i == a - 1:
    print("Es primo")

