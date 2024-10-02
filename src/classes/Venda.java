package classes;

import java.util.Date;
import java.util.List;

public class Venda {
    
    private int VendaID;
    private int LojaID;
    private int ClienteID;
    private int VendedorID;
    private Date DataDaVenda;
    private Double ValorTotaldaVenda;
    
    List<VendaItem> Items;

    public Venda(int vendaID, int lojaID, int clienteID, int vendedorID, Date dataDaVenda, Double valorTotaldaVenda) {
        VendaID = vendaID;
        LojaID = lojaID;
        ClienteID = clienteID;
        VendedorID = vendedorID;
        DataDaVenda = dataDaVenda;
        ValorTotaldaVenda = valorTotaldaVenda;
    }

    public void InserirItemVenda(VendaItem item){
        Items.add(item);
    }

}
