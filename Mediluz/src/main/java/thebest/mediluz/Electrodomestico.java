
package thebest.mediluz;

import java.util.Objects;

public class Electrodomestico {
    private String nombreElectrodomestico;
    private int kilowattHora;

    public Electrodomestico(String nombreElectrodomestico, int kilowattHora) {
        this.nombreElectrodomestico = nombreElectrodomestico;
        this.kilowattHora = kilowattHora;
    }

    public Electrodomestico() {
    }

    public String getNombreElectrodomestico() {
        return nombreElectrodomestico;
    }

    public int getKilowattHora() {
        return kilowattHora;
    }

    public void setNombreElectrodomestico(String nombreElectrodomestico) {
        this.nombreElectrodomestico = nombreElectrodomestico;
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
