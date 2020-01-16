
package proyecto_mediluz;

import java.util.Objects;

public class Electrodomestico {
    private String nombreElectroomestico;
    private int kilowattHora;

    public Electrodomestico(String nombreElectroomestico, int kilowattHora) {
        this.nombreElectroomestico = nombreElectroomestico;
        this.kilowattHora = kilowattHora;
    }

    public String getNombreElectroomestico() {
        return nombreElectroomestico;
    }

    public int getKilowattHora() {
        return kilowattHora;
    }

    public void setNombreElectroomestico(String nombreElectroomestico) {
        this.nombreElectroomestico = nombreElectroomestico;
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
        if (!Objects.equals(this.nombreElectroomestico, other.nombreElectroomestico)) {
            return false;
        }
        return true;
    }
    
    
}
