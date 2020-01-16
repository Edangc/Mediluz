
package proyecto_mediluz;

public class User {
    private ListaElectrodomesticos listaElectrodomesticos;
    private ListaGastoMensual listaGastoMensual;
    String nameUser;

    public User(ListaElectrodomesticos listaElectrodomesticos, ListaGastoMensual listaGastoMensual, String nameUser) {
        this.listaElectrodomesticos = listaElectrodomesticos;
        this.listaGastoMensual = listaGastoMensual;
        this.nameUser = nameUser;
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
    
}
