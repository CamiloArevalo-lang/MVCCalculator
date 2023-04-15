package controller;

import model.CalculatorModel; //Importa el modelo de nuestra calculadora.
import view.CalculatorView;// Importa la vista de nuestra calculadora.

public class CalculatorController{

    CalculatorView theView; //Se trae la vista o la interfaz grafica que el usuario va a ver.

    CalculatorModel theModel; //Se trae el modelo que es todo nuestro apartado de logica.

    /**
     * Avisa a la vista que siempre que el botón Calcular se hace clic se ejecuta el
     * método actionPerformed en la clase interna CalculateListener.
     * 
     * @param theView
     * @param theModel
     */
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView; // Indica que esta vista es igual a la otra que estamos manejando.
        this.theModel = theModel;//Indica que este modelo es igual al otro que estamos manejando.
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}