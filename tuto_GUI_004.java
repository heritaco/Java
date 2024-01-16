import javax.swing.JOptionPane;

public class tuto_GUI_004 { // grafical user interface
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos años tienes?"));
        // hicimos esto porque siempre regresa un string y queremos un int
        JOptionPane.showMessageDialog(null, "Tienes " + age + " años?");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu altura?"));
        JOptionPane.showMessageDialog(null, "Mides " + altura + " metros?");
    }

}
