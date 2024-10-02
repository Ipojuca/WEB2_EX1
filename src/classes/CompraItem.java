package classes;

public class CompraItem {
    private int CompraID;
    private int ProdutoID;
    private Double Quantidade;
    private Double Preco;
    
    public CompraItem(int compraID, int produtoID, Double quantidade, Double preco) {
        CompraID = compraID;
        ProdutoID = produtoID;
        Quantidade = quantidade;
        Preco = preco;
    }
}
