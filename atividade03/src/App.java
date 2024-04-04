import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Corpo_Humano c1 = new Corpo_Humano(65,20.1,1.70);
        JOptionPane.showMessageDialog(null, "A massa é: "+c1.getMassa() + "\nO volume é: " + c1.getVolume());
        JOptionPane.showMessageDialog(null, "A densidade é: "+c1.getDensidade());
        JOptionPane.showMessageDialog(null, "A altura da pessoa é de: "+c1.getAltura());
        JOptionPane.showMessageDialog(null, "O IMC da pessoa é: "+c1.getImc());
    }
}
