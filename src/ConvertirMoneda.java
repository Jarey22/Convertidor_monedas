import java.util.Scanner;

public class ConvertirMoneda extends Monedas {
    public static void convertir(String monedaBase, String monedaTarget, Monedas consulta , Scanner lectura){
        double cantidad;
        double cantidadPorConvertir;

    TipoMoneda monedas = consulta.tipomoneda(monedaBase,monedaTarget);
        System.out.println("La conversion es de \n "+ monedaBase + "=" + monedas.conversion_rate()+" "+ monedaTarget);
        System.out.println("Ingrese la cantidad de " +monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadPorConvertir = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadPorConvertir + " " +monedas.target_code());
    }

}
