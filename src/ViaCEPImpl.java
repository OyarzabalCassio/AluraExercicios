public class ViaCEPImpl {
  protected   String cep;
    protected  String rua;
    protected  String bairro;
    protected  String cidade;

    ViaCepRecord viaCepRecord;
    public ViaCEPImpl(String cep, String rua, String bairro, String cidade) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public ViaCEPImpl(ViaCepRecord viaCepRecord) {
        this.cep = viaCepRecord.cep();
        this.rua = viaCepRecord.logradouro();
        this.bairro = viaCepRecord.bairro();
        this.cidade = viaCepRecord.localidade();
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Cep=" + cep + '\n' +
                "Rua=" + rua + '\n' +
                "Bairro=" + bairro + '\n' +
                "Cidade=" + cidade ;
    }
}
