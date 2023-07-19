# author: JuanMolina
# date: 19/07/2023
# language: es

Característica: Llenar los datos para el pago
  Como usuario quiero realizar el pago de los productos seleccionados.

  @Purchase
  Escenario: Realizar el pago de los productos
    Dado Juan navega a la página del carrito de compras y presiona el botón Place Order
    Cuando agrega todos los datos del formulario y presiona el botón Purchase
    Entonces debería ver el mensaje Thank you for your purchase