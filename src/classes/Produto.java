package classes;

public class Produto {

    private int ProdutoID;
    private String Nome;
    private String Descricao;
    private double PrecoCusto;
    private double PrecoVenda;

    public Produto(String nome, String descricao, double precoCusto, double precoVenda) {
        Nome = nome;
        Descricao = descricao;
        PrecoCusto = precoCusto;
        PrecoVenda = precoVenda;
    }
    
    public int getProdutoID() {
        return ProdutoID;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public double getPrecoCusto() {
        return PrecoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        PrecoCusto = precoCusto;
    }
    public double getPrecoVenda() {
        return PrecoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        PrecoVenda = precoVenda;
    }


}
