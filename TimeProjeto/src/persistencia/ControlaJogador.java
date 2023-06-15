/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
    import java.util.ArrayList;
import negocio.Jogador;

/**
 *
 * @author bella
 */
public class ControlaJogador {

        ArrayList<Jogador> jogador = new ArrayList<>(); 
        
        public boolean salvar (Jogador v) {
            if (v != null) {    
            jogador.add(v);
                return true;  
        }else { 
            return false;
        }
        }
    
    public ArrayList <Jogador> retornarTodos () { 
       return jogador; 
}} 
 

