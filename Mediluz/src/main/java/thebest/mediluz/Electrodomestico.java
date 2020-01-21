
package thebest.mediluz;

import java.util.Objects;

public class Electrodomestico {
    private String nombreElectrodomestico;
    private int kilowattHora;

    public Electrodomestico(String nombreElectrodomestico, int kilowattHora) {
        this.nombreElectrodomestico = nombreElectrodomestico;
        this.kilowattHora = kilowattHora;
    }

    Electrodomestico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public String getNombreElectroomestico() {
        return nombreElectrodomestico;
    }

    public int getKilowattHora() {
        return kilowattHora;
    }

    public void setNombreElectroomestico(String nombreElectroomestico) {
        this.nombreElectrodomestico = nombreElectroomestico;
    }

    public void setKilowattHora(int kilowattHora) {
        this.kilowattHora = kilowattHora;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (!Objects.equals(this.nombreElectrodomestico, other.nombreElectrodomestico)) {
            return false;
        }
        return true;
    }
    
    
}
