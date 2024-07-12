import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepAPI {
    private String cep;
    private String requisicao;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public ViaCepAPI(String cep) throws IOException, InterruptedException {
        this.cep = cep;
        this.requisicao = "http://viacep.com.br/ws/" + cep + "/json";
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder()
                .uri(URI.create(requisicao))
                .build();
        this.response = client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public String retornaResposta() {
        return response.body();
    }
}
