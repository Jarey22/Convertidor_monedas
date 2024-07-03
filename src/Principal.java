import java.io.IOException;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        ConvertirMoneda consulta = new ConvertirMoneda();
        int opcion = 0;
        while(opcion !=7) {
            System.out.println( """
             ******************************************************************
             Bienvenid@ al conversor de Monedas :D

             1) Dolar =>> Peso colombiano
             2) Peso colombiano =>> Dolar
             3) Dolar =>> Peso argentino
             4) Peso argentino =>> Dolar
             5) Dolar =>> Peso mexicano
             6) Peso mexicano =>> Dolar
             7) Salir
             *******************************************************************
            """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            //Inicializar el programa
            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("COP","USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","ARG",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARG","USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","MXN",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("MXN","USD",consulta,lectura);
                    break;
                case 7:
                    System.out.println("Gracias por usarme , espero te haya sido util");
                    break;
                default:
                    System.out.println("No existe esa opcion, verifica nuevamente");
                    break;
            }
        }
    }
}

