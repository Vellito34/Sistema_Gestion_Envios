public class PaqueteEstandar extends Paquete{
    public PaqueteEstandar(String nombreDestinatario, double pesoKG) {
        super(nombreDestinatario, pesoKG, new EnvioEstandar());
    }
}
