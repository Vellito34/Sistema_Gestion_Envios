public abstract class Paquete {
    private String nombreDestinatario;
    private double pesoKG;
//    EstrategiaEnvio

    public void obtenerCostoEnvio(){
        //metodo del odjeto estrategiaenvio
    }

    @Override
    public String toString() {
        return "Paquete" +
                "Destinatario: " + nombreDestinatario + '\n' +
                "Peso KG: " + pesoKG +
                "Costo de envio";
    }
}
