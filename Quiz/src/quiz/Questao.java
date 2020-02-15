/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author 082170031
 */
public class Questao {
    private String pergunta;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String alternativaCerta;
    private String tema;

    /**
     * @return the pergunta
     */
    public Questao(String pergunta, String alternativa1, String alternativa2, String alternativa3,
            String alternativa4, String alternativaCerta, String tema){
        this.setPergunta(pergunta);
        this.setAlternativa1(alternativa1);
        this.setAlternativa2(alternativa2);
        this.setAlternativa3(alternativa3);
        this.setAlternativa4(alternativa4);
        this.setAlternativaCerta(alternativaCerta);
        this.setTema(tema);
    }
        
    public String getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * @return the alternativa1
     */
    public String getAlternativa1() {
        return alternativa1;
    }

    /**
     * @param alternativa1 the alternativa1 to set
     */
    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    /**
     * @return the alternativa2
     */
    public String getAlternativa2() {
        return alternativa2;
    }

    /**
     * @param alternativa2 the alternativa2 to set
     */
    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    /**
     * @return the alternativa3
     */
    public String getAlternativa3() {
        return alternativa3;
    }

    /**
     * @param alternativa3 the alternativa3 to set
     */
    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    /**
     * @return the alternativa4
     */
    public String getAlternativa4() {
        return alternativa4;
    }

    /**
     * @param alternativa4 the alternativa4 to set
     */
    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    /**
     * @return the alternativaCerta
     */
    public String getAlternativaCerta() {
        return alternativaCerta;
    }

    /**
     * @param alternativaCerta the alternativaCerta to set
     */
    public void setAlternativaCerta(String alternativaCerta) {
        this.alternativaCerta = alternativaCerta;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
}
