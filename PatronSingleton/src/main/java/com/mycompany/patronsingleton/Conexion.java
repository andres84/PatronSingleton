package com.mycompany.patronsingleton;

public class Conexion {

    private static Conexion instancia = null;

    public static Conexion getInstancia() {

        if (instancia == null) {//igual a null si no se ha instanciado por primera vez

            instancia = new Conexion();

        }

        return instancia;

    }
    
    private Conexion(){//se crea el constructor privado para generar una unica instancia
        
    }

}
