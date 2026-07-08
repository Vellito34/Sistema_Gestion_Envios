public class EnvioEstandar implements EstrategiaEnvio
{
    public double calcularCosto(double costo) {
        return (pesoKg * 2.00);
    }
}