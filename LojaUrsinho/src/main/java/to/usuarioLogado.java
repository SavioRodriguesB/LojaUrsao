/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to;

/**
 *
 * @author savio
 */
public class UsuarioLogado {
    
    private Integer id;
    private Integer idPessoa;
    private String Login;
    private String Senha;

    public UsuarioLogado() {
    }

    public UsuarioLogado(Integer id, Integer idPessoa, String Login, String Senha) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.Login = Login;
        this.Senha = Senha;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    
    
}
