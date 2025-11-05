inventario=["Manzanas", "Plátanos", "Naranjas", "Peras"]

#Llegada nueva mercancía
inventario.append("Uvas")
inventario.append("Kiwi")
print("1.Inventario nueva mercancía: ", inventario)
print("----------")

melones=["Melones"]
inventario.extend(melones)
print("2.Inventario nueva mercancía: ", inventario)
print("----------")

#Reordenamiento
inventario.insert(2, "Plátanos frescos")
print("3.Inventario nueva mercancía: ", inventario)
print("----------")

#Venta y descarte
producto_vendido= inventario.pop(-1)
print("4.Inventario ACTUALIZADO: ", inventario)
inventario.remove("Peras")
print("4.Inventario ACTUALIZADO: ", inventario)
print("----------")

#Reporte de Emergencia
reporte_urgente = inventario[0: 4]
print("5.Inventario ACTUALIZADO: ", inventario)
print("5.Inventario URGENTE: ", reporte_urgente)
print("----------")

#Recorrido final
for i in range(len(reporte_urgente)):
    print("Índice", i, ": ", reporte_urgente[i])
    i = i+1