
package controller;
import javax.swing.JOptionPane;
import model.*;
import views.*;

public class VerificarLogin extends LoginVerificar {
     private boolean control;
    Usuario c = new Usuario();
    Perfil p = new Perfil();
    Login l = new Login();
    
    
    public void setControl(boolean cl){
       this.control = cl;
    }
    
    public boolean getControl(){
        return this.control;
    }
    
    @Override
    public void Verificar(String n,String s){
        
        if((n.equals(c.getNome())) && (s.equals(c.getSenha()))){   
            
             //this.Iniciar();
            setControl(true);
        }else{
            setControl(false);
           JOptionPane.showMessageDialog(null,"NOME OU SENHA ERRADA!!"); 
        }
        

    }
}
