package com.mycompany.animalesclass;


import com.mycompany.animalesclass.funciones.funciones;
import com.mycompany.animalesclass.caninos.animales.lobo;
import com.mycompany.animalesclass.caninos.animales.perro;
import com.mycompany.animalesclass.felinos.animales.gato;
import com.mycompany.animalesclass.felinos.animales.leon;
import com.mycompany.animalesclass.felinos.animales.tigre;
import com.mycompany.animalesclass.hipopotamo.hipopotamo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Luis Acosta
 * 
 */

public class AnimalesClass { // CLase main del programa
    public static void main(String[] args) {        
        // base de dato de Animales
        
        // cantidad de animales agregados en la BD 5
        int cantidadAnimalesMax = 10; // Cantidad maxima de datos para agregar a animales
        int[] hambre = new int[cantidadAnimalesMax]; // se guarda los numeros aleatoria para el comienzo y si tienen hambre
        int[] ubicacionX = new int[cantidadAnimalesMax]; // se guarda la ubicacion X del mapa
        int[] ubicacionY = new int[cantidadAnimalesMax]; // se guarda la ubicacion X del mapa
        int limiteX; // se guarda el limite X del mapa
        int limiteY; // se guarda el limite Y del mapa
        
        // limite del mapa 
        limiteX = funciones.limiteMX(); // se genera y guarda el numero limite X del mapa
        limiteY = funciones.limiteMY(); // se genera y guarda el numero limite Y del mapa
        
        int acciones = 0; // Marca las actualizaciones de las acciones de los animales
        
           int continual = 0;
        while(continual == 0){ // comienza en un ciclo para poder actualizar los datos de los animales
            String salida = "";
            JTextArea textArea;
            
            
            // hambre y coordenadas X y Y de los animales
        for (int i = 0; i < cantidadAnimalesMax; i++) {
            hambre[i] = funciones.HambreAnimal(); // se genera y guarda el numero aleatorio del hambre
            ubicacionX[i] = funciones.ubicacionX(limiteX); // se genera y guarda el numero aleatorio de la ubicacion con un limtie X  
            ubicacionY[i] = funciones.ubicacionY(limiteY); // se genera y guarda el numero aleatorio de la ubicacion con un limtie Y
        }
            // acciones de cada animal
            int accionAnimalPerro = funciones.accionAnimal(); // perro
            int accionAnimalLobo = funciones.accionAnimal(); // lobo
            int accionAnimalTigre = funciones.accionAnimal(); // tigre
            int accionAnimalLeo = funciones.accionAnimal(); // leon
            int accionAnimalHipopotamo = funciones.accionAnimal(); // hipopotamo
 
            System.out.println("\n\n=====================================================================");
            System.out.println("\nAcciones De los animales : "+acciones+"      Limite del mapa: X "+limiteX+", Y"+limiteY); // marca de acciones de los animales
            salida += "=====================================================================";
            salida += "\nAcciones De los animales :"+acciones+",  Limite del mapa: X "+limiteX+", Y"+limiteY;
            acciones = acciones + 1; // aumenta la marcacion y se actualiza cualquier se repita el ciclo
           
        // Perro (Canino)
        System.out.println("\nPerro :"); // nombre para cuando se muestra la accion
        salida += "\n\nPerro: ";
        perro perro = new perro(); // perro
        perro.setRaza("Perro"); // raza o nombre   
        perro.setComida("carne"); // Comida
        perro.setHambre(hambre[0]); // hambre del animal
        perro.setLimiteX(limiteX); // limite X del mapa
        perro.setLimiteY(limiteY); // limite Y del mapa
        perro.setUbicacionX(ubicacionX[0]); // ubicacion X
        perro.setUbicacionY(ubicacionY[0]); // ubicacion Y
        salida = funciones.accionAnimales(perro,hambre[0],accionAnimalPerro,salida); // Accion de los animales y va guardando la accion en la variable salida para luego mostrar
        
        
        // Leo (Felino)
        System.out.println("\nLeon :"); // nombre para cuando se muestra la accion
        salida += "\n\nLeon: ";
        leon leon = new leon(); // leo
        leon.setRaza("Leon"); // raza o nombre
        leon.setComida("carne"); // Comida del animal
        leon.setHambre(hambre[1]); // hambre del animal
        leon.setLimiteX(limiteX); // limite X del mapa
        leon.setLimiteY(limiteY); // limite Y del mapa
        leon.setUbicacionX(ubicacionX[1]); // ubicacion X
        leon.setUbicacionY(ubicacionY[1]); // ubicacion Y
        salida = funciones.accionAnimales(leon,hambre[1],accionAnimalLeo,salida); // Accion de los animales y va guardando la accion en la variable salida para luego mostrar
        
        
        // Hipopotamo (Animal)
        hipopotamo hipopotamo = new hipopotamo(); // hipopotamo
        System.out.println("\nHipopotamo :"); // nombre para cuando se muestra la accion
        salida += "\n\nHipopotamo :";
        hipopotamo.setRaza("Hipopotamo"); // raza o nombre  
        hipopotamo.setComida("hierbas"); // Comida del animal
        hipopotamo.setHambre(hambre[2]); // hambre del animal
        hipopotamo.setLimiteX(limiteX); // limite X del mapa
        hipopotamo.setLimiteY(limiteY); // limite Y del mapa
        hipopotamo.setUbicacionX(ubicacionX[2]); // ubicacion X
        hipopotamo.setUbicacionY(ubicacionY[2]); // ubicacion Y
        salida = funciones.accionAnimales(hipopotamo,hambre[2],accionAnimalHipopotamo,salida); // Accion de los animales y va guardando la accion en la variable salida para luego mostrar
        
        
        // Tigre (Felino)
        tigre tigre = new tigre(); // tigre
        System.out.println("\nTigre :"); // nombre para cuando se muestra la accion
        salida += "\n\nTigre :";
        tigre.setRaza("Tigre"); // raza o nombre  
        tigre.setComida("carne"); // Comida del animal
        tigre.setHambre(hambre[3]); // hambre del animal
        tigre.setLimiteX(limiteX); // limite X del mapa
        tigre.setLimiteY(limiteY); // limite Y del mapa
        tigre.setUbicacionX(ubicacionX[3]); // ubicacion X
        tigre.setUbicacionY(ubicacionY[3]); // ubicacion Y
        salida = funciones.accionAnimales(tigre,hambre[3],accionAnimalTigre,salida); // Accion de los animales y va guardando la accion en la variable salida para luego mostrar
        
        
        // Lobo (Canino)
        lobo lobo = new lobo(); //lobo
        System.out.println("\nLobo :"); // nombre para cuando se muestra la accion
        salida += "\n\nLobo :";
        lobo.setRaza("lobo"); // raza o nombre  
        lobo.setComida("carne"); // Comida del animal
        lobo.setHambre(hambre[4]); // hambre del animal
        lobo.setLimiteX(limiteX); // limite X del mapa
        lobo.setLimiteY(limiteY); // limite Y del mapa
        lobo.setUbicacionX(ubicacionX[4]); // ubicacion X
        lobo.setUbicacionY(ubicacionY[4]); // ubicacion Y
        salida = funciones.accionAnimales(lobo,hambre[4],accionAnimalLobo,salida); // Accion de los animales y va guardando la accion en la variable salida para luego mostrar
        
         
        // gato (Felino)
        System.out.println("\nGato :"); // nombre para cuando se muestra la accion
        salida += "\n\nGato: ";
        gato gato = new gato(); // gato
        gato.setRaza("gato"); // raza o nombre
        gato.setComida("hierba"); // Comida del animal
        gato.setHambre(hambre[5]); // hambre del animal
        gato.setLimiteX(limiteX); // limite X del mapa
        gato.setLimiteY(limiteY); // limite Y del mapa
        gato.setUbicacionX(ubicacionX[5]); // ubicacion X
        gato.setUbicacionY(ubicacionY[5]); // ubicacion Y
        salida = funciones.accionAnimales(gato,hambre[5],accionAnimalLeo,salida); // Accion de los animales y va guardando la accion en la variable salida para luego mostrar
        
        salida +=  "\n\n=====================================================================";
        textArea = new JTextArea( salida, 10, 30 ); // create textArea1
               JOptionPane.showMessageDialog(null, textArea,
                    "Acciones de los animales", JOptionPane.PLAIN_MESSAGE);
        
        // muestra datos actuales de cada animal
        funciones.muestraDatoCaninosActual(perro,lobo); // datos actuales de los caninos
        funciones.muestraDatofelinosActual(tigre,leon,gato); // datos actuales de los felinos
        funciones.muestraDatohipopotamoActual(hipopotamo); // datos actuales del hipopotamo
         
        // repetir o no el ciclo del programa
        continual = funciones.RepetirCiclo(continual); // la funcion da el mensaje si repetir o no el ciclo
        
        } // final ciclo while
        
    } // final main
    
}

