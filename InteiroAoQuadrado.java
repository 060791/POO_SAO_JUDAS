import javax.swing.JOptionPane;

public class InteiroAoQuadrado
{ 
   public static void main (String [] args)
   {
      String sInteiro = JOptionPane.showInputDialog("Digite um inteiro:");
     
     //convertendo
     double inteiro = Double.parseDouble(sInteiro);
     
     //calculo
     double resultado = Math.pow(inteiro, 2);
     
     //resultado
     JOptionPane.showMessageDialog(null, resultado);
    }
}     
