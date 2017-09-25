
package reservas;

import java.util.Date;


public class Reserva {
    private Pessoa colaborador;
    private Notebook notebook;
    private Datashow datashow;
    private Date dataRetirada;
    private Date dataEntrega;
    private String tipo;
    

    public void criarReservaDatashow(Reserva reserva){
        reserva.getDatashow().setReservaStatus(true);   
    }
    
     public void criarReservaNotebook(Reserva reserva){
        reserva.getNotebook().setReservaStatus(true);   
    }
     
    public void dadosReserva(){
        
        
        System.out.print(getColaborador().getNome()+"\t");
      
        if (getTipo() == "d"){
            System.out.print("     "+getDatashow().getPatrimonio()+"              ");
        
        }
        if (getTipo() == "n"){
            System.out.print("                "+getNotebook().getPatrimonio()+"    ");
        
        }
        if (getTipo() == "nd"){
            System.out.print("     "+getDatashow().getPatrimonio()+"     ");
            System.out.print(getNotebook().getPatrimonio()+"    ");
        
        }
        dataRetirada();
        System.out.print(" ");
        dataEntrega();
    }
    
    public void dataRetirada(){
        
        System.out.print(dataEntrega.getDate()+"/"+dataEntrega.getDay()+"/"+dataEntrega.getYear()+" ");
       
        
    } 
    public void dataEntrega(){
        System.out.print(dataEntrega.getDate()+"/"+dataEntrega.getDay()+"/"+dataEntrega.getYear()+"\n");
        
    }

    public Reserva(Pessoa colaborador, Notebook notebook, Datashow datashow, Date dataRetirada, Date dataEntrega, String tipo) {
        this.colaborador = colaborador;
        this.notebook = notebook;
        this.datashow = datashow;
        this.dataRetirada = dataRetirada;
        this.dataEntrega = dataEntrega;
        this.tipo = tipo;
    }

    public Reserva(Pessoa colaborador, Datashow datashow, Date dataRetirada, Date dataEntrega, String tipo) {
        this.colaborador = colaborador;
        this.datashow = datashow;
        this.dataRetirada = dataRetirada;
        this.dataEntrega = dataEntrega;
        this.tipo = tipo;
    }

    public Reserva(Pessoa colaborador, Notebook notebook, Date dataRetirada, Date dataEntrega, String tipo) {
        this.colaborador = colaborador;
        this.notebook = notebook;
        this.dataRetirada = dataRetirada;
        this.dataEntrega = dataEntrega;
        this.tipo = tipo;
    }
    


    public Pessoa getColaborador() {
        return colaborador;
    }

    public void setColaborador(Pessoa colaborador) {
        this.colaborador = colaborador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public Datashow getDatashow() {
        return datashow;
    }

    public void setDatashow(Datashow datashow) {
        this.datashow = datashow;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
  

}
