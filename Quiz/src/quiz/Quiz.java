/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author 082170031
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        List<Questao> questoes = geraPerguntas();
        
        System.out.println("Bem vindo ao super quiz.");
        
        exibePerguntas(questoes);
        
        System.out.println();
        
    }
    
    public static List<Questao> geraPerguntas(){
         Questao questao1 = new Questao("Qual o nome do composto H2SO4 ?","Ácido sulfúrico","Ácido hiposulfuroso",
                "Ácido sulfuroso","Cloreto de Sódio","A", "Ciências");
        
        Questao questao2 = new Questao("Em Jogos Vorazes qual o pássaro é o símbolo do filme?", "Águia","Tordo",
        "Pombo", "Canário","B", "Filmes");
        
        Questao questao3 = new Questao("Ana tem 12 anos e flavia tem o dobro da idade da ana, e jorge tem o dobro da idade de flavia. Qual a idade de jorge??",
        "48", "12", "24", "6", "A","Matemática");
        
        List<Questao> questoes = new ArrayList<Questao>();
        questoes.add(questao1);
        questoes.add(questao2);
        questoes.add(questao3);
        
        return questoes;
    }
    
    public static void exibePerguntas(List<Questao> questoes){
        
        
       for(Questao questao : questoes){
            System.out.println("Pergunta:");
            System.out.println(questao.getPergunta());
            System.out.println("A)" + questao.getAlternativa1());
            System.out.println("B)" + questao.getAlternativa2());
            System.out.println("C)" + questao.getAlternativa3());
            System.out.println("D)" + questao.getAlternativa4());
            
            analisaResposta(questao);
            
        }
    }
    
    public static void analisaResposta(Questao questao)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a alternativa que você considerar correta: ");
            
            String alternativaEscolhida = scan.nextLine();
            
            if(questao.getAlternativaCerta().equalsIgnoreCase(alternativaEscolhida)){
                System.out.println("Correto.");
            }
            else
                System.out.println("Errado");
    }
    
}
