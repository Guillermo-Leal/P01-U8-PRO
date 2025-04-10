# P01-U8-PRO
## Enunciado del ejercicio propuesto.
Desarrolle un programa que solicite números enteros al usuario y los almacene en una
lista (ArrayList). Cuando el usuario introduzca el número cero, el programa debe
mostrar la suma de todos los números, la media aritmética, la cantidad de números
que superan la media y finalmente mostrar la lista de números ordenada.

## Explicacion. 

Para conseguir hacer la practica utilizamos una lista de array para poder guardar la informacion dada la cual es añadida automaticamente con el bucle **"while(numero!=0)"** el cual ira sumando todos los numeros a la lista hasta que pongamos el numero 0. despues sumara todos los números uno a uno con el uso de el bucle **"for(Integer n: lista)"** el cual ira por toda la lista hasta que esta acabe, ese bucle ira sumando los numeros uno a uno hasta terminar con la lista.
Posterior a esto tenemos un calculo de la media y despues tenemos un bucle for **"for(Integer n:lista)"** este tiene dentro el bucle **"if(n>media) contador++"** este ira poniendo un contador por cada numero que sea mayor a la media y los ira sumando a **"contador"**. 
Para finalizar se nos muestran todos los datos por pantalla junto a la lista entera de números puestos por el usuario
