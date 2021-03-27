package dylan.perez.calculadora.view;

import dylan.perez.calculadora.model.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCalculadora {
    private JPanel panelCalculadora;
    private JTextField txtV1;
    private JTextField txtV2;
    private JTextArea txtResult;
    private JButton cmdSomar;
    private JButton cmdSubtrair;
    private JButton cmdMultiplicar;
    private JButton cmdDividir;
    private JButton cmdSair;
    private Calculadora calculo;
    protected Dimension dFrame, dLabel, dTextField, dButton;

    public JPanel getPanelCalculadora() {
        return panelCalculadora;
    }

    public TelaCalculadora() {
        calculo = new Calculadora();

        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        cmdSomar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    txtResult.setText(calculo.suma(Double.parseDouble(txtV1.getText()), Double.parseDouble(txtV2.getText())));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Hubo un error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cmdSubtrair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    txtResult.setText(calculo.resta(Double.parseDouble(txtV1.getText()), Double.parseDouble(txtV2.getText())));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Hubo un error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cmdMultiplicar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    txtResult.setText(calculo.multiplicacion(Double.parseDouble(txtV1.getText()), Double.parseDouble(txtV2.getText())));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Hubo un error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cmdDividir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    txtResult.setText(calculo.division(Double.parseDouble(txtV1.getText()), Double.parseDouble(txtV2.getText())));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Hubo un error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
