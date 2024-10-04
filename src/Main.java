import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        Object[] options = {"Convertir Moneda", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "Quieres convertir monedas?", "Conversor",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        boolean continuarPrograma = false;
        DecimalFormat formatearDivisa = new DecimalFormat("#.##");

        if (elige == 1) {
            JOptionPane.showConfirmDialog(null, "Programa Finalizado");
            System.exit(0);
        }
        if (elige == 0) {
            continuarPrograma = true;
        }
        while (continuarPrograma) {
            String[] opciones = {"Soles a Euros", "Soles a Dolares", "Soles a Libras Esterlinas", "Soles a Yen",
                    "Soles a Won"};
            String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción",
                    "Conversor de Monedas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            String input = JOptionPane.showInputDialog(null,"Ingrese cantidad de Soles:");
            double soles = 0;
            try{
                soles = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido");
            }

            if (cambio.equals("Soles a Euros")) {
                double euros = soles * 0.26; // Tasa de cambio aproximada
                JOptionPane.showMessageDialog(null, soles + " Soles son: " + formatearDivisa.format(euros) + " Euros.");
            }
            if (cambio.equals("Soles a Dolares")) {
                double dolares = soles * 0.27; // Tasa de cambio aproximada
                JOptionPane.showMessageDialog(null, soles + " Soles son: " + formatearDivisa.format(dolares) + " Dólares.");
            }
            if (cambio.equals("Soles a Libras Esterlinas")) {
                double libras = soles * 0.22; // Tasa de cambio aproximada
                JOptionPane.showMessageDialog(null, soles + " Soles son: " + formatearDivisa.format(libras) + " Libras Esterlinas.");
            }
            if (cambio.equals("Soles a Yen")) {
                double yenes = soles * 40.88; // Tasa de cambio aproximada
                JOptionPane.showMessageDialog(null, soles + " Soles son: " + formatearDivisa.format(yenes) + " Yenes.");
            }
            if (cambio.equals("Soles a Won")) {
                double wones = soles * 363.58; // Tasa de cambio aproximada
                JOptionPane.showMessageDialog(null, soles + " Soles son: " + formatearDivisa.format(wones) + " Wones.");
            }
            int confirma = JOptionPane.showConfirmDialog(null,"¿Desea continuar ejecutando?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
        }
    }
}