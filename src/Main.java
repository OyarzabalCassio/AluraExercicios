import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um CEP:");
        String cep = sc.nextLine();
        ViaCepAPI viaCepAPI = new ViaCepAPI(cep);
        String resposta = viaCepAPI.retornaResposta();

     //   System.out.println(resposta);

        ViaCepRecord viaCep = gson.fromJson(resposta, ViaCepRecord.class);
        System.out.println(viaCep);

        ViaCEPImpl viaCEPImpl = new ViaCEPImpl(viaCep);

        System.out.println(viaCEPImpl);


        File file = new File("arquivoCEP.txt");

        FileWriter fw = new FileWriter(file);

        fw.write(gson.toJson(viaCEPImpl));
        fw.close();




    }
}