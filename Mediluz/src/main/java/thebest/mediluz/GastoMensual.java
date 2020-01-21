
package thebest.mediluz;

import java.util.*;

public class GastoMensual {
    private ListaElectrodomesticos electronicosMensuales;
    private int gastoTotalDelMes;
    private String fecha;

    public GastoMensual(){
        electronicosMensuales = new ListaElectrodomesticos();
    }
    
    public GastoMensual(ListaElectrodomesticos electronicosMensuales, int gastoTotalDelMes, String fecha) {
        this.electronicosMensuales = electronicosMensuales;
        this.gastoTotalDelMes = gastoTotalDelMes;
        this.fecha = fecha;
    }

    public ListaElectrodomesticos getElectronicosMensuales() {
        return electronicosMensuales;
    }

    public int getGastoTotalDelMes() {
        return gastoTotalDelMes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setElectronicosMensuales(ListaElectrodomesticos electronicosMensuales) {
        this.electronicosMensuales = electronicosMensuales;
    }

    public void setGastoTotalDelMes(int gastoTotalDelMes) {
        this.gastoTotalDelMes = gastoTotalDelMes;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void calculoGastoMensual(){
    
        LinkedList listaDeElectro = electronicosMensuales.getListaElectrodomestico();
        for (int i = 0;listaDeElectro.get(i)!=listaDeElectro.getLast(); i++) {
            Electrodomestico pos = (Electrodomestico)listaDeElectro.get(i);
        }
    }
    
    public void agregarElectrodomesticos(){
        Scanner lector = new Scanner(System.in);
        Scanner lector2 = new Scanner(System.in);
        LinkedList lista = (LinkedList)this.electronicosMensuales.getListaElectrodomestico();
        int i = 0;
        int option;
        int horas = 0;
        String nombre;
        while(true){
            System.out.println("Electrodomesticos agregados: "+i);
            System.out.println("Desea agregar electrodomesticos?");
            System.out.println("1.-Si");
            System.out.println("2.-No");
            option = lector.nextInt();
            if(option == 2){
                return;
            }
            switch(option){
                case 1:
                    Electrodomestico nuevo = new Electrodomestico();
                    System.out.println("Ingrese nombre del electrodomestico");
                    nuevo.setNombreElectrodomestico(lector2.nextLine());
                    System.out.println("Ingrese kilowatt-Hora");
                    nuevo.setKilowattHora(lector.nextInt());
                    System.out.println("Ingrese horas usadas en el mes");
                    horas = lector.nextInt();
                    this.gastoTotalDelMes = this.gastoTotalDelMes + (horas*nuevo.getKilowattHora());
                    lista.add(nuevo);
                    i++;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        }
    }
    
    public void verMes(){
        this.electronicosMensuales.verMes();
        System.out.println("Gasto del mes: $"+this.gastoTotalDelMes);
    }
    
    public void calculoGasto(){
        this.gastoTotalDelMes = this.gastoTotalDelMes*144;
    }
}