import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        GeraArquivo geraArquivo = new GeraArquivo();

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um CEP:");
        String cep = sc.nextLine();

        try {
            ViaCepAPI viaCepAPI = new ViaCepAPI(cep);
            ViaCepRecord viaCep = gson.fromJson(viaCepAPI.retornaResposta(), ViaCepRecord.class);
            ViaCEPImpl viaCEPImpl = new ViaCEPImpl(viaCep);
            geraArquivo.geraArquivo(viaCEPImpl);
        }
        catch (Exception e){
            System.out.println("Erro ao executar o programa");
        }





    }
}