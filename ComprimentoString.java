import javax.swing.JOptionPane;

public class ComprimentoString
   {
      public static void main (String [] args)
      {      
      String sPrimeira = JOptionPane.showInputDialog("Digite a Primeira String:");
      String sSegunda = JOptionPane.showInputDialog("igite a Segunda String:");
      String sTerceira = JOptionPane.showInputDialog("igite a Terceira String:");
      
      //convertendo
      int primeira = sPrimeira.length();
      int segunda = sSegunda.length();
      int terceira = sTerceira.length();
      
      //calculo
      int soma = primeira + segunda + terceira;
      
      //esultado
      JOptionPane.showMessageDialog(null, soma);
      }
   }