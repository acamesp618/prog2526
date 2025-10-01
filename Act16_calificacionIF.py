num=int(input("Escribe un numero:"))
if num==0 or num==1 or num==2 or num==3 or num==4:
    print("Insuficiente")
elif num==5:
    print("Suficiente")
elif num==6:
    print("Bien")
elif num==7 or num==8:
    print("Notable")
elif num==9 or num==10:
    print("Sobresaliente")
else:
    print("Numero no valido")
