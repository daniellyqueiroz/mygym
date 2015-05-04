package br.ufrpe.sistema_MyGym;

import java.util.Scanner;

import classesBasicas.Avaliacao;
import classesBasicas.Cliente;
import dados.RepositorioClientes;
import dados.RepositorioTreinador;

public class Principal {

	private static Scanner ler;

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
        RepositorioClientes repositorioCliente = new RepositorioClientes(100);
        RepositorioTreinador repositorioTreinador = new RepositorioTreinador(100);

        ler = new Scanner(System.in);
        int opcao;
   
		do{
            System.out.println("0- Sair \n1- Administrador \n2- Cliente ");
            opcao = ler.nextInt();
            switch (opcao) {
            
            case 0: // Menu Cliente
               	 
            	opcao = 0;

                break;

            case 1: // Menu Administrar
            	 	int opcao1;
                    do{
                        System.out.println("0-Voltar \n1-Administrar Cliente \n2-Administrar Treinador \n3-Administrar Aulas \n4-Administrar Mensalidades ");
                        opcao1 = ler.nextInt();
                        switch (opcao1) {
                        
                        case 0:
                        	opcao1 = 0;
                        	break;
 
                        case 1: // Administrar Cliente
                        		int opcao2; 
                                do{
	                                System.out.println("0- Voltar \n1-Cadastrar Cliente \n2-Remover Cliente \n3-Exibir Cliente ");
	                                opcao2 = ler.nextInt();
	                                switch (opcao2) {// Menu Administrar Cliente - 2
	                                case 0:
	                                	opcao2 = 0;
	                                	break;
	                                	
	                                case 1:// Cadastrar Cliente
	                                        ler.nextLine();
	                                        System.out.println("-- CADASTRO CLIENTE -- \n\nNome: ");
	 
	                                        String nome = ler.nextLine();
	 
	                                        System.out.println("\nIdade: ");
	 
	                                        int idade = ler.nextInt();
	 
	                                        ler.nextLine();
	 
	                                        System.out.println("\nEndere�o: ");
	                                        String endereco;
	                                        endereco = ler.nextLine();
	 
	                                        System.out.println("\nCPF: ");
	                                        long cpf;
	                                        cpf = ler.nextLong();
	 
	                                        System.out.println("\nTelefone: ");
	                                        long telefone;
	                                        telefone = ler.nextLong();
	 
	                                        ler.nextLine();
	 
	                                        System.out.println("\nEmail: ");
	                                        String email;
	                                        email = ler.nextLine();
	 
	                                        System.out
	                                                        .println("\n\n--CADASTRO CLIENTE (Avalia��o F�sica)-- \nANAMNESE\n\nObjetivos rela��o � atividade f�sica?\n");
	                                        String objetivo;
	                                        objetivo = ler.nextLine();
	 
	                                        System.out.println("Pratica Atividade f�sica atualmente?");
	                                        String atividadef;
	                                        atividadef = ler.nextLine();
	 
	                                        System.out.println("Utiliza algum tipo de medicamento?");
	                                        String medicamento;
	                                        medicamento = ler.nextLine();
	 
	                                        System.out.println("J� passou por alguma cirurgia?");
	                                        String cirurgia;
	                                        cirurgia = ler.nextLine();
	 
	                                        System.out.println("Doen�a na f�milia?");
	                                        String doen�a;
	                                        doen�a = ler.nextLine();
	 
	                                        System.out.println("Observa��es:");
	                                        String obs;
	                                        obs = ler.nextLine();
	 
	                                        System.out
	                                                        .println("\n\n--CADASTRO CLIENTE (Avalia��o F�sica)-- \nRISCOS CORONARIANO\n\nIdade:");
	                                        int idade1;
	                                        idade1 = ler.nextInt();
	 
	                                        ler.nextLine();
	                                        System.out.println("Sexo:");
	                                        String sexo;
	                                        sexo = ler.nextLine();
	 
	                                        System.out.println("Peso:");
	                                        float peso;
	                                        peso = ler.nextFloat();
	 
	                                        ler.nextLine();
	                                        System.out.println("Exerc�cio F�sico:");
	                                        String exercicioF;
	                                        exercicioF = ler.nextLine();
	 
	                                        System.out.println("Hist�rico Fam�liar:");
	                                        String historicoF;
	                                        historicoF = ler.nextLine();
	 
	                                        System.out.println("Tabagismo");
	                                        String tabagismo;
	                                        tabagismo = ler.nextLine();
	 
	                                        System.out.println("Observa��es:");
	                                        String obs2;
	                                        obs2 = ler.nextLine();
	 
	                                        Avaliacao avaliacao = new Avaliacao(objetivo, atividadef,
	                                                        medicamento, cirurgia, doen�a, obs, idade1, sexo,
	                                                        peso, exercicioF, historicoF, tabagismo, obs2);
	 
	                                        Cliente cliente = new Cliente(nome, endereco, idade, cpf,
	                                                        telefone, email, avaliacao);
	 
	                                        repositorioCliente.cadastrar(cliente);
	                                        System.out.println(repositorioCliente.procurar(cpf));
	                                       
	 
	                                        break;
	                                case 2:// Remover Cliente
	                                        System.out
	                                                        .println("Digite CPF do cliente que voc� deseja remover");
	                                        long cpf1;
	                                        cpf1 = ler.nextLong();
	 
	                                        repositorioCliente.remover(cpf1);
	 
	                                        break;
	 
	                                case 3:// Exibir Cliente
	                                        System.out.println("Digite CPF do cliente que voc� deixar exibir os dados");
	                                        long cpf2;
	                                        cpf2 = ler.nextLong();
	 
	                                        System.out.println(repositorioCliente.procurar(cpf2));
	 
	                                        break;
	 
	                                default:
	                                        System.out.println("Op��o inv�lda");
	                                        break;
	 
	                                }
                                }while(opcao2 != 0);
 
                                break;
                        case 2:// Administrar Treinador
                        		int opcao3;
                                
                                do{
	                                	System.out.println("0- Voltar \n1-Cadastrar Treinador \n2-Remover Treinador \n3-Exibir Treinador");
		                                opcao3 = ler.nextInt();
		                                switch (opcao3) {
		                                case 0:
		                                	opcao3 = 0;
	                                        break;
	                                        
		                                case 1: String nome;
		                                System.out.println("Nome: ");
		                                
		                                	
		                                        break;
		                                case 2:
		                                        System.out.println("Digite o nome do Treinador que voc� deseja remover");
		                                        String nomeT;
		                                        nomeT = ler.nextLine();
		                                        System.out.println(repositorioTreinador.procurar(nomeT));
		                                        repositorioTreinador.remover(nomeT);
		                                        System.out.println(repositorioTreinador.procurar(nomeT));
		                                       
		                                        break;
		                                case 3:
		                                       
		                                        System.out.println("Digite o nome do Treinador que voc� deseja exibir");
		                                        String nomeT2;
		                                        nomeT2 = ler.nextLine();
		                                        System.out.println(repositorioTreinador.procurar(nomeT2));
		                                       
		                                       
		                                        break;
		                                       
		                                default:
		                                        System.out.println("opcao invalida");
		                                       
		                                        break;
		                                }
                                }while(opcao3 != 0);
                                break;
 
                        case 3: // Administrar Aulas
                        		int opcao4;

                                do{
	                                System.out.println("0- Voltar \n1-Cadastrar Aulas \n2-Remover Aulas \n3-Exibir Aulas");
	                                opcao4 = ler.nextInt();
	                                switch (opcao4) {
	                                
	                                case 0: 
	                                	opcao4 = 0;
                                        break;
	 
	                                case 1: // Cadastrar Aulas
	 
	                                        break;
	                                case 2: // Remover Aulas
	                                        break;
	                                case 3: // Exibir Aulas
	                                        break;
	                                default:
	                                        break;
	                                }
				} while (opcao4 != 0);
                                break;
                        case 4: // Administrar Mensalidades
                               
 
                                break;
 
                        default:
 
                                System.out.println("Op��o � invalida");
                                break;
                        }
                        
                    }while(opcao1 != 0);

                    break;

            case 2: // Menu Cliente

                    System.out.println("2- Cliente ");

                    break;

            default:

                    System.out.println("Op��o � inv�lida");

            }
        
   }while(opcao != 0);

}
}