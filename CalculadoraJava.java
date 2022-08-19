/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Mariana Nayeli Gordillo Padilla
 * 21005740
 */
public class CalculadoraJava extends JFrame {
   
    JTextField txtKey;

    //botones    
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonC;
    Button buttonsuma;
    Button buttonresta;
    Button buttonmulti;
    Button buttondiv;
    Button buttonigual;
    
    ListenButton listenButton;
    
    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;

    
    public CalculadoraJava (){
        setTitle("Calculadora Java");
        setSize(360, 450);
        setLayout(null);        
        setLocationRelativeTo(null);
        
        
        txtKey = new JTextField();
        txtKey.setBounds(10, 10, 330, 50);
        
        //botones
        button1 = new Button("1");
        button1.setBounds(5,65,80,80 );
        button2 = new Button("2");
        button2.setBounds(90,65,80,80 );
        button3 = new Button("3");
        button3.setBounds(175,65,80,80 );
        buttonsuma = new Button("+");
        buttonsuma.setBounds(260,65,80,80 );
        button4 = new Button("4");
        button4.setBounds(5,150,80,80 );
        button5 = new Button("5");
        button5.setBounds(90,150,80,80 );
        button6 = new Button("6");
        button6.setBounds(175,150,80,80 );
        buttonresta = new Button("-");
        buttonresta.setBounds(260,150,80,80 );
        button7 = new Button("7");
        button7.setBounds(5,235,80,80 );
        button8 = new Button("8");
        button8.setBounds(90,235,80,80 );
        button9 = new Button("9");
        button9.setBounds(175,235,80,80 );
        buttonmulti = new Button("*");
        buttonmulti.setBounds(260,235,80,80 );
        buttonC = new Button("C");
        buttonC.setBounds(5,320,80,80 );
        button0 = new Button("0");
        button0.setBounds(90,320,80,80 );
        buttonigual = new Button("=");
        buttonigual.setBounds(175,320,80,80 );
        buttondiv = new Button("/");
        buttondiv.setBounds(260,320,80,80 );
        
        
       
        getContentPane().add(txtKey);
        
        
        //getcontent de los botones
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(button4);
        getContentPane().add(button5);
        getContentPane().add(button6);
        getContentPane().add(button7);
        getContentPane().add(button8);
        getContentPane().add(button9);
        getContentPane().add(button0);
        getContentPane().add(buttonC);
        getContentPane().add(buttonsuma);
        getContentPane().add(buttonresta);
        getContentPane().add(buttonmulti);
        getContentPane().add(buttondiv);
        getContentPane().add(buttonigual);
        
        //Instancia de la clase oyente
        listenButton = new ListenButton();
        
        button1.addActionListener(listenButton);
        button2.addActionListener(listenButton);
        button3.addActionListener(listenButton);
        button4.addActionListener(listenButton);
        button5.addActionListener(listenButton);
        button6.addActionListener(listenButton);
        button7.addActionListener(listenButton);
        button8.addActionListener(listenButton);
        button9.addActionListener(listenButton);
        button0.addActionListener(listenButton);
        buttonsuma.addActionListener(listenButton);
        buttonresta.addActionListener(listenButton);
        buttonmulti.addActionListener(listenButton);
        buttondiv.addActionListener(listenButton);
        buttonigual.addActionListener(listenButton);
        buttonC.addActionListener(listenButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                                      
        CalculadoraJava calculadorajava = new CalculadoraJava ();   
    }
    
    public class ListenButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "1";
                }else{
                    cadenaNumeros += "1";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            } if (e.getSource() == button2){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "2";
                }else{
                    cadenaNumeros += "2";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button3){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "3";
                }else{
                    cadenaNumeros += "3";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button4){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "4";
                }else{
                    cadenaNumeros += "4";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button5){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "5";
                }else{
                    cadenaNumeros += "5";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button6){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "6";
                }else{
                    cadenaNumeros += "6";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button7){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "7";
                }else{
                    cadenaNumeros += "7";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button8){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "8";
                }else{
                    cadenaNumeros += "8";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button9){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "9";
                }else{
                    cadenaNumeros += "9";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            }if (e.getSource() == button0){
                if(txtKey.getText().equals("0")){
                    cadenaNumeros = "0";
                }else{
                    cadenaNumeros += "0";
                }
                txtKey.setText(cadenaNumeros);
                activado = true;
            } if (e.getSource() == buttonsuma){
                if (activado == true){
                    primerNumero = Double.parseDouble(cadenaNumeros);
                    txtKey.setText(" + ");
                    cadenaNumeros = "";
                    operacion = "sumar";
                    
                    activado = false;
                }
            } if (e.getSource() == buttonresta){
                if (activado == true){
                    primerNumero = Double.parseDouble(cadenaNumeros);
                    txtKey.setText(" - ");
                    cadenaNumeros = "";
                    operacion = "restar";
                    
                    activado = false;
                }
            } if (e.getSource() == buttonmulti){
                if (activado == true){
                    primerNumero = Double.parseDouble(cadenaNumeros);
                    txtKey.setText(" * ");
                    cadenaNumeros = "";
                    operacion = "multiplicar";
                    
                    activado = false;
                }
            } if (e.getSource() == buttondiv){
                if (activado == true){
                    primerNumero = Double.parseDouble(cadenaNumeros);
                    txtKey.setText(" / ");
                    cadenaNumeros = "";
                    operacion = "dividir";
                    
                    activado = false;
                }
            } if (e.getSource() == buttonigual){
                double segundoNumero;
                if(operacion.equals("sumar")){
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    resultado = primerNumero + segundoNumero;;
                    txtKey.setText(String.format("% .2f",resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                } if(operacion.equals("restar")){
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    resultado = primerNumero - segundoNumero;;
                    txtKey.setText(String.format("% .2f",resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }if(operacion.equals("multiplicar")){
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    resultado = primerNumero * segundoNumero;;
                    txtKey.setText(String.format("% .2f",resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }if(operacion.equals("dividir")){
                    segundoNumero = Double.parseDouble(cadenaNumeros);
                    if(segundoNumero == 0){
                        txtKey.setText("No se divide por 0");
                    } else{
                        resultado = primerNumero / segundoNumero;;
                        txtKey.setText(String.format("% .2f",resultado));
                        cadenaNumeros = String.valueOf(resultado);
                        operacion = "nula";
                    }
                }
                //txtKey.setText("");
                activado = true;
            } if (e.getSource() == buttonC){
                txtKey.setText("  ");
                cadenaNumeros= "";
                operacion = "nula";
                activado = true;
            }
        }  
    }
}
