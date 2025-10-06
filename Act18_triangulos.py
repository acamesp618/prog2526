a= int(input("Escribe el lado a:"))
b= int(input("Escribe el lado b:"))
c= int(input("Escribe el lado c:"))
#es triangulo si al sumar dos lados es mayor que su tercero
if (a + b > c) and (a + c > b) and (b + c > a):
    print("Es un triangulo")
    if a==b!=c:
        print("ISOSCELES")
    elif a==b==c:
        print("EQUILATERO")
    else:
        print("ESCALENO")
else:
    print("No es un triangulo")

