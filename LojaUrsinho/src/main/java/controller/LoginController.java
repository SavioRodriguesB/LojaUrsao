/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import to.UsuarioLogado;

/**
 *
 * @author elyra
 */
public class LoginController {
    
    ArrayList<UsuarioLogado> listaDeUsuariosUrsal = new ArrayList<>();

    public UsuarioLogado autenticadorUrsal(String login, String senha){
    
        carregarListaDeUsuariosUrsal();
        
        for(int i=0; i<listaDeUsuariosUrsal.size(); i++){
            if (listaDeUsuariosUrsal.get(i).getLogin().equals(login) && listaDeUsuariosUrsal.get(i).getSenha().equals(senha)){
                return listaDeUsuariosUrsal.get(i);
            }
        }
        return null;
    }
    
    private void carregarListaDeUsuariosUrsal(){
        
        UsuarioLogado elyrabelo = new UsuarioLogado(1,1,"elyrabelo","123456");
        UsuarioLogado saviorodrigues = new UsuarioLogado(2,2,"saviorodrigues","123");
        listaDeUsuariosUrsal.add(elyrabelo);
        listaDeUsuariosUrsal.add(saviorodrigues);
    }
    
}
