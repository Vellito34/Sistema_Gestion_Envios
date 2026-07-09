public class EnvioInternacional implements EstrategiaEnvio  {
    public double calcularCosto(double pesoKg) {
        return (6 * pesoKg + 10.00); }

    @Override
    public boolean esRecargoUnico() {
        return true;
    }
}