# author: JuanMolina
# date: 19/07/2023
# language: es

Característica: Agregar un producto
  Como usuario quiero agregar un producto dentro del carrito de compras.

  @AgregarProductoExitoso
  Escenario: Generar pago existoso
    Dado Juan navega a la ventana para agregar los productos
    Cuando termina de agregar los productos abre el carrito y llena el formulario
    Entonces finaliza la compra de los productos