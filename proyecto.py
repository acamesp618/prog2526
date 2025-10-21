import random #importamos un método para que nos de un numero aleatorio

def adivina_numero ():
    print("Bienvenido usuario")
    print("Esto es un juego de intentar adivinar un numero aleatorio entre 1 y 10")

    numero_secreto = random.randint(2, 10) #definimos el numero aleatorio secreto
    intento = 0 #contador de intentos

    while True: #bucle para pedir el numero
        intentodado = int(input("Adivina el numero: "))
        intento += 1

        if intentodado < numero_secreto:
            print("El numero es mas grande")
        elif intentodado > numero_secreto:
            print("El numero es mas pequeño")
        elif intentodado == numero_secreto:
            print("¡Enhorabuena! Has acertado el numero secreto: ", numero_secreto)
            break #si encontramos el numero, se para el bucle
        else:
            print("El numero es incorrecto")
    print("Lo has acertado en el intento ", intento)

adivina_numero() #si dentro del codigo queremos volver a activar el juego, se invoca