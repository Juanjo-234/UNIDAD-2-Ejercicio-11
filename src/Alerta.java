import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
class Alerta {

    String idZona;
    String tipoSensor;
    LocalDateTime marcaTemporal;

    public  Alerta(String idZona, String tipoSensor, LocalDateTime marcaTemporal){
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.marcaTemporal = marcaTemporal;
    }


    String getIdZona(){
        return idZona;
    }

    String getTipoSensor(){
        return  tipoSensor;
    }

    LocalDateTime getMarcaTemporal(){
        return marcaTemporal;
    }

    public String toString() {
        return "Alerta [Zona: " + idZona + ", Tipo: " + tipoSensor + ", Fecha: " + marcaTemporal + "]";
    }
}
