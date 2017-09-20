
package reservas;

 public class Datashow extends Equipamento {
    private int tamanho; // tamanho da tela 
    private int lampada; // vida util da lampada
    private int lumens;  // capacidade de iluminação do equipamento 
    
    public Datashow(){
    }

    public Datashow(int patrimonio, String nome,boolean reservaStatus, int lumens) {
        super(patrimonio, nome, reservaStatus);
        this.lumens = lumens;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setMarca(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getLampada() {
        return lampada;
    }

    public void setLampada(int lampada) {
        this.lampada = lampada;
    }


    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }
        
}
