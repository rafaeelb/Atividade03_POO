// import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        Corpo_Humano c1 = new Corpo_Humano(55,20.1,1.73);
        System.out.println("A massa é: "+c1.getMassa());
        System.out.println("O volume é de: "+c1.getVolume());
        System.out.println("A densidade(massa/altura) é : "+c1.getDensidade());
        System.out.println("A altura da pessoa é de: " + c1.getAltura());
        System.out.println("O IMC da pessoa é: " + c1.getImc());

        // Ao colocar a linha c1.massa = 2 na classe Corpo_Humano, aparece que a varíavel "massa" não foi 
        // declarada e tem um erro de sintaxe. Ao colocar essa mesma linha na classe App, indica que o 
        // Corpo_Humano.massa não está visível, ou seja, precisaríamos dos métodos getters e setters da varíavel
        // massa para conseguirmos manipular ela na classe.

        // Ao alterar a linha private float massa para public float massa, terá como acessar de fora da classe,
        // porém, ela ficará desprotegida, tornando vulnverável para modificações externas.

        // Ao alterar o método public setMassa para private setMassa, recebemos um aviso que o método setVolume(float)
        // não foi utilizado dentro da classe, ou seja, um método necessariamente precisa ser publico
        // para que ele possa ser manipulado externamente.
    }
}
