
package thebest.mediluz;

import java.io.*;
import java.util.*;

public class User {
    private ListaGastoMensual listaGastoMensual;
    private String nameUser;

    public User(ListaElectrodomesticos listaElectrodomesticos, ListaGastoMensual listaGastoMensual, String nameUser) {
        this.listaGastoMensual = listaGastoMensual;
        this.nameUser = nameUser;
    }

    public User() {
        listaGastoMensual = new ListaGastoMensual();
    }

    public ListaGastoMensual getListaGastoMensual() {
        return listaGastoMensual;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setListaGastoMensual(ListaGastoMensual listaGastoMensual) {
        this.listaGastoMensual = listaGastoMensual;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    
    public void cargarUsuario() throws IOException{
        File archivo = new File ("C:\\nombreDeUsuario.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        nameUser = br.readLine();
    }
    
    public void cargarInfo() throws FileNotFoundException, IOException{
        
        cargarUsuario();
        listaGastoMensual.cargarInfoGastoMensual();  
    }
    
    public void agregarMes(){
        Scanner lector = new Scanner(System.in);
        GastoMensual nuevo = new GastoMensual();
        System.out.println("Ingrese mes");
        nuevo.setFecha(lector.nextLine());
        nuevo.agregarElectrodomesticos();
        nuevo.calculoGasto();
        LinkedList<GastoMensual> gasto = listaGastoMensual.getListaGastoMensual();
        gasto.add(nuevo);
    }
    public void verMes(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese mes a buscar");
        String cadena = lector.nextLine();
        LinkedList<GastoMensual> gasto = listaGastoMensual.getListaGastoMensual();
        for(int i = 0;i<gasto.size();i++){
            GastoMensual pos = gasto.get(i);
            if(pos.getFecha().equalsIgnoreCase(cadena)){
                pos.verMes();
                return;
            }
        }
    }
    
    public void guardarDatos() throws IOException{
        listaGastoMensual.guardarDatos();
    }
}
