
/**
 * Escreva uma descrição da classe Bibliografia aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.*;

public class NomePessoa
{
    
    Texto nome;
    String CompNome;
    public NomePessoa(String nome){
        this.nome = new Texto(nome);
        CompNome = nome;
    }
    public String InverterNome(){
        return this.nome.inverterTexto();
    }
    
    public String MostrarNome(){
    return CompNome;   
    }
    public String NomeBibliografico() {
        List<String> NomeArray = new ArrayList<>(Arrays.asList(CompNome.split("\\s+")));

        // Verifica se há pelo menos 2 nomes para trocar
        if (NomeArray.size() > 1) {
            String ultimoNome = NomeArray.remove(NomeArray.size() - 1); // Remove o último nome
            NomeArray.add(0, ultimoNome); // Adiciona o último nome na primeira posição
        }
    
        // Ajusta os nomes para abreviar, mantendo a primeira letra maiúscula
        for (int i = 0; i < NomeArray.size(); i++) {
            String palavra = NomeArray.get(i);
            if (!palavra.isEmpty()) {
                if (i == 0) {
                    // Mantém o nome completo (primeira palavra)
                    NomeArray.set(i, Character.toUpperCase(palavra.charAt(0)) + palavra.substring(1).toLowerCase());
                } else {
                    // Abrevia os outros nomes (apenas a primeira letra em maiúscula)
                    NomeArray.set(i, Character.toUpperCase(palavra.charAt(0)) + ".");
                }
            }
        }
    
        return String.join(" ", NomeArray); // Junta os nomes novamente com um espaço
}

    
    
}
