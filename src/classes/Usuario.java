package classes;

public class Usuario {

    private int UsuarioID;
    
    private String Nome;
    private String Email;
    private String Senha;
    
    public int getUsuarioID() {
        return UsuarioID;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean VerificarSenha(String senha){
        return (Senha == senha);
    }
    
    public void setSenha(String senhaAtual, String senha) {
        if (VerificarSenha(senhaAtual) ){
            Senha = senha;
        }
    }

    public Usuario(String nome, String email, String senha) {
        Nome = nome;
        Email = email;
        Senha = senha;
    }
}
