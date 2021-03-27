package dylan.perez.calculadora;

import dylan.perez.calculadora.view.TelaCalculadora;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        JFrame tela = new JFrame();
        tela.setContentPane(new TelaCalculadora().getPanelCalculadora());
        tela.pack();
        tela.setVisible(true);
    }
}
