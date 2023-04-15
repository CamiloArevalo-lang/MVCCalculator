package app;

import controller.CalculatorController;
import model.CalculatorModel; // Traemos el modelo de nuestro package "model"
import view.CalculatorView; // Traemos la vista de nuestro package "view"

public class MVCCalculator {
     /**
     * En este punto se genera todo lo que es nuestro método principal de nuestra aplicacion "calculadora"
     * ademas de esto traemos diferentes objetos los cuales son CalculatorController  el cual acoje todos 
     * los parametros de la vista que realizamos en otro "package" y tambien acoje todos los parametros
     * del modelo que esta ubicado en otro "package".
     */

    public static void main(String[]args) {
        // Crea un objeto CalculatorView y un objeto CalculatorModel.
        view.CalculatorView theView = new CalculatorView(); //Traemos la vista o la interfaz grafica.
        CalculatorModel theModel = new model.CalculatorModel(); //Traemos el modelo datos y logica de nuestro proceso.
        
        //CalculatorController theController = new CalculatorController(theView, theModel);
        // Para no generar un error se instancia un objeto de calcularController
        /**
         * "Controller" Se encarga de recibir las acciones de usuario desde la vista, genera el proceso
         * y las actualiza en el modelo y la vista en este orden de ideas. 
         * Es nuestro "intermedio"
         */
        new CalculatorController(theView, theModel); 
        theView.setVisible(true);
    }
}

