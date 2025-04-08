import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Escreva uma descrição da classe Saida aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class InOut
{
    
    public static void print(String msg){
        if(CadastrarAluno.graf == true){
            JOptionPane.showMessageDialog(null, msg);
        }else{
            System.out.println(msg);
        }
    }
    public static String entrada(String msg){
        Scanner sc = new Scanner(System.in);
        String toReturn;
        if(CadastrarAluno.graf == true){
            toReturn = JOptionPane.showInputDialog(msg);
            return toReturn;
        }else{
            System.out.println(msg);
            toReturn = sc.nextLine();
            return toReturn;
        }
    }
}
