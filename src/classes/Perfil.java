package classes;

public class Perfil {

    private int PerfilID;
    private String Descricao;
    
    public Perfil(String descricao) {
        Descricao = descricao;
    }

    public int getPerfilID() {
        return PerfilID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    

}
