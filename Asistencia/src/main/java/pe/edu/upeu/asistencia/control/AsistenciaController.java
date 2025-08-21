package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import javax.swing.text.TabExpander;

@Controller
public class AsistenciaController {


    @FXML TextField TxtNum1,TxtNum2;
    @FXML Label txtResult;

    @FXML

    public void sumar (){
        double num1 = Double.parseDouble(TxtNum1.getText());
        double num2 = Double.parseDouble(TxtNum2.getText());
        double resultado = num1 + num2;
        txtResult.setText(Double.toString(resultado));


    }

}
