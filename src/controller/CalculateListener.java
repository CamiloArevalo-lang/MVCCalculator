package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateListener implements ActionListener{
    /**
     * Las variables finales solo se usan en aquellos valores que sabemos de
     * antemano que no van a variar, o sea, que permanecerán constantes durante la
     * ejecución del programa.
     */
    private final CalculatorController calculatorController;

    /**
     * @param calculatorController
     */
    CalculateListener(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    /**
     * Las acciones envolventes con la vista con un bloque de prueba en caso de que los numeros no se hayan 
     * introducido correctamente se hace con la interncion de notificar al usuario que solo puede ingresar
     * número enteros.
     */
    public void actionPerformed(ActionEvent e){
        int firstNumber;
        int secondNumber = 0;
        try {
            firstNumber = this.calculatorController.theView.getFirstNumber();//Vista de nuestro primer número.
            secondNumber = this.calculatorController.theView.getSecondNumber();//Vista de nuestro segundo número.
            /**
             * En este punto se genera el proceso de "mesaje de error", es decir una ventana emergente
             * la cual nos indica que el proceso unicamente es valido con implementacion de dos números
             * enteros.
             */
            this.calculatorController.theModel.addTwoNumbers(firstNumber, secondNumber);
            this.calculatorController.theView.setCalcSolution(this.calculatorController.theModel.getCalculationValue());
        }catch (NumberFormatException ex) {
            System.out.println(ex);
            this.calculatorController.theView.displayErrorMessage(" Ingrese dos números enteros "); //Mensaje de nuestra ventana emergente
        }
    }
}   