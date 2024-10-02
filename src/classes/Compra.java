package classes;

import java.util.Date;
import java.util.List;

public class Compra {
    
    private int CompraID;
    private int LojaID;
    private int ClienteID;
    private int VendedorID;
    private Date DataDaCompra;
    private Double ValorTotaldaCompra;
    
    List<CompraItem> Items;

    public Compra(int compraID, int lojaID, int clienteID, int vendedorID, Date dataDaCompra, Double valorTotaldaCompra) {
        CompraID = compraID;
        LojaID = lojaID;
        ClienteID = clienteID;
        VendedorID = vendedorID;
        DataDaCompra = dataDaCompra;
        ValorTotaldaCompra = valorTotaldaCompra;
    }

    public void InserirItemCompra(CompraItem item){
        Items.add(item);
    }

}
