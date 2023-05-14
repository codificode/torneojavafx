/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codificode.pruebastorneo3;

import javafx.scene.control.Button;

/**
 *
 * @author rubic
 */
public class BotonTorneo extends Button{
    
    private int enfrentamiento;
    
    //posicionEnLista empiezan por cero
    private int posicionEnLista;
    private int columna;

    public int getEnfrentamiento() {
        return enfrentamiento;
    }

    public void setEnfrentamiento(int enfrentamiento) {
        this.enfrentamiento = enfrentamiento;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getPosicionEnLista() {
        return posicionEnLista;
    }

    public void setPosicionEnLista(int posicionEnLista) {
        this.posicionEnLista = posicionEnLista;
    }
  
    
}
