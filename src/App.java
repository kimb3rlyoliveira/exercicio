import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double number_1 = 0;
        double number_2 = 0;
        boolean validInput = false;

        JOptionPane.showMessageDialog(null, "Informe dois números");
        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "1º número");
            String input_2 = JOptionPane.showInputDialog(null, "2º número");
            try {
                number_1 = Double.parseDouble(input_1);
                number_2 = Double.parseDouble(input_2);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números informados é " + (number_1 + number_2));
    }
}