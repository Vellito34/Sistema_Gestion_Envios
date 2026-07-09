import java.util.ArrayList;

public class EmpresaMensajeria {

    ArrayList<Paquete> Almacen = new ArrayList<>();

    public void AñadirPaquete(Paquete p){
        Almacen.add(p);
    }

    public void Reporte(){
        int ID = 0;
        double dineroTotal = 0;
        for (Paquete p: Almacen ){
            System.out.println(p);
            dineroTotal += p.obtenerCostoEnvio();
        }
        System.out.println("El dinero total obtenido es: $"+dineroTotal);
    }
}
