
package reservas;

import java.util.ArrayList;



public class Pessoa {
        
    public ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    private static int sequence = 0;
    private int id;
    private String nome;
    private String redeUser;
    private boolean adm;

    public Pessoa(String nome, String redeUser, boolean adm) {
        this.id = Pessoa.sequence++; 
        this.nome = nome;
        this.redeUser = redeUser;
        this.adm = adm;
        
    }
    
    //==============METODOS==========================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRedeUser() {
        return redeUser;
    }

    public void setRedeUser(String redeUser) {
        this.redeUser = redeUser;
    }

    public boolean getAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
}
