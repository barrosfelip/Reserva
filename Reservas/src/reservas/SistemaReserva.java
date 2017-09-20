
package reservas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;


public class SistemaReserva {
    private static final Scanner teclado = new Scanner(System.in);
    
// ===================== Metodos ===========================
    public static void menu(){
            System.out.println(" ____________ MENU _____________");
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Reserva                   |");
            System.out.println("| 2 - Equipamentos              |");
            System.out.println("| 3 - Colaborador               |");
            System.out.println("| 4 - Emprestimo                |");            
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");    
       }
    public static void subMenuEmprestimo(){
            System.out.println(" ____________ MENU _____________");
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Retirar Equipamento       |");
            System.out.println("| 2 - Devolver Equipamento      |");           
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");    
       }
    public static void subMenuReserva(){
            System.out.println(" __________ RESERVA ____________");
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Listar                    |");
            System.out.println("| 2 - Criar                     |");
            System.out.println("| 3 - Editar                    |");
            System.out.println("| 4 - Excluir                   |");
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");
    }
    public static void subMenuEquipamentos(){
            System.out.println(" ________ EQUIPAMENTOS _________");
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Listar                    |");
            System.out.println("| 2 - Cadastrar                 |");
            System.out.println("| 3 - Editar                    |");
            System.out.println("| 4 - Excluir                   |");
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");  
       }
    public static void subMenuColaborador(){
            System.out.println("");
            System.out.println(" _________ COLABORADOR _________"); 
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Listar                    |");
            System.out.println("| 2 - Cadastrar                 |");
            System.out.println("| 3 - Editar                    |");
            System.out.println("| 4 - Excluir                   |");
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");     
    }/*
    public static void cadastrarColaborador(String name , String user , boolean adm,String pass) throws IOException{
        try ( // ================== ESCREVER EM TXT ===========================
            FileWriter arq = new FileWriter("C:\\Users\\Pedro Henrique\\Google Drive\\Java\\POO\\Reserva\\Arquivo\\colaborador.txt",true)) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(name+","+user+","+adm+","+pass+"%n");
            //==============================================================
        }
    }
    public static void cadastrarEquipamento(int patrimonio , String nome) throws IOException{
        try ( // ================== ESCREVER EM TXT ===========================
                FileWriter arq = new FileWriter("C:\\Users\\Pedro Henrique\\Google Drive\\Java\\POO\\Reserva\\Arquivo\\equipamento.txt",true)) {
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(patrimonio+","+nome+"%n");
            //==============================================================
        }
    }  */
// ===================== MAIN ==============================
    
    public static void main(String[] args) throws IOException {
        Date data = new Date();
        Date dataRetirada = new Date(2017,9,20);
        Date dataEntrega = new Date(2017,9,25);
        //System.out.println("Data Agora: "+data);
        //System.out.println(data.getDay());
        //System.out.println(data.getDate());
    
        
                
        
        
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        ArrayList<Equipamento> listaEquipamento = new ArrayList<>();
        ArrayList<Datashow> listaDatashow = new ArrayList<>();
        ArrayList<Notebook> listaNotebook = new ArrayList<>();
        ArrayList<Reserva> listaReserva = new ArrayList<>();
        ArrayList<Emprestimo> listaEmprestimo = new ArrayList<>();
                
        listaPessoa.add(new Pessoa("Pedro Henrique", "Pedroh", true));
        listaPessoa.add(new Pessoa("Thiago Pereira", "Thiagop", true));
        listaPessoa.add(new Pessoa("Arthur Morais", "Arthurm", true));
        
       
        listaDatashow.add( new Datashow(18000, "Epson",false, 3000));
        listaDatashow.add( new Datashow(18001, "Epson",false, 3000));
        listaDatashow.add( new Datashow(18002, "Epson",false, 2400));
        listaDatashow.add( new Datashow(18003, "Epson",false, 2400));
        
        listaNotebook.add( new Notebook(19000, "Elcomma",false, "i3"       , "4Gb", "500GB", "2h"));
        listaNotebook.add( new Notebook(19003, "Elcomma",true, "Dual-Core", "2Gb", "160GB", "30min"));
        listaNotebook.add( new Notebook(19001, "Sony"   ,true , "i5"       , "8Gb", "500GB", "2h"));
        listaNotebook.add( new Notebook(19002, "Sony"   ,false, "Dual-Core", "2Gb", "160GB", "1h"));
                                
        listaReserva.add( new Reserva(listaPessoa.get(0), listaDatashow.get(2), dataRetirada, dataEntrega,"d"));
        listaReserva.add( new Reserva(listaPessoa.get(1),listaNotebook.get(3), listaDatashow.get(3), dataRetirada, dataEntrega,"nd"));
        listaReserva.add( new Reserva(listaPessoa.get(2),listaNotebook.get(1), dataRetirada, dataEntrega,"n"));
        
        
        
        boolean run = true;
        while (run) {
            //MENU PRINCIPAL
            SistemaReserva.menu(); 
            int op = teclado.nextInt();
            switch (op){

                case 0:
                    run = false;
                   
                    break;
                case 1:
                    //SUB MENU RESERVA
                    SistemaReserva.subMenuReserva();
                    int op1 = teclado.nextInt();
                    switch (op1){
                        case 0:
                            break;
                        case 1:
                            // LISTAR RESERVA
                            System.out.println(" _______ LISTA RRESERVAS _______");
                            if (listaReserva.isEmpty()){
                                System.out.println("Nenhuma RESERVA ");

                            }else{  
                                System.out.print("       Nome       ");
                                System.out.print("DataShow  ");
                                System.out.print("Notebook  ");
                                System.out.print("Retirada   ");
                                System.out.println("Entrega");
                                for (int i = 0; i < listaReserva.size(); i++) {
                                    listaReserva.get(i).dadosReserva();
                                    
     
                                }
                            } 
                            
                            //FIM LISTAR RESERVA
                            break;
                        case 2:
                            //CRIAR RESERVA
                            System.out.println(" ________ CRIAR RESERVA ________"); 
                            System.out.println("| 0 - Sair                      |");
                            System.out.println("| 1 - Notebook                  |");
                            System.out.println("| 2 - DataShow                  |");
                            System.out.println("| 3 - Notebook e DataShow       |");
                            System.out.println("|_______________________________|");
                            System.out.print(" Opção: ");
                            int op3 = teclado.nextInt();
                            switch (op3){
                            
                                case 0:
                                    break;
                                case 1:
                                    // CRIAR RESERVA NOTEBOOK
                                    System.out.println(" _____ NOTEBOOK DISPONIVEIS ____"); 
                                    if (listaNotebook.isEmpty()){
                                        System.out.println("Nenhum Notebook Disponivel");
                                                                       
                                    }else{  
                                        System.out.print("Patr.     ");
                                        System.out.print("Nome           ");
                                        System.out.println("Proc.");
                                        
                                        for (int i = 0; i < listaNotebook.size(); i++) {
                                            if (listaNotebook.get(i).getReservaStatus() == false) {                                               
                                                System.out.print(listaNotebook.get(i).getPatrimonio()+"     ");
                                                System.out.print(listaNotebook.get(i).getNome()+"         ");
                                                System.out.println(listaNotebook.get(i).getProcessador()+"");
                                                
                                            }
                                        }
                                    }
                                    // FIM CRIAR RESERVA NOTEBOOK
                                    break;
                                case 2:
                                    // CRIAR RESERVA DATASHOW
                                    System.out.println(" _____ DATASHOW DISPONIVEl _____"); 
                                    
                                    
                                    // FIM CRIAR RESERVA DATASHOW
                                   
                                    break;
                                case 3:
                                    // CRIAR RESERVA NOTEBOOK E DATA SHEW
                                    System.out.println(" ____ NOT / DATA DISPONIVEIS ___"); 
                                    
                                    
                                    // FIM CRIAR RESERVA NOTEBOOK E DATASHOW
                                    break;
                                default:
                                    System.out.println("Opção invalida");
                               
                            }
                            //FIM CRIAR RESERVA
                            break;
                        case 3:
                            //EDITAR RESERVA
                            //FIM EDITAR RESERVA
                            break;
                        default:
                            System.out.println("Opção Invalida");
                    }
                    //FIM SUB MENU RESERVA
                    
                    break;
                            
                case 2:
                    //SUB MENU EQUIPAMENTOS
                    SistemaReserva.subMenuEquipamentos();
                    int op2 = teclado.nextInt();
                    switch (op2){
                        case 0:
                            break;
                        case 1:
                             //SUB MENU LISTAR EQUIPAMENTO
                            System.out.println(" ______ LISTA EQUIPAMENTO ______");
                            System.out.println("|          Nebooks");
                            if (listaNotebook.isEmpty()){
                                System.out.println("Nenhum Equipamento Cadastrado");

                            }else{  
                                for (int i = 0; i < listaNotebook.size(); i++) {
                                    System.out.println("| "+ i + " - " + listaNotebook.get(i).getNome()+" - "+listaNotebook.get(i).getMemoria()+" - "+listaNotebook.get(i).getHd());      
                                }
                            } 
                            
                            System.out.println("|          DataShow");   
                            if (listaNotebook.isEmpty()){
                                System.out.println("Nenhum Equipamento Cadastrado");   
                                
                            }else{          
                                for (int i = 0; i < listaDatashow.size(); i++) {
                                    System.out.println("| "+ i + " - " + listaDatashow.get(i).getNome()+" - "+listaDatashow.get(i).getLumens() + " Lumens");
                                }
                            }

                            System.out.println("|_______________________________");
                            //FIM SUB MENU LISTAR EQUIPAMENTO
                            break;
                            
                            
                        case 2:
                            // CADASTRO EQUIPAMENTO
                                        System.out.println("");
                            System.out.println(" _____ CADASTRO EQUIPAMENTO ____"); 
                            System.out.println("| 0 - Sair                      |");
                            System.out.println("| 1 - Notebook                  |");
                            System.out.println("| 2 - DataShow                  |");
                            System.out.println("|_______________________________|");
                            System.out.print(" Opção: ");
                            int op3 = teclado.nextInt();
                            System.out.println("_______________________________");
                            System.out.print("| N° Patrimonio: ");
                            int patrimonio = teclado.nextInt();
                            System.out.print("| Nome: ");
                            String nome = teclado.next();
                            
                            switch (op3){
                                
                                case 0:
                                    break;
                                case 1:
                                    System.out.print("| Processador: ");
                                    String processador = teclado.next();
                                    System.out.print("| Memoria: ");
                                    String memoria = teclado.next();
                                    System.out.print("| HD: ");
                                    String hd = teclado.next();
                                    System.out.print("| Bateria: ");
                                    String bateria = teclado.next();
                                
                                    listaNotebook.add(new Notebook(patrimonio, nome,false, processador, memoria, hd, bateria));
                                    System.out.println("Equipamento Cadastrado com Sucesso!");
                                    break;
                                case 2:
                                    System.out.print("Lumens: ");
                                    int lumens = teclado.nextInt();
                                    listaDatashow.add(new Datashow(patrimonio, nome,false, lumens));
                                    System.out.println("Equipamento Cadastrado com Sucesso!");
                                    break;
                                default:
                                    System.out.println("Opção invalida !");
                            
                            }
                           
               
                            // FIM CADASTRO EQUIPAMENTO
                            break;
                        case 3:
                            // EDITAR EQUIPAMENTO
                            //FIM EDITAR EQUIPAMENTO
                            break;
                         case 4:
                             //EXCLUIR EQUIPAMENTO
                             //FIM EXCLUIR EQUIPAMENTO
                            break;
                        default:
                            System.out.println("Opção Invalida");
                    }        
                    break;
                case 3:
                    //SUB MENU COLABORADOR

                    //==============================================================
                    
                    SistemaReserva.subMenuColaborador();
                    int id=0;
                    int op3 = teclado.nextInt();
                    switch (op3){
                        case 0:
                            break;
                        case 1:
                            //SUB MENU LISTAR CADASTRO
                            System.out.println(" ______ LISTA COLABORADOR ______"); 

                            if (listaPessoa.isEmpty()){
                                System.out.println("Nenhum Colaborador Cadastrado");

                            }else{    
                                for (int i = 0; i < listaPessoa.size(); i++) {
                                    System.out.println("| "+listaPessoa.get(i).getId()+" - "+listaPessoa.get(i).getNome());      
                                }
                            }
                            System.out.println("|_______________________________");
                            //FIM SUB MENU LISTAR CADASTRO
                            break;
                        case 2:    
                            // SUB MENU CADASTRAR
                            System.out.println(" ______ CCADASTRAR PESSOA ______");                             
                            System.out.print("| NOME: ");
                            String name = teclado.next();
                            System.out.print("| Usuario S/N: ");
                            String selc = teclado.next();
                            if ("s".equals(selc)){
                            
                                boolean adm = true;
                                System.out.print("| Usuario: ");
                                String user = teclado.next();
                                System.out.print("| Senha: ");
                                String pass = teclado.next();
                                System.out.print("| Confirmar senha:");
                                String conpass = teclado.next();
                                System.out.println("|_______________________________|");
                                    if (pass.equals(conpass)){
                                        listaPessoa.add(new Pessoa(name,user,adm));
                                       //
                                      cadastrarColaborador(name,user,adm,pass);
                                            
                                    }else{
                                        System.out.println("Senhas Não correspomdem");
                                    }
                            }else{
                                listaPessoa.add(new Pessoa(name,"",false));
                         
                            }
                            
                            // FIM SUB MENU CADASTRAR                       
                            break;
                        case 3:
                            //SUB MENU EDITAR
                            System.out.println(" ______ EDITAR COLABORADOR ______"); 
                            System.out.println("|  Mat  |          Nome          ");
                            if (listaPessoa.isEmpty()){
                                System.out.println("Nenhum Colaborador Cadastrado");

                            }else{    
                                for (int i = 0; i < listaPessoa.size(); i++) {
                                    System.out.println("|   "+listaPessoa.get(i).getId()+"   | "+listaPessoa.get(i).getNome());      
                                }
                            }
                            System.out.println(" ________________________________");
                            System.out.print("MAT: ");
                            int mat = teclado.nextInt();
                            System.out.println(listaPessoa.get(mat).getNome());
                            System.out.println("Deseja editar ?");
                            System.out.print("S/N: ");
                            String selc2 = teclado.next();
                            if ("s".equals(selc2)){
                                System.out.println("0 - Cancelar");
                                System.out.println("1 - Matricula");
                                System.out.println("2 - Nome");
                                System.out.println("3 - Permissao");
                                System.out.println("4 - Usuario");
                                System.out.println("5 - Senha");
                                
                                
                                int op4 = teclado.nextInt();
                                
                                switch (op4){
                                    case 0:
                                        break;
                                    case 1:
                                        //EDITAR MATRICULA
                                        System.out.println("Matricula Atual: "+listaPessoa.get(mat).getId());
                                        System.out.print("Matricula Nova : ");
                                        int newmat = teclado.nextInt();
                                        listaPessoa.get(mat).setId(newmat);
                                        System.out.println("Matricula Atualizada: "+listaPessoa.get(mat).getId());
                                        
                                        //FIM EDITAR MATRICULA
                                        break;
                                    case 2:   
                                        //EDITAR NOME
                                        System.out.println("Nome Atual: "+listaPessoa.get(mat).getNome());
                                        System.out.print("Nome Novo : ");
                                        String newname = teclado.next();
                                        listaPessoa.get(mat).setNome(newname);
                                        System.out.println("Nome Atualizado: "+listaPessoa.get(mat).getNome());
                                        //FIM EDITAR NOME
                                        break;
                                    case 3:
                                        //EDITAR PERMISSÂO
                                        if (listaPessoa.get(mat).getAdm() == true){
                                            System.out.println("Retirar Permissão S/N: ");
                                            
                                            
                                        }
                                        // FIM EDITAR PERMISSAO
                                        break;
                                    case 4:
                                        //EDITAR USUARIO
                                        
                                        //FIM EDITAR USUARIO
                                    case 5:
                                        //EDITA SENHA
                                        //FIM EDITAR SENHA
                                    default:        
                                
                                }
                                 
                            }
                            
                            //FIM SUB MENU EDITAR
                            break;
                        default:
                            System.out.println("Opção Invalida");
                    }        
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
    }
}
}
