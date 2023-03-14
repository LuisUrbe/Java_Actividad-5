
package com.mycompany.animalesclass.funciones;

import com.mycompany.animalesclass.modeloPadre;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Acosta
 */
public class funciones {
    
    public static int accionAnimal() {  // genera un numero aleatorio para la accion del animal
            // Crea un objeto de la clase Random
            Random rand = new Random();
            // Genera un número aleatorio entre 0 y 10 (ambos incluidos)
             int numeroAleatorioAccion = rand.nextInt(11);
             return numeroAleatorioAccion; // retorna la accion del animal para guardar en una variable
        }
    
    public static int HambreAnimal() { // genera el un numero aleatorio para un animal al comenzar
            // Crea un objeto de la clase Random
            Random rand = new Random();
            // Genera un número aleatorio entre 0 y 10 (ambos incluidos)
             int numeroAleatorio = rand.nextInt(11);
            return numeroAleatorio;
        }
    
    public static int limiteMX() { // genera aleatoriamente un limite X del mapa de los animales
            // Crea un objeto de la clase Random
            Random rand = new Random();
            // Genera un número aleatorio entre 0 y 650 (ambos incluidos)
             int limiteY = rand.nextInt(651); // limite superior
            return limiteY;
        }
    
    public static int limiteMY() { // genera aleatoriamente un limite Y del mapa de los animales
            // Crea un objeto de la clase Random
            Random rand = new Random();
            // Genera un número aleatorio entre 0 y 480 (ambos incluidos)
             int limiteX = rand.nextInt(481); // limite superior
            return limiteX;
        }
    
    public static int ubicacionX(int LimiteX) { // General aleatoriamente la ubicacion en X del animal
            // Crea un objeto de la clase Random
            Random rand = new Random();
            // Genera un número aleatorio entre 0 y LimiteX(ambos incluidos)
             int ubicacionX = rand.nextInt(LimiteX); // limite superior
            return ubicacionX;
        }
    
    public static int ubicacionY(int LimiteY) { // General aleatoriamente la ubicacion en Y del animal
            // Crea un objeto de la clase Random
            Random rand = new Random();
            // Genera un número aleatorio entre 0 y LimiteY (ambos incluidos)
             int ubicacionY = rand.nextInt(LimiteY); // limite superior
            return ubicacionY;
        }
    
    // Acciones de los animales y va guardando en la variable salida los datos de la accion
           public static String accionAnimales(modeloPadre Raza,int hambre, int accionAnimal, String salida){
                String datos = salida;
               if(hambre < 3){
            System.out.println(Raza.comer());
            datos += "\n"+Raza.comer();
            Raza.setHambre(hambre + 1);
        }            
        else if(hambre < 5){
            System.out.println(Raza.deambular());
            datos += "\n"+Raza.deambular();
            System.out.println(Raza.haceRuido());
            datos += "\n"+Raza.haceRuido();
            Raza.setHambre(hambre - 1);
        }
        else if(accionAnimal < 5){
            System.out.println(Raza.dormir());
            datos += "\n"+Raza.dormir();
            Raza.setHambre(hambre - 1);}
        
        else {
            System.out.println(Raza.deambular());
            datos += "\n"+Raza.deambular();
            Raza.setHambre(hambre - 1);
        }
               return datos+="";
               
            }
           
           public static int RepetirCiclo(int continual) { // General aleatoriamente la ubicacion en Y del animal
               String opcionS;
            opcionS = JOptionPane.showInputDialog("Quieres Acualizar los datos? :\n\n1- Si\n2-No\n"); // actualizar datos de los animales 
            int opcion = Integer.parseInt(opcionS);       
        
         // actualizar datos de los animales  
          if(opcion == 1){ // vuelve y se actualiza los datos
              continual = continual + 0;
              return continual;
           }
          else{  // se cierra el programa
            continual = continual + 1;
          return continual;
          }
      
        }
           
           public static void muestraDatoCaninosActual(modeloPadre perro, modeloPadre lobo) {  // muestra en ventana los datos actuales de los caninos
            JOptionPane.showMessageDialog(null,"Dato Actuales de los animales: Caninos\n\n"+perro.verDatos() + "\n\n"+lobo.verDatos()); 
        }
           public static void muestraDatofelinosActual(modeloPadre tigre, modeloPadre leon,modeloPadre gato) {  // muestra en ventana los datos actuales de los felino
            JOptionPane.showMessageDialog(null,"Dato Actuales de los animales: Felinos\n\n"+tigre.verDatos()+"\n\n"+leon.verDatos()+"\n\n"+gato.verDatos()); 
        }
           public static void muestraDatohipopotamoActual(modeloPadre hipopotamo) {  // muestra en ventana los datos actuales del hipopotamo  
            JOptionPane.showMessageDialog(null,"Dato Actuales de los animales: Hipopotamo\n\n"+hipopotamo.verDatos()); 
        }
}
