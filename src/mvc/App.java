package mvc;

import controller.Controller;
import model.Model;
import view.Vista;

public class App {
    public static void main(String[] args) {
        Model mod = new Model();
        Vista view = new Vista();
        
        Controller ctrl = new Controller(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
}
    