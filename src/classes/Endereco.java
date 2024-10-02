package classes;

public class Endereco {
    public String Logradouro; 
    public String Numero;
    public String Bairro;
    public String Municipio;
    public String UF;
    public String CEP;
    
    public Endereco(String logradouro, String numero, String bairro, String municipio, String uF, String cEP) {
        Logradouro = logradouro;
        Numero = numero;
        Bairro = bairro;
        Municipio = municipio;
        UF = uF;
        CEP = cEP;
    }

}
