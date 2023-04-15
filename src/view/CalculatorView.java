package view;
// Esta es la Vista, su único trabajo es mostrar lo que el usuario ve
// No ejecuta ningún cálculo, sino que solamente pasa la información ingresada por el usuario a quien la necesite
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {
    private static final long serialVersionUID =1L;
	private JTextField firstNumber = new JTextField(10); ///Tamaño de nuestra columna del primer número.
	private JLabel additionLabel = new JLabel("+");/// Simbolo de suma.
	private JTextField secondNumber = new JTextField(10);///Tamaño de nuestra columna del segundo número.
	private JButton calculateButton = new JButton("Calcular"); // Boton "Calcular"
	private JTextField calculateSolution = new JTextField(10);///Tamaño de nuestra colmna donde se almacena el resultado.
	
    /**
     * Configura la vista y añade los componente
 	 * El constructor que implemtamos denominado CalculatorView genera los cambios a la vista
 	 */
    public CalculatorView()  { 
		JPanel calculatePanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 100); ///Tamaño de nuestra interfaz de la calcualdora
		calculatePanel.add(firstNumber); ///Panel donde colocamos nuestro primer número.
		calculatePanel.add(additionLabel);//Simbolo de suma.
		calculatePanel.add(secondNumber);///Panel donde colocamos nuestro segundo número.
		calculatePanel.add(calculateButton);///Panel donde colocamos nuestro boton de "calcular".
		calculatePanel.add(calculateSolution);///Panel donde se almacena nuestra respuesta.
		this.add(calculatePanel);
		// Fin de configuración de componentes
    }
	
	/**
     * El usuario ingresa el valor del primer numero en la celda o panel.
     * El método "getFirstNumber" devuelve el valor entero que se obtiene al analizar el texto que el
     * usuario ingreso denominado como "firtsNumber".
     * 
     * De tal forma que el texto que sea ingresado sea convertido a entero utilizando "Integer.parseInt"
     * 
     * @return firtsNumber inrgesado por el usuario.
     */

	public int getFirstNumber() { 
		return Integer.parseInt(firstNumber.getText()); 
	}

	/**
     * Este método devuelve un valor entero que se obtiene al analizar el texto ingresado por el usuario
     * denominado como "secondNumber", al momento de contener el texto, este se puede convertir a entero
     * mediante el uso de "Integer.parseInt".
     *
     * @return secondNumber ingresado por el usuario
     */

	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}

	/**
     * El método "getCalcSolution" devuelve un valor entero que se obtiene al analizar las dos 
     * operaciones anteriormente mencionadas, al momento de contener el texto, este se puede convertir 
     * a entero mediante el uso de "Integer.parseInt".
     *
     *@return calculateSolution en el cual esta la solucion de nuestra operación.
     */

	public int getCalcSolution() {		
		return Integer.parseInt(calculateSolution.getText());
	}

	/**
    * El método "setCalcSolution" establece el valor de un componente referido como "calculateSolution" 
    * con el resultado de la conversión de un entero a texto mediante el uso de "Integer.toString", por
    * su parte el apartado de "solution" representa la solución de un cálculo. 
    * @param la solucion de nuestro problema como entero 
    */
	
	public void setCalcSolution(int solution) {
		calculateSolution.setText(Integer.toString(solution)); 
	}

	/**
     * Si se hace clic en CalculateButton, ejecutr un método en el controlador llamado actionPerformed()
     * generando de tal forma el apartado del calculo. 
	 *@param listenForCalcButton
     */ 
	public void addCalculateListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	/**
     * Abrimos una ventana emergente que contiene el mensaje de error pasado 
	 * @param  errorMessage
     */
	public void displayErrorMessage(String errorMessage) { // El mensaje se puede encontrar en el package controller.
		JOptionPane.showMessageDialog(this, errorMessage);	
	}

}