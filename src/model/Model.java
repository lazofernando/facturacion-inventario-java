/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fer
 */
public class Model {
    private int numeroUno;
    private int numeroDos;
    private int resultado;

    public int getNumeroUno() {
        return this.numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return this.numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return this.resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public int multiplicar(){
        this.resultado = this.numeroUno * this.numeroDos;
        return this.resultado;
    }
}
