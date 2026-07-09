public abstract class Paquete {
    private String nombreDestinatario;
    private double pesoKG;
    private EstrategiaEnvio estratetiaEnvio;

    public Paquete(String nombreDestinatario, double pesoKG, EstrategiaEnvio estratetiaEnvio) {
        if (pesoKG <= 0){
            throw new IllegalArgumentException("El peso debe de ser mayo a 0");
        }
        this.nombreDestinatario = nombreDestinatario;
        this.pesoKG = pesoKG;
        this.estratetiaEnvio = estratetiaEnvio;
    }

    public double obtenerCostoEnvio(){
       return estratetiaEnvio.calcularCosto(pesoKG);
    }



    @Override
    public String toString() {
        return "Paquete" +
                "\nDestinatario: " + nombreDestinatario + '\n' +
                "\nPeso KG: " + pesoKG +
                "\nTipo de envio: "+ this.getEstratetiaEnvio().getClass() +
                "\nCosto de envio: " + estratetiaEnvio.calcularCosto(pesoKG) +
                "\nRecatgo fijo/unico: " + estratetiaEnvio.esRecargoUnico();
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public double getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(double pesoKG) {
        this.pesoKG = pesoKG;
    }

    public EstrategiaEnvio getEstratetiaEnvio() {
        return estratetiaEnvio;
    }

    public void setEstratetiaEnvio(EstrategiaEnvio estratetiaEnvio) {
        this.estratetiaEnvio = estratetiaEnvio;
    }
}
