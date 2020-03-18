import javax.swing.JOptionPane;

public class AreaRetengulo
   {
      public static void main (String [] args)
      {      
      String sBase = JOptionPane.showInputDialog("Digite a bases:");
      String sAltura = JOptionPane.showInputDialog("Digite a altura:");
      
      //convertendo
      double peso = Double.parseDouble(sBase);
      double altura = Double.parseDouble(sAltura);
      
      //calculo
      double area = peso * altura;
      
      //esultado
      JOptionPane.showMessageDialog(null, "Area = " + area);
      }
   }