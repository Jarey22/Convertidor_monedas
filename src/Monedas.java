import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Monedas {
   public TipoMoneda tipomoneda(String monedaBase, String monedaTarget){
      //como ya se dejo el standar de que monedas se van a usar se puede dejar estatico esta parte
      //con pair va a hacer la comparativa entre la moneda a convertir y la segunda opcion es para contrarrestar el valor de la moneda seleccionada
      URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0576dcb47ce867424ea87e76/pair/"+monedaBase+"/"+monedaTarget);
      //conexion normal de HttpClient
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder() //builder sirve especificar las cosas que se construiran
              .uri(direccion)
              .build();

      try {
         HttpResponse<String> response = client
                 .send(request, HttpResponse.BodyHandlers.ofString());
         return new Gson().fromJson(response.body(),TipoMoneda.class);
      }catch (Exception e){
         throw new RuntimeException("No encontre esa moneda");
      }

   }
}
