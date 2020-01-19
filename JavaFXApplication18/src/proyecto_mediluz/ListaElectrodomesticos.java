
package proyecto_mediluz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;

public class ListaElectrodomesticos {
    
    private LinkedList<Electrodomestico> listaElectrodomestico;

    public ListaElectrodomesticos(LinkedList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }

    ListaElectrodomesticos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LinkedList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(LinkedList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }
    
    public void cargarListaElectrodomesticos() throws FileNotFoundException{
               
        File archivo = new File ("C:\\electrodomesticos.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        try {
         // Lectura del fichero
         String linea;
        while((linea = br.readLine())!= null){
            String[] separador = linea.split(",");
            
            String nombreElect = separador[0];
            int kiloWattHora = parseInt(separador[1]); 
            
            Electrodomestico e = new Electrodomestico(nombreElect,kiloWattHora);
            
            listaElectrodomestico.add(e);
        }
        
        }
        catch(Exception e){
        System.out.println("F");
        }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
            try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        
    }
}
