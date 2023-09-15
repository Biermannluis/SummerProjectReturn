/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 180000B1Z
 */
public class Exercicio_Model {

    private String nome, grupo;
    private boolean maquina, multiarticular;

    public Exercicio_Model(String nome, String grupo, boolean maquina, boolean multiarticular) {
        this.nome = nome;
        this.grupo = grupo;
        this.maquina = maquina;
        this.multiarticular = multiarticular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isMaquina() {
        return maquina;
    }

    public void setMaquina(boolean maquina) {
        this.maquina = maquina;
    }

    public boolean isMultiarticular() {
        return multiarticular;
    }

    public void setMultiarticular(boolean multiarticular) {
        this.multiarticular = multiarticular;
    }
    public static ArrayList<Exercicio_Model> retornaListaExercicios_PorGrupo(ArrayList<Exercicio_Model> lista_geral,String grupo){
       ArrayList<Exercicio_Model> lista_grupo= new ArrayList<Exercicio_Model>();
        System.out.println("retornaListaExercicios_PorGrupo"+grupo);
        for(Exercicio_Model ex:lista_geral){
            if (ex.grupo.equals(grupo)){
                lista_grupo.add(ex);  
                System.out.println(ex.getNome()+"adicionado");
            }
        }
        return lista_grupo;
        
        
    }
    
    public void AddLista(ArrayList<Exercicio_Model> lista_geral ){
        lista_geral.add(this);
    }
}