/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Suma;
import view.VistaCalculadora;

/**
 *
 * @author fer
 */
public class Controlador implements ActionListener{
    private VistaCalculadora vistaX;
    private Suma suma;

    public Controlador(VistaCalculadora vistaX, Suma suma) {
        this.vistaX = vistaX;
        this.suma = suma;
        this.vistaX.btnSuma.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        suma.setNumero1(Integer.parseInt(vistaX.txtNumero1.getText()));
        suma.setNumero2(Integer.parseInt(vistaX.txtNumero2.getText()));
        vistaX.tvtResultado.setText(suma.mostrarSuma());
    }
    
}
