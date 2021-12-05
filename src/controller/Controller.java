/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.Vista;

/**
 *
 * @author fer
 */
public class Controller implements ActionListener{
//    instaciamos las clases que hemos creado
    private Model model;
    private Vista view;
    
    public Controller(Vista wiew,Model model){
        this.view = wiew;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC prueba");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.txtnum1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtnum2.getText()));
        model.multiplicar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));

    }
}
