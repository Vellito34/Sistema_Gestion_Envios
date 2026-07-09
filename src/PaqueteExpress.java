public class PaqueteExpress extends Paquete{
    public PaqueteExpress(String nombreDestinatario, double pesoKG) {
        super(nombreDestinatario, pesoKG, new EnvioExpress());
    }
}
