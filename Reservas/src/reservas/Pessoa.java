
package reservas;

import java.util.ArrayList;


public class Pessoa {

    static Pessoa get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    private static int sequence = 0;
    private int id;
    private String nome;
    private String redeUser;
    private int permis;

    public Pessoa(String nome, String redeUser, int permis) {
        this.id = Pessoa.sequence++; 
        this.nome = nome;
        this.redeUser = redeUser;
        this.permis = permis;
        
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

    public int getPermis() {
        return permis;
    }

    public void setPermis(int permis) {
        this.permis = permis;
    }
}
