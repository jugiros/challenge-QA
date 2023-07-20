# author: JuanMolina
# date: 19/07/2023
# language: es

Característica: Agregar un producto
  Como usuario quiero agregar un producto dentro del carrito de compras.

  @AgregarProductoExitoso
  Escenario: Generar pago existoso
    Dado Juan navega a la ventana para agregar el 1er productos
    Cuando agrega el segundo producto
    Entonces abre el carrito y finaliza la compra