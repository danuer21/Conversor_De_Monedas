import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    String ApiKey = "e7b4106b0a570114e24b618d";

    public Moneda buscaMoneda(String baseCode, String targetCode, double monto){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + ApiKey + "/pair/" + baseCode + "/" + targetCode + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No tengo la moneda en consulta.");
        }
    }
}
