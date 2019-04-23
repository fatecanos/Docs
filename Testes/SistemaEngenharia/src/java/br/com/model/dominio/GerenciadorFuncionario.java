/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dominio;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class GerenciadorFuncionario {
    List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
    
    public void create(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }
    
    public List<Funcionario> read(String matricula) {
        List<Funcionario> listaBusca = new ArrayList<Funcionario>();
        for(Funcionario f : listaFuncionarios)
            if(matricula.equals(f.getMatricula())) {
                listaBusca.add(f);
            }
                
        return listaBusca;
    }
    
    public void updateNome(String matricula, String nome) {
        List<Funcionario> listaBusca = read(matricula);
        if(listaBusca.size() == 1) {
            Funcionario f = listaBusca.get(0);
            f.setNome(nome);
        }
    }
    
    public void remove(String matricula) {
        for(int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario f = listaFuncionarios.get(i);
            if(matricula.equals(f.getMatricula())){
                listaFuncionarios.remove(i);
            }
        }
    }
    
    public void clear() {
        listaFuncionarios.clear();
    }
}
