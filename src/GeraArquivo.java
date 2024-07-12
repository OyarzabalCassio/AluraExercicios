import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {


    public void geraArquivo(ViaCEPImpl viaCEP) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter(viaCEP.cep + ".json");
        fw.write(gson.toJson(viaCEP));
        fw.close();
    }
}
