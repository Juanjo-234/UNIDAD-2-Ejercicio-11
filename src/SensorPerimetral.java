import java.time.LocalDateTime;

public class SensorPerimetral {
    private String idZona;
    private  String tipoSensor;
    private CentroMonitoreo centro;

    public  SensorPerimetral(String idZona, String tipoSensor,CentroMonitoreo centro){
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.centro = centro;
    }

    void detectarMovimiento(){
System.out.println(tipoSensor + " detectó movimiento en la zona: " + idZona);
Alerta nuevaAlerta = new Alerta(idZona,tipoSensor, LocalDateTime.now());
centro.procesarAlerta(nuevaAlerta);
    }
}
