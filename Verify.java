import javax.swing.JOptionPane;
/**
 * Escreva uma descrição da classe Verify aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Verify
{   
   public static boolean cancel = false; 
   public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            InOut.print("Erro (Digite apenas numeros)");
            return false;
        }
    } 
    public static void isNull(String text){
        if (text == null){
            CadastrarAluno.running = false;
        }
    }
    public static boolean contemNumero(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
