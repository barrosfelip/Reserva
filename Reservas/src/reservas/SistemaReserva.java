
package reservas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

public class SistemaReserva {
    private static final Scanner teclado = new Scanner(System.in);
    
// ===================== Metodos ===========================
    public static void limpaTela(){
        for (int i=0;i<10;i++){
        System.out.print("\r\n");
        }}
    
    public static void login(){
            System.out.println(" _____ SISTEMA DE RESERVAS _____");
            System.out.println("|                               |");
            System.out.println("|------- TELA DE LOGIN ---------|");
            System.out.println("|                               |");
            System.out.println("|       DIGITE SUA SENHA        |");
            System.out.println("|                               |");
            System.out.println("|                               |");
            System.out.println("| 0 - SAIR                      |");            
            System.out.println("|_______________________________|");
    }
    
    public static void menu(int permis){
                
        if (permis == 0 || permis == 1 || permis == 2){
        System.out.println(" ____________ MENU _____________");
        System.out.println("| 0 - Sair                      |");
        System.out.println("| 1 - Reserva                   |");
            if (permis == 1 || permis == 2){
            System.out.println("| 2 - Equipamentos              |");
            System.out.println("| 3 - Colaborador               |");
            System.out.println("| 4 - Emprestimo                |");
            }else if (permis == 2 ) {
            System.out.println("| 5 - Relatorio                 |"); 
            }
         System.out.println("|_______________________________|");
         System.out.print(" Opção: ");    
       }
    }
    
    public static void subMenuEmprestimo(int permis){
        if (permis == 1 || permis == 2){
            System.out.println(" ____________ MENU _____________");
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Retirar Equipamento       |");
            System.out.println("| 2 - Devolver Equipamento      |");
        }else if (permis == 0){
            System.out.println("Opão invalida Acesso Negado !");
        }     
        System.out.println("|_______________________________|");
        System.out.print(" Opção: ");    
        }
        
    public static void subMenuReserva(int permis){
        if (permis == 0 || permis == 1 || permis == 2){
            System.out.println(" __________ RESERVA ____________");
            System.out.println("| 0 - Sair                      |");
            System.out.println("| 1 - Listar                    |");
            if (permis == 1 || permis == 2){
            System.out.println("| 2 - Criar                     |");
                if (permis == 2 ){
            System.out.println("| 3 - Editar                    |");
            System.out.println("| 4 - Excluir                   |");
                }
        System.out.println("|_______________________________|");
        System.out.print(" Opção: ");
            }
        }
    }
    public static void subMenuEquipamentos(int permis){
        System.out.println(" ________ EQUIPAMENTOS _________");
        System.out.println("| 0 - Sair                      |");
        if (permis == 1 || permis == 2){
            System.out.println("| 1 - Listar                    |");
            System.out.println("| 2 - Cadastrar                 |");
            if (permis == 2 ){
            System.out.println("| 3 - Editar                    |");
            System.out.println("| 4 - Excluir                   |");
        }else if (permis == 0 ){
            System.out.println("| Opão invalida Acesso Negado ! |");
            }
                
        System.out.println("|_______________________________|");
        System.out.print(" Opção: ");  
       }
    } 
    public static void subMenuColaborador(int permis){
            System.out.println(" _________ COLABORADOR _________"); 
            System.out.println("| 0 - Sair                      |");
            if (permis == 1 || permis == 2){
            System.out.println("| 1 - Listar                    |");
            System.out.println("| 2 - Cadastrar                 |");
                if (permis == 2 ){
            System.out.println("| 3 - Editar                    |");
            System.out.println("| 4 - Excluir                   |");
            }else if (permis == 0 ){
                 System.out.println("| Opão invalida Acesso Negado ! |");
            }
            }
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");     
    }
    public static void subMenuTipoColaborador(int permis){
            System.out.println(" _________ COLABORADOR _________"); 
            System.out.println("| 0 - Sair                      |");
            if (permis == 1 || permis == 2){
            System.out.println("| 1 - Comun                     |");
            System.out.println("| 2 - Diretor                   |");
            System.out.println("| 3 - Administrador             |");
            }else if (permis == 0 ){
                 System.out.println("| Opão invalida Acesso Negado ! |");
            }
            
            System.out.println("|_______________________________|");
            System.out.print(" Opção: ");     
    }
    
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
                
        listaPessoa.add(new Pessoa("Pedro", "pedroh", 0));
        listaPessoa.add(new Pessoa("Thiago", "thiagop", 1));
        listaPessoa.add(new Pessoa("Felipe", "felipel", 2));
        listaPessoa.add(new Pessoa("Juan", "1", 2));
        
        
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
        
        boolean login = true, run = false;
        int permis =0;
        int matri=0;
        SistemaReserva.limpaTela();
        while(login){ 
        SistemaReserva.login();
        String key = teclado.next();
        for (int i = 0; i < listaPessoa.size(); i++) {
            if (key.equals(listaPessoa.get(i).getRedeUser())) {
               permis = (listaPessoa.get(i).getPermis());
               matri=i;
               login = false;
               run = true;
            }
            if (key.equals("0")){
                login= false;
                run=false;  
            }  }
        
        if(login==true){
            System.out.println("|        SENHA INCORRETA        |");
        }        }
         
        while (run) {
            SistemaReserva.menu(permis);
            //MENU PRINCIPAL
            
            int op = teclado.nextInt();
            switch (op){

                case 0:
                    run = false;
                   
                    break;
                
                case 1:
                    //SUB MENU RESERVA
                    SistemaReserva.subMenuReserva(permis);
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
                                System.out.print("    Nome    ");
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
                                        System.out.print("Num. ");
                                        System.out.print("  Patr.   ");
                                        System.out.print("Nome           ");
                                        System.out.println("Proc.");
                                        
                                        for (int i = 0; i < listaNotebook.size(); i++) {
                                            if (listaNotebook.get(i).getReservaStatus() == false) {                                               
                                                System.out.print(" " + i + " \t");
                                                System.out.print(listaNotebook.get(i).getPatrimonio()+"     ");
                                                System.out.print(listaNotebook.get(i).getNome()+"         ");
                                                System.out.println(listaNotebook.get(i).getProcessador()+"");
                                                                 }
                                        }
                                        
                                        System.out.println("Digite o numero do equipamento.");
                                        int eq = teclado.nextInt();
                                        listaReserva.add( new Reserva(listaPessoa.get(matri), listaNotebook.get(eq), dataRetirada, dataEntrega,"n"));                           
                                        System.out.println("Reserva ok!");
                                        
                                        
                                        
                                    }
                                                                     
                                    
                                    // FIM CRIAR RESERVA NOTEBOOK
                                    break;
                                case 2:
                                    // CRIAR RESERVA DATASHOW
                                    System.out.println(" _____ DATASHOW DISPONIVEl _____"); 
                                    if (listaDatashow.isEmpty()){
                                        System.out.println("Nenhum Datashow Disponivel");
                                                                       
                                    }else{  
                                        System.out.print("Num. ");
                                        System.out.print("  Patr.   ");
                                        System.out.print("Nome           ");
                                        System.out.println("Proc.");
                                        
                                        for (int i = 0; i < listaDatashow.size(); i++) {
                                            if (listaDatashow.get(i).getReservaStatus() == false) {                                               
                                                System.out.print(" " + i + " \t");
                                                System.out.print(listaDatashow.get(i).getPatrimonio()+"     ");
                                                System.out.print(listaDatashow.get(i).getNome()+"         ");
                                                System.out.println(listaDatashow.get(i).getLumens());
                                                                 }
                                        }
                                        
                                        System.out.println("Digite o numero do equipamento.");
                                        int eq = teclado.nextInt();
                                        listaReserva.add( new Reserva(listaPessoa.get(matri), listaDatashow.get(eq), dataRetirada, dataEntrega,"d"));                           
                                        System.out.println("Reserva ok!");
                                    }
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
                    SistemaReserva.subMenuEquipamentos(permis);
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
                    
                    SistemaReserva.subMenuColaborador(permis);
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
                            int op5=0;
                            String name = null, pass=null;
                            while(op5<1||op5>=3){
                                SistemaReserva.subMenuTipoColaborador(permis);
                            op5 = teclado.nextInt();
                            if (op5==0){
                                break;
                                }
                            if (op5==0){
                                break;}
                            boolean cadastro=true;
                            while(cadastro){
                            System.out.println(" ______ CADASTRAR PESSOA ______");                             
                            System.out.print("| Nome: ");
                            name = teclado.next();
                            int cont= 0;
                            for (int i = 0; i < listaPessoa.size(); i++){
                                if(name.equals(listaPessoa.get(i).getNome())){
                                     cont++;
                                        }}
                                if (cont ==0){
                                    cadastro=false;}
                                else
                                    {System.out.println("|       NOME JA CADASTRADO       |"); }
                            }
                            cadastro=true;
                            
                            while(cadastro){
                            System.out.print("| Senha: ");
                            pass = teclado.next();
                            System.out.print("| Confirmar senha:");
                            String conpass = teclado.next();
                            if (pass.equals(conpass)){
                                int cont= 0;
                                for (int i = 0; i < listaPessoa.size(); i++) {
                                    if (pass.equals(listaPessoa.get(i).getRedeUser())) {
                                        cont++;
                                        }}
                                if (cont ==0){
                                    cadastro=false;                                      
                                    listaPessoa.add(new Pessoa(name,pass,op3));
                                    break;
                                
                                }
                                else {System.out.println("|      ESCOLHA OUTRA SENHA      |");}}
                            else
                                {System.out.println("|        SENHA INCORRETA         |");}}
                            
                            }
                         
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
                            
                                System.out.println("0 - Cancelar");
                                System.out.println("1 - Nome");
                                System.out.println("2 - Permissao");
                                System.out.println("3 - Senha");
                                
                                
                                int op4 = teclado.nextInt();
                                
                                switch (op4){
                                    case 0:
                                        break;
                                    case 1:   
                                        //EDITAR NOME
                                        System.out.println("Nome Atual: "+listaPessoa.get(mat).getNome());
                                        System.out.print("Nome Novo : ");
                                        String newname = teclado.next();
                                        listaPessoa.get(mat).setNome(newname);
                                        System.out.println("Nome Atualizado: "+listaPessoa.get(mat).getNome());
                                        //FIM EDITAR NOME
                                        break;
                                    case 2:
                                        //EDITAR PERMISSÂO
                                       System.out.println("Permissão Atual: "+listaPessoa.get(mat).getPermis());
                                       System.out.print("Permissão Nova : ");
                                       int newperm = teclado.nextInt();
                                       listaPessoa.get(mat).setPermis(newperm);
                                       System.out.println("Permissão Atualizada: "+listaPessoa.get(mat).getPermis());
                                            
                                            
                                        
                                        // FIM EDITAR PERMISSAO
                                        break;
                                
                                    case 3:
                                        //EDITA SENHA
                                       System.out.println("Senha Atual: "+listaPessoa.get(mat).getRedeUser());
                                       boolean senha = true;
                                       while(senha){
                                       System.out.print("Senha Nova : ");
                                        pass = teclado.next();
                                        System.out.print("| Confirmar senha:");
                                        String conpass = teclado.next();
                                        if (pass.equals(conpass)){
                                            int cont= 0;
                                        for (int i = 0; i < listaPessoa.size(); i++) {
                                        if (pass.equals(listaPessoa.get(i).getRedeUser())) {
                                            cont++;
                                            }}
                                         if (cont ==0){
                                            senha=false;   
                                            listaPessoa.get(mat).setRedeUser(pass);

                                }
                                else {System.out.println("|      ESCOLHA OUTRA SENHA      |");}}
                            else
                                {System.out.println("|        SENHA INCORRETA         |");}
                            
                            System.out.println("Senha Atualizada: "+listaPessoa.get(mat).getRedeUser());
                                       }
                            
                                       break;
//FIM EDITAR SENHA
                                    case 4 :
                                       
                                    default:        
                                
                                
                                 
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

