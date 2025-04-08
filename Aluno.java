import javax.swing.JOptionPane;
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends Pessoa 
{
    String ra;
    int periodo;
    String curso;
    public Aluno(){
        super();
        if(Verify.cancel == false){
            SetRa();
        }
        if(Verify.cancel == false){
            SetCurso();
        }   
        if(Verify.cancel == false){
            SetPeriodo();
        }     
    }
    
    void SetRa(){
        ra = InOut.entrada("Digite o Ra: ");  
        if(ra == null){
            Verify.cancel = true;
        }
    }
    void SetPeriodo(){
        String Stringperiodo = InOut.entrada("Digite o periodo");
        if(Stringperiodo == null){
            Verify.cancel = true;
        }else{
            if (Verify.isInt(Stringperiodo) == true){
                periodo = Integer.parseInt(Stringperiodo);
            }
        }
    }
    void SetCurso(){
        curso = InOut.entrada("Digite o curso");
        if(curso == null){
            Verify.cancel = true;
        }
    }
    
    public String getCurso(){
        return curso;
    }
    public int getPeriodo(){
        return periodo;
    }
    public String getRa(){
        return ra;
    }
    public void printAll(int pos){
        if(pos > 0){
            InOut.print( 
        pos+"\n"+    
        "Nome: " + getNome() + "\n" +
        "Idade: " + getIdade() + "\n" +
        "Identificação: " + getId() + "\n" +
        "RA: " + getRa() + "\n" +
        "Curso: " + getCurso() + "\n" +
        "Período: " + getPeriodo() + "\n" +
        "Nome bibliografico: " + NomeBibliografico());
        }else{
            InOut.print( 
        "Nome: " + getNome() + "\n" +
        "Idade: " + getIdade() + "\n" +
        "Identificação: " + getId() + "\n" +
        "RA: " + getRa() + "\n" +
        "Curso: " + getCurso() + "\n" +
        "Período: " + getPeriodo() + "\n" +
        "Nome bibliografico: " + NomeBibliografico());
        }
        
    }
    
}
    