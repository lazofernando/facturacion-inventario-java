package mvc;

import controller.Controlador;
import controller.Controller;
import model.Conexion;
import model.Model;
import model.Suma;
import view.Vista;
import view.VistaCalculadora;

public class App {
    /*
    public static void main(String[] args) {
        Model mod = new Model();
        Vista view = new Vista();
        
        Controller ctrl = new Controller(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
*/
    
   /* 
    public static void main(String[] args) {
        Suma suma = new Suma();
        VistaCalculadora vista1 = new VistaCalculadora();
        Controlador controlador = new Controlador(vista1, suma);
        vista1.setVisible(true);
    }
*/
        public static void main(String[] args) {
        Conexion conn = new Conexion();
        conn.getConnection();
    }
}
    