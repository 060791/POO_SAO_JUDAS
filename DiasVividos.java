import javax.swing.JOptionPane;

public class DiasVividos
   {
      public static void main(String[] args)
         {
            
            String sIdade = JOptionPane.showInputDialog ("Digite sua idade:");
            
            //convertendo
            double idade = Double.parseDouble(sIdade);
            
            //calculando os dias
            double dias = idade * 365;
            
            //resultado
            JOptionPane.showMessageDialog(null, "dias vividos = " + dias);
         }
    }                