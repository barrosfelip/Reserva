
package reservas;

public class Equipamento {
    private static int sequence = 0;
    private int patrimonio;
    private String nome;
    private boolean reservaStatus;
    private String descricao; // alguma consideração a fazer sobre o aparelho 
    
    
    public Equipamento() {
        
    }

    public Equipamento(int patrimonio, String nome, boolean reservaStatus) {
        this.patrimonio = patrimonio;
        this.nome = nome;
        this.reservaStatus = reservaStatus;
    }
    
    
    
    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        Equipamento.sequence = sequence;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getReservaStatus() {
        return reservaStatus;
    }

    public void setReservaStatus(boolean reservaStatus) {
        this.reservaStatus = reservaStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
          
}