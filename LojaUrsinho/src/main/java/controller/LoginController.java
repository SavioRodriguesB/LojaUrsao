/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import to.usuarioLogado;

/**
 *
 * @author elyra
 */
public class LoginController {

    public usuarioLogado autenticadorUrsal(String login, String senha){
    
        ArrayList<usuarioLogado> listaDeUsuariosUrsal = new ArrayList<>();
        
        usuarioLogado elyrabelo = new usuarioLogado(1,1,"elyrabelo","123456");
        usuarioLogado saviorodrigues = new usuarioLogado(2,2,"saviorodrigues","123");
        listaDeUsuariosUrsal.add(elyrabelo);
        listaDeUsuariosUrsal.add(saviorodrigues);
        
        for(int i=0; i<listaDeUsuariosUrsal.size(); i++){
            
            if (listaDeUsuariosUrsal.get(i).getLogin().equals(login) && listaDeUsuariosUrsal.get(i).getSenha().equals(senha)){
                
                return listaDeUsuariosUrsal.get(i);
            }
            
        }
        return null;
    }
    
}
