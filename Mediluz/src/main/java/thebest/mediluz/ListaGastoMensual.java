
package thebest.mediluz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;

public class ListaGastoMensual {
    private LinkedList<GastoMensual> listaGastoMensual;

    public ListaGastoMensual(LinkedList<GastoMensual> listaGastoMensual) {
        this.listaGastoMensual = listaGastoMensual;
    }

    public ListaGastoMensual() {
        
        listaGastoMensual = new LinkedList<GastoMensual>();
    }
    
    
    public LinkedList<GastoMensual> getListaGastoMensual() {
        return listaGastoMensual;
    }
    
    public void cargarInfoGastoMensual() throws FileNotFoundException{
        File archivo = new File("src\\bd\\gastoMensual.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        
        try {
        // Lectura del fichero
            
            String linea;
            while((linea = br.readLine())!= null){
                
                LinkedList<Electrodomestico> listaAparatos = null;
                String[] separador = linea.split(";");
                String[] fechaGasto = separador[0].split(",");

                String fecha = fechaGasto[0];
                int gastoTotal = parseInt(fechaGasto[1]);

                int cantidadElectrod = separador.length;
                for(int i=1; i<cantidadElectrod ;i++){
                    
                    String[] nombreYWatts = separador[i].split(",");
                    String nombreE = nombreYWatts[0];
                    int kwtE = parseInt( nombreYWatts[1] );
                    Electrodomestico electrodom = new Electrodomestico(nombreE,kwtE);
                    listaAparatos.add( electrodom );
                }            
                ListaElectrodomesticos aparatos = new ListaElectrodomesticos(listaAparatos);                
                GastoMensual gastoMensual = new GastoMensual(aparatos,gastoTotal,fecha);
                
                listaGastoMensual.add(gastoMensual);
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
    
    public void guardarDatos() throws IOException{
        File archivo = new File("C:\\electrodomesticos.txt");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("");
        /*Atributos ListaGastoMensual:
        private ListaElectrodomesticos electronicosMensuales;
        private int gastoTotalDelMes;
        private String fecha;*/
        
        
        for(int i = 0;i<listaGastoMensual.size();i++){
            GastoMensual mes = listaGastoMensual.get(i);
            
            String cadena = mes.getFecha()+","+mes.getGastoTotalDelMes()+","; 
            
            ListaElectrodomesticos listElectrodomesticos = mes.getElectronicosMensuales();
            LinkedList<Electrodomestico> electrodomesticos = listElectrodomesticos.getListaElectrodomestico();
            
            for(int j=0; i< electrodomesticos.size() ;j++){
                cadena += electrodomesticos.get(j).getNombreElectrodomestico();
                cadena += ",";
                cadena += electrodomesticos.get(j).getKilowattHora();
                if( j != electrodomesticos.size()-1 ){
                    cadena += ","; 
                }
                bw.write(cadena+'\n');
            }
        }
        
        bw.close();
    }    
}
