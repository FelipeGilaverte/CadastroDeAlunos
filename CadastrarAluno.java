import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe CadastrarAluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CadastrarAluno
{
    static boolean graf = false;
    static boolean running = true;
    
     public static int findPos(ArrayList<Aluno> alunos,String ra){
         for (int i = 0;i < alunos.size();i++ ){
                        Aluno alunoRemove = alunos.get(i);
                        if (alunos.get(i).getRa().equals(ra)){
                            return i;    
                        }
                    }
        return -1;
    }   
    
    public static void main(String args[]){
        String menu = "Digite uma das opções\n(1)inserir\n(2)remover\n(3)listar\nDigite enter para sair";
        ArrayList<Aluno> alunos = new ArrayList<>();
        if (args.length == 0 || args[0] == "grafico" || args[0] == "Grafico"){
            graf = true;
        }
        do{
            String option = InOut.entrada(menu);
        if(option == null || option.trim().isEmpty()){
            running = false;
        }else if(option.equals("2")){
            if(alunos.size() > 0){
                String ra = InOut.entrada("Digite o ra do aluno");
                int i;
                boolean find = false;
                if(Verify.contemNumero(ra) == true){
                    int pos = findPos(alunos,ra);
                    if(pos != -1){
                        alunos.remove(pos);
                        find = true;
                        InOut.print("Aluno removido");
                    }
                if(find == false){
                    InOut.print("Aluno não encontrado");
                    }
                }else{
                    InOut.print("Digite apenas numeros");
                }
            }else{
                InOut.print("Não há nenhum aluno no sistema");
            }
        }else if(option.equals("1")){
            Aluno newAluno = new Aluno();
            if(Verify.cancel == false){
                String alunoRA = newAluno.getRa();
                String alunoId = newAluno.getId();
                boolean canInsert = true;
                for (int i = 0;i < alunos.size();i++ ){
                    
                    if(alunos.get(i).getRa().equals(alunoRA)){
                        canInsert = false;
                        InOut.print("RA ja cadastrado no sistema");
                        break;
                    }
                    if(alunos.get(i).getId().equals(alunoId)){
                        canInsert = false;
                        InOut.print("ID ja cadastrado no sistema");
                        break;
                    }
                }
                if(canInsert == true){
                  alunos.add(newAluno);          
                  newAluno.printAll(0);  
                }
            }
        }else if(option.equals("3")){
            if (alunos.size() > 0){
               for (int i = 0; i < alunos.size();i++ ){
                alunos.get(i).printAll(i+1);
                } 
            }else{
                InOut.print("Não há nenhum aluno no sistema");
            }
            
        }
        Verify.cancel = false;
        }while(running == true);
    }   
}
