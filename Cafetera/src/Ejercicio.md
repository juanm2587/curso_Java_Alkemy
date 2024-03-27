## Ejercicio: ¡Vamos a programar una cafetera!

Es importante tener el control de la creación de objetos en nuestro programa, así como supervisar y asegurarnos de siempre estar trabajando con el mismo objeto. Es por esto que vamos a practicar la manipulación de atributos en el siguiente ejercicio:

### Consigna:

Desarrolle una clase `Cafetera` con los atributos `capacidadMaxima` (la cantidad máxima de café que puede contener la cafetera) y `cantidadActual` (la cantidad actual de café que hay en la cafetera).

### Métodos solicitados:

1. Constructor predeterminado o vacío.
2. Constructor con la capacidad máxima y la cantidad actual.
3. Métodos getters y setters.
4. Método `llenarCafetera()`: su función es hacer que la cantidad actual sea igual a la capacidad máxima.
5. Método `servirTaza(int)`: se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que reste en la máquina. El método le informará al usuario si se llenó o no la taza, y en caso de no haberse llenado informará en cuanto quedó la taza.
6. Método `vaciarCafetera()`: define la cantidad de café actual en cero.
7. Método `agregarCafe(int)`: se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
