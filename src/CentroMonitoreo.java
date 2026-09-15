import java.util.ArrayList;
import java.util.List;

class CentroMonitoreo {

    List<Alerta> incidentesActivos;

    public CentroMonitoreo(){
        this.incidentesActivos = new ArrayList<>();
    }

    void procesarAlerta(Alerta alerta){
incidentesActivos.add(alerta);
System.out.println( "Nueva alerta registrada exitosamente ");
    }

    void mostrarIncidentes(){
        System.out.println("=================================================");
        System.out.println("==============INCIDENTES ACTIVOS=================");
        System.out.println("=================================================");

        for (int i = 0; i < incidentesActivos.size(); i++) {
            System.out.println((i + 1) + ". " + incidentesActivos.get(i));
        }
    }
}
