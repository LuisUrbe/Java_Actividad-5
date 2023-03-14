
package com.mycompany.animalesclass;

/**
 *
 * @author Luis Acosta
 */
abstract public class modeloPadre { // Clase principal modeloPadre que a su vez tiene 3 Sub-Clase que son : Canino, Felino y Otros
    private String comida;
    private int hambre;
    private int limiteY;
    private int limiteX;
    private int ubicacionX;
    private int ubicacionY;
    private String Raza;

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getLimiteY() {
        return limiteY;
    }

    public void setLimiteY(int limiteY) {
        this.limiteY = limiteY;
    }

    public int getLimiteX() {
        return limiteX;
    }

    public void setLimiteX(int limiteX) {
        this.limiteX = limiteX;
    }

    public int getUbicacionX() {
        return ubicacionX;
    }

    public void setUbicacionX(int ubicacionX) {
        this.ubicacionX = ubicacionX;
    }

    public int getUbicacionY() {
        return ubicacionY;
    }

    public void setUbicacionY(int ubicacionY) {
        this.ubicacionY = ubicacionY;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    public String verDatos(){
        return "Nombre: "+Raza+"\nTipo de comida: "+comida+"\nHambre: "+hambre+"\nDatos de limites: X = "+limiteX+", Y ="+limiteY+"\nCoordenadas: X = "+ubicacionX+", Y = "+ubicacionY;     
    }

    public String comer(){
        return "El "+Raza+" esta comiendo en las coordenadas : X = "+ubicacionX+", Y = "+ubicacionY;     
    }
    
    public String haceRuido(){
        if (Raza == "perro") {
            return "El Perro ladra";
        }
        else if (Raza == "lobo") {
            return "El lobo aulla";
        }
        else if (Raza == "hipopotamo") {
            return "El hipopotamo hace Ruido";
        }
        else if (Raza == "tigre") {
            return "El tigre Ruge";
        }
        else if (Raza == "leon") {
            return "El tigre Ruge";
        }
        else if (Raza == "gato") {
            return "maulla";
        }
        else{
        return "El "+Raza+" Hace ruido";
        }      
    }
    
    public String dormir(){
        return "El "+Raza+" esta durmiendo en las coordenadas : X = "+ubicacionX+", Y = "+ubicacionY; 
    }
    
    public String deambular(){
        return "El "+Raza+" esta Deambulando en las coordenadas : X = "+ubicacionX+", Y = "+ubicacionY;
    }
    
}
