package com.mycompany.patronsingleton;

public class App {

    public static void main(String[] args) {

        //correr la aplicacion en modo debug
        
        /*PaisDAOImpl dao = new PaisDAOImpl();
        
        for(Object o : dao.getPaises()){
            
            System.out.println(((Pais)o).getNombre());
            
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        for(Object o : dao.getPaises()){
            
            System.out.println(((Pais)o).getNombre());
            
        }*/
        
        //con singleton
        
        //PaisDAOImpl on = new PaisDAOImpl();//no se puede crear otra instancia
        
        PaisDAOImpl dao = PaisDAOImpl.getInstancia();
        
        for(Object o : dao.getPaises()){
            
            System.out.println(((Pais)o).getNombre());
            
        }
        
        
        
        PaisDAOImpl daoi = PaisDAOImpl.getInstancia();
        
        for(Object o : daoi.getPaises()){
            
            System.out.println(((Pais)o).getNombre());
            
        }
        
    }
}
