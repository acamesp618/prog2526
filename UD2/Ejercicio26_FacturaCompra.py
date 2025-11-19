#Variables del producto
producto= "Espresso Doble"
precio_unitario=3.50

#Variables de la transaccion
cantidad=3
tasa_iva=0.16 #16% de IVA

#Variables del cliente
cliente_nombre="Ana María López"
id_transaccion= "CAF-2025-472"

iva= (precio_unitario*tasa_iva)
productoiva= (precio_unitario+iva)

print(f"--- Recibo de Transacción | ID: {id_transaccion} ---")
print(f"Cliente: {cliente_nombre}")
print()
print(f"Producto: {producto} ({cantidad} unidades)")
print(f"Subtotal (sin IVA): {precio_unitario}€")
print(f"IVA (16%): {precio_unitario*tasa_iva:.2f}€")
print("="*37)
print(f"TOTAL A PAGAR: {productoiva*3:.2f}€")