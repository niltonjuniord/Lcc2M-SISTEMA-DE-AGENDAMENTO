/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nilto
 */
public class Usuario {
    
    private final String  nome = "Nilton";
    private final String senha = "123";
    private final String nome_completo= "Nilton Júnior Castelão da Silva";

    private final String n_estudante = "20230214";
    private final String trabalho = "Programação III";
    private final String datas = "24/04/2002";
    private final String turma = "LCC2M";
    private final String curso = "CIÊNCIA DA COMPUTAÇÃO";
    private final String turno = "Manhã";
    private final String ano_l = "2024/2025";
    private final String residente = "Talatona";
    
    
    
    
    public String getNome(){
        
        return this.nome;
    }
    public String getano_L(){
        return this.ano_l;
    }
    
    public String getSenha(){
        
        return this.senha;
    }
    public String getNome_Completo(){ 
        return this.nome_completo;
    }
     
          public String getN_estudante(){ 
        return this.n_estudante;
    }
             public String getTrabalho(){ 
        return this.trabalho ;
    }
                public String getDatas(){ 
        return this.datas;
    }
     public String getTurma(){ 
        return this.turma;
    }           
    public String getCurso(){ 
        return this.curso;
    }
    
    public String getTurno(){
        
        return this.turno;
    }
    public String getReside(){
        return this.residente;
    }
}
