
package model;

import javax.swing.JTextField;


public class formulario {
    
    private String semana;
    private String horario;
    private String tarefa;
    private String datas;
    
    public void Add_Agenda(String horario, String semana,String tarefa,String dats)
    {
         this.setSemana(semana);
         this.setHorario(horario);
         this.setTarefa(tarefa);
         this.setDatas(dats);
    }
    
    public void setSemana(String semana){
        this.semana = semana;
    }
    public String getSemana(){
        return this.semana;
    }
    
    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getHorario(){
        return this.horario;
    }
    
    public void setTarefa(String tarefa){
        this.tarefa = tarefa;
    }
    public String getTarefa(){
        return this.tarefa;
    }
    public void setDatas(String d){
        this.datas = d;
    }
    public String getDatas(){
        return this.datas;
    }

    public void Paramento_dados(JTextField hora, JTextField data_d, JTextField semana, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
