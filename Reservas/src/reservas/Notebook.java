
package reservas;

public class Notebook extends Equipamento{
    private String processador;  // nome do processador
    private String memoria; // Quantos gigas tem a memoria 
    private String hd;     // Quantos gigas tem o hd 
    private String bateria; // duração da bateria 
    public Notebook(){
    
    
    }
   
    
    public Notebook(int patrimonio, String nome,boolean reservaStatus ,String processador,String memoria, String hd, String bateria) {
        super(patrimonio, nome ,reservaStatus);
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.bateria = bateria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }


}