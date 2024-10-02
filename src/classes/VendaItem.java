package classes;

public class VendaItem {

    private int VendaID;
    private int ProdutoID;
    private Double Quantidade;
    private Double Preco;
    
    public VendaItem(int vendaID, int produtoID, Double quantidade, Double preco) {
        VendaID = vendaID;
        ProdutoID = produtoID;
        Quantidade = quantidade;
        Preco = preco;
    }

}
