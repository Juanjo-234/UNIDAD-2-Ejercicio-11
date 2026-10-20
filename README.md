Este programa está diseñado para modelar y gestionar un sistema de seguridad perimetral mediante una **central de monitoreo** y **sensores perimetrales** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Alerta`:** Modela un incidente de seguridad encapsulando sus atributos principales: el identificador de la zona afectada (`idZona`), el tipo de sensor que originó el aviso (`tipoSensor`) y la marca temporal del evento (`marcaTemporal`).
* **Diseña la clase `CentralMonitoreo`:** Implementa el centro de recepción y control que mantiene una colección o lista de incidentes activos (`List<Alerta>`) y expone el método `procesarAlerta(Alerta alerta)` para registrar de forma centralizada cada nueva alerta que recibe.
* **Implementa la clase `SensorPerimetral`:** Modela un dispositivo de vigilancia que posee una referencia directa a la `CentralMonitoreo` y cuenta con el método `detectarMovimiento()`, el cual simula la detección de una anomalía física y dispara automáticamente el envío del mensaje de alerta hacia la central.
* **Ejecuta la prueba (`main`):** Instancia la central de monitoreo, crea al menos dos sensores perimetrales asociados a ella, simula activaciones consecutivas en diferentes zonas y muestra el reporte consolidado de alertas activas por consola.
* 
