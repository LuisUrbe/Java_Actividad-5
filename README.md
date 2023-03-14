#Simulación de Animales: 


Se desea diseñar un programa de simulación que permita al usuario lanzar un conjunto de animales diferentes a un entorno, para ver qué pasa.   

Hay una lista de algunos de los animales que estarán  en el programa, pero no todos. Se sabe que cada animal estará representado por un objeto, y que los objetos se moverán por el entorno, haciendo lo que cada tipo particular esté programado para hacer.

Se quiere que otros programadores sean capaces de añadir nuevos tipos de animales al programa en cualquier momento.

Primero, se tiene que identificar las características comunes y abstractas que tienen todos los animales, y construir esas características en una clase que todas las clases de animales puedan extender.

Se tienen los siguientes casos: León, hipopótamo, perro, tigre, lobo.

Se tienen cinco variables de instancia:

imagen - el nombre del archivo que representa el JPEG de este animal
comida - el tipo de comida que come este animal. En este momento, sólo puede haber dos valores: carne o hierba.
hambre - un valor tipo int que representa el nivel de hambre del animal. Cambia, dependiendo de cuándo (y cuánto) come el animal.
límites - valores que representan la altura y anchura del "espacio" (por ejemplo, 640 x 480) por el que deambularán los animales.
ubicación - las coordenadas X e Y de dónde se encuentra el animal en el espacio.
Se tienen cuatro métodos:

hacerRuido () - comportamiento para cuando el animal debe hacer ruido.
comer() - comportamiento para cuando el animal encuentra su fuente de comida preferida, carne o hierba.
dormir() - comportamiento para cuando el animal se considera dormido. 
deambular() - comportamiento para cuando el animal no está comiendo o durmiendo (probablemente solo deambulando, esperando toparse con una fuente de comida o un límite).
En el análisis, considerar:

Desarrollar la jerarquía de clases que se genera, considerando clases abstractas y concretas
Utilizar diagramas UML, para representar dicha jerarquía
Agregar una nueva clase: gato, indicando en cuál parte de la jeraquía se debe ubicar y los comportamientos que va a tener


En el desarrollo del código, hay que considerar los siguientes aspectos:

Exclusión de comportamientos (dormir(), no se combina con los otros comportamientos, por ejemplo)
Para la variable hambre, usar un generador de valores aleatorios (ver ejemplo de código abajo)
En la clase de prueba, crear, por lo menos, un objeto de cada clase (de las que se pueden instanciar) y presentar, al menos, un comportamiento
