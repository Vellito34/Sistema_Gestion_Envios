public class EnvioEstandar implements EstrategiaEnvio
{
    public double calcularCosto(double pesoKg) {
        return (pesoKg * 2.00);
    }

    @Override
    public boolean esRecargoUnico() {
        return false;
    }
}