package model;

public class CalculatorModel {
    // Holds the value of the sum of the number entered in the view

    
    private int calculationValue; //Una variable privada que manejamos para que almacene el valor de nuestra suma.
    
    /**
     * Suma de nuestros dos números enteros.
     * @param firstNumber el primer número a sumar
     * @param secondNumber el segundo número a sumar
     * En el apartado de "CalculationValue" es donde no va a almacenar nuestro valor de la suma.
     */

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber; // Proceso matematico
    } 

    /**
     * @return el numero de nuestra respuesta a la suma el cual esta almacenado en
     * "calculationValue".
     */
    public int getCalculationValue() {
        return calculationValue;
    }   
}