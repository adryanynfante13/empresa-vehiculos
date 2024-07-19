import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacionAlquiler {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Alquiler de Vehículos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        JLabel matriculaLabel = new JLabel("Matrícula:");
        matriculaLabel.setBounds(10, 20, 80, 25);
        panel.add(matriculaLabel);

        JTextField matriculaText = new JTextField(20);
        matriculaText.setBounds(100, 20, 165, 25);
        panel.add(matriculaText);

        JLabel diasLabel = new JLabel("Días de alquiler:");
        diasLabel.setBounds(10, 50, 150, 25);
        panel.add(diasLabel);

        JTextField diasText = new JTextField(20);
        diasText.setBounds(150, 50, 165, 25);
        panel.add(diasText);

        JLabel tipoLabel = new JLabel("Tipo de vehículo:");
        tipoLabel.setBounds(10, 80, 150, 25);
        panel.add(tipoLabel);

        String[] tipos = { "Coche", "Microbus", "Furgoneta de carga", "Camion" };
        JComboBox<String> tipoComboBox = new JComboBox<>(tipos);
        tipoComboBox.setBounds(150, 80, 165, 25);
        panel.add(tipoComboBox);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 110, 150, 25);
        panel.add(calcularButton);

        JLabel resultadoLabel = new JLabel("Precio:");
        resultadoLabel.setBounds(10, 140, 300, 25);
        panel.add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String matricula = matriculaText.getText();
                    int dias = Integer.parseInt(diasText.getText());
                    String tipo = (String) tipoComboBox.getSelectedItem();

                    Vehiculo vehiculo;
                    switch (tipo) {
                        case "Coche":
                            vehiculo = new Coche(matricula, dias);
                            break;
                        case "Microbus":
                            vehiculo = new Microbus(matricula, dias);
                            break;
                        case "Furgoneta de carga":
                            double pesoCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso máximo autorizado (toneladas):"));
                            vehiculo = new FurgonetaCarga(matricula, dias, pesoCarga);
                            break;
                        case "Camion":
                            pesoCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso máximo autorizado (toneladas):"));
                            vehiculo = new Camion(matricula, dias, pesoCarga);
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo de vehículo no válido");
                    }

                    double precio = vehiculo.calcularPrecio();
                    resultadoLabel.setText("Precio: $" + precio);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
