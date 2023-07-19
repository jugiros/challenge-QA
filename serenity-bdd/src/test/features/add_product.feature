# author: JuanMolina
# date: 19/07/2023
# language: es

Característica: Agregar un producto en el carrito
  Como usuario quiero agregar un producto dentro del carrito de compras.

  @AgregarProductoExitoso
  Escenario: Agregar Producto exitoso
    Dado Juan navega a la página para agregar un producto
    Cuando agrega el producto mediante el botón Add to cart
    Entonces debería ver la alerta de Product added