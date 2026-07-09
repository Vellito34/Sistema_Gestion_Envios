public class EnvioExpress implements EstrategiaEnvio
{
    public double calcularCosto(double pesoKg) {
        return (4.50 * pesoKg + 3.00); }

    @Override
    public boolean esRecargoUnico() {
        return true;
    }
}
