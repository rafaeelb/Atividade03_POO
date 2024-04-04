import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Corpo_Humano c1 = new Corpo_Humano(10,20,30);
        JOptionPane.showMessageDialog(null, "A massa é: "+c1.getMassa());
        JOptionPane.showMessageDialog(null, "O volume é: "+c1.getVolume());
        JOptionPane.showMessageDialog(null, "A densidade é: "+c1.getDensidade());
        JOptionPane.showMessageDialog(null, "A altura: "+c1.getAltura());
        JOptionPane.showMessageDialog(null, "O IMC é: "+c1.getImc());
    }
}
