import javax.swing.*;

public class Medidas {
    public static void main(String[] args) {
        float medida;
        int opcion;

        medida = Float.parseFloat(JOptionPane.showInputDialog("Escriba la cantidad de kilogramos: "));

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
        + "1.- Hectogramos\n"
        + "2.- Decagramos\n"
        + "3.- Gramos\n"
        + "4.- Decigramos\n"
        + "5.- Centigramos\n"
        + "6.- Miligramos"));

        switch (opcion){
            case 1: medida *=10;
            JOptionPane.showMessageDialog(null, "La medida en Hectogramos es: " + medida);
            break;
            case 2: medida *= 100;
                JOptionPane.showMessageDialog(null, "La medida en Decagramos es: " + medida);
                break;
            case 3: medida *=1000;
                JOptionPane.showMessageDialog(null, "La medida en Gramos es: " + medida);
                break;
            case 4: medida *=10000;
                JOptionPane.showMessageDialog(null, "La medida en Decigramos es: " + medida);
                break;
            case 5: medida *= 100000;
                JOptionPane.showMessageDialog(null, "La medida en Centigramos es: " + medida);
                break;
            case 6: medida *= 1000000;
                JOptionPane.showMessageDialog(null, "La medida en Miligramos es: " + medida);
                break;
            default: JOptionPane.showMessageDialog(null, "La opción marcada no existe, por favor intentelo de nuevo");
            break;

        }
    }
}
