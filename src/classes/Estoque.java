package classes;

public class Estoque {

    private int LojaID;
    private int ProdutoID;
    private double Estoque;
    private double EstoqueMinimo;
    public Estoque(int lojaID, int produtoID, double estoque, double estoqueMinimo) {
        LojaID = lojaID;
        ProdutoID = produtoID;
        Estoque = estoque;
        EstoqueMinimo = estoqueMinimo;
    }
    public int getLojaID() {
        return LojaID;
    }
    public int getProdutoID() {
        return ProdutoID;
    }
    public double VerificarEstoqueDisponivel() {
        return Estoque;
    }
    public void setEstoque(double estoque) {
        Estoque = estoque;
    }
    public double getEstoqueMinimo() {
        return EstoqueMinimo;
    }
    public void setEstoqueMinimo(double estoqueMinimo) {
        EstoqueMinimo = estoqueMinimo;
    }

    public boolean ItemAbaixoDoMinimo(){
        return (Estoque < EstoqueMinimo);
    }

    

}
