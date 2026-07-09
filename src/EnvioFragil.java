public class EnvioFragil implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double pesoKg) {
        return  ((2 * pesoKg) + 4) ;
    }

    @Override
    public boolean esRecargoUnico() {
        return true;
    }
}