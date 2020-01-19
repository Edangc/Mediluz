
package proyecto_mediluz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private ListaElectrodomesticos listaElectrodomesticos;
    private ListaGastoMensual listaGastoMensual;
    private String nameUser;

    public User(ListaElectrodomesticos listaElectrodomesticos, ListaGastoMensual listaGastoMensual, String nameUser) {
        this.listaElectrodomesticos = listaElectrodomesticos;
        this.listaGastoMensual = listaGastoMensual;
        this.nameUser = nameUser;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListaElectrodomesticos getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public ListaGastoMensual getListaGastoMensual() {
        return listaGastoMensual;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setListaElectrodomesticos(ListaElectrodomesticos listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
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
        listaElectrodomesticos.cargarListaElectrodomesticos();
        listaGastoMensual.cargarInfoGastoMensual();  
    }
    
}
