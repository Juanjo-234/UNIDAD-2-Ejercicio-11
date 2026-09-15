void main() {
CentroMonitoreo centro = new CentroMonitoreo();

SensorPerimetral sensorNorte = new SensorPerimetral(" ZN-12 ", " INFRARROJO X1 ", centro);
SensorPerimetral sensorSur = new SensorPerimetral(" ZR-23 ", " MOVIMIENTO ", centro);

sensorNorte.detectarMovimiento();
sensorSur.detectarMovimiento();

centro.mostrarIncidentes();
}
