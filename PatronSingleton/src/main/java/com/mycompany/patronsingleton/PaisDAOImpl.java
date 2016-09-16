package com.mycompany.patronsingleton;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {
    
    private PaisDAOImpl(){
        
    }

    public static PaisDAOImpl instancia = null;
    
    public static PaisDAOImpl getInstancia(){
        
        if(instancia == null){
            
           instancia = new PaisDAOImpl();
            
        }
        
        return instancia;
    }
    
    private List Paises = null;

    public List getPaises() {

        if (Paises == null) {
            Paises = new ArrayList();

            Pais p1 = new Pais("Colombia");
            Pais p2 = new Pais("Mexico");
            Pais p3 = new Pais("Peru");

            Paises.add(p1);
            Paises.add(p2);
            Paises.add(p3);

        }

        return Paises;

    }

}
