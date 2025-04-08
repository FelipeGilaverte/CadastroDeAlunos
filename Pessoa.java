import javax.swing.JOptionPane;
import java.util.*;
public class Pessoa {
    int idade;
    String id;
    String nome;

    public Pessoa() {
        if(Verify.cancel == false){
            SetNome(); 
        }
        if(Verify.cancel == false){
            SetIdade(); 
        }
        if(Verify.cancel == false){
            SetId(); 
        }
    }

    // Métodos para definir idade e nome
    public void SetIdade() {
        String idadeString = InOut.entrada("Digite a idade: ");  
        if(idadeString == null){
            Verify.cancel = true;
        }else{
            if (Verify.isInt(idadeString) == true){
                idade = Integer.parseInt(idadeString);
            }
        }
    }

    public void SetId() {
        id = InOut.entrada("Digite o identificador: ");
        if(id == null){
            Verify.cancel = true;
        }
    }

    public void SetNome() {
        String[] vet;
        boolean repeat = false; 
        do {
            repeat = false; 
            nome = InOut.entrada("Digite o nome: ");
            if(nome != null){
                if(nome.isEmpty()){
                    InOut.print("Digite o nome completo");
                    repeat = true;
                }else{
                    vet = nome.split("\\s+");
                    if (vet.length == 1) {
                        InOut.print("Digite o nome completo");
                        repeat = true;
                    }
                }
            }else{
                Verify.cancel = true;
            }
        } while (repeat == true);

    }

    // Métodos para obter idade e nome
    public int getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String NomeBibliografico() {
        List<String> NomeArray = new ArrayList<>(Arrays.asList(nome.split("\\s+")));

        if (NomeArray.size() > 1) {
            String ultimoNome = NomeArray.remove(NomeArray.size() - 1); 
            NomeArray.add(0, ultimoNome); 
        }

        for (int i = 0; i < NomeArray.size(); i++) {
            String palavra = NomeArray.get(i);
            if (!palavra.isEmpty()) {
                if (i == 0) {

                    NomeArray.set(i, Character.toUpperCase(palavra.charAt(0)) + palavra.substring(1).toLowerCase());
                } else {

                    NomeArray.set(i, Character.toUpperCase(palavra.charAt(0)) + ".");
                }
            }
        }

        return String.join(" ", NomeArray); 
    }
}