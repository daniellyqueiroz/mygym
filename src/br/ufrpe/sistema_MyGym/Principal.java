package br.ufrpe.sistema_MyGym;

import java.util.Scanner;

import negocios.CadastroAula;
import negocios.CadastroCliente;
import negocios.CadastroTreinador;
import classesBasicas.Aulas;
import classesBasicas.Avaliacao;
import classesBasicas.Cliente;
import classesBasicas.Treinador;


public class Principal {

	private static Scanner ler;

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
       
       
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
                        System.out.println("0-Voltar \n1-Administrar Cliente \n2-Administrar Treinador \n3-Administrar Aulas \n4-Administrar treino \n5-Administrar Mensalidades ");
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
	 
	                                        System.out.println("\nEndereço: ");
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
	                                        
	                                        System.out.println("\nTreinador CPF: ");
	                                        long cpfTreinador;
	                                        cpfTreinador = ler.nextLong();
	                                       
	                                        System.out.println("\n\n--CADASTRO CLIENTE (Avaliação Física)-- \nANAMNESE\n\nObjetivos relação à atividade física?\n");
	                                        String objetivo;
	                                        objetivo = ler.nextLine();
	 
	                                        System.out.println("Pratica Atividade física atualmente?");
	                                        String atividadef;
	                                        atividadef = ler.nextLine();
	 
	                                        System.out.println("Utiliza algum tipo de medicamento?");
	                                        String medicamento;
	                                        medicamento = ler.nextLine();
	 
	                                        System.out.println("Já passou por alguma cirurgia?");
	                                        String cirurgia;
	                                        cirurgia = ler.nextLine();
	 
	                                        System.out.println("Doença na fámilia?");
	                                        String doença;
	                                        doença = ler.nextLine();
	 
	                                        System.out.println("Observações:");
	                                        String obs;
	                                        obs = ler.nextLine();
	 
	                                        System.out
	                                                        .println("\n\n--CADASTRO CLIENTE (Avaliação Física)-- \nRISCOS CORONARIANO\n\nIdade:");
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
	                                        System.out.println("Exercício Físico:");
	                                        String exercicioF;
	                                        exercicioF = ler.nextLine();
	 
	                                        System.out.println("Histórico Famíliar:");
	                                        String historicoF;
	                                        historicoF = ler.nextLine();
	 
	                                        System.out.println("Tabagismo");
	                                        String tabagismo;
	                                        tabagismo = ler.nextLine();
	 
	                                        System.out.println("Observações:");
	                                        String obs2;
	                                        obs2 = ler.nextLine();
	                                        
	                                        
	 
	                                        Avaliacao avaliacao = new Avaliacao(objetivo, atividadef,
	                                                        medicamento, cirurgia, doença, obs, idade1, sexo,
	                                                        peso, exercicioF, historicoF, tabagismo, obs2);
	 
	                                        Cliente cliente = new Cliente(nome, endereco, idade, cpf,
	                                                        telefone, email, avaliacao);
	 
	                                         CadastroCliente.cadastrar(cliente);
	                                        
	                                        System.out.println(CadastroCliente.procurar(cpf));
	                                       
	 
	                                        break;
	                                case 2:// Remover Cliente
	                                        System.out.println("Digite CPF do cliente que você deseja remover");
	                                        long cpf1;
	                                        cpf1 = ler.nextLong();
	 
	                                       CadastroCliente.remover(cpf1);
	 
	                                        break;
	 
	                                case 3:// Exibir Cliente
	                                        System.out.println("Digite CPF do cliente que você deixar exibir os dados");
	                                        long cpf2;
	                                        cpf2 = ler.nextLong();
	 
	                                        System.out.println(CadastroCliente.procurar(cpf2));
	 
	                                        break;
	 
	                                default:
	                                        System.out.println("Opção inválda");
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
	                                        
		                                case 1: 
		                                String nomeTreinador;
		                                System.out.println("Nome: ");
		                                nomeTreinador = ler.nextLine();
		                                System.out.println("CPF: ");
		                                long cpf;
		                                cpf = ler.nextLong();
		                                
		                                Treinador treinador = new Treinador(nomeTreinador,cpf);
		                                
		                                CadastroTreinador.cadastrar(treinador);
		                                
		                                        break;
		                                case 2:
		                                        System.out.println("Digite o nome do Treinador que você deseja remover");
		                                        String nomeT;
		                                        nomeT = ler.nextLine();
		                                        System.out.println(CadastroTreinador.procurar(nomeT));
		                                        CadastroTreinador.remover(nomeT);
		                                       
		                                        break;
		                                case 3:
		                                       
		                                        System.out.println("Digite o nome do Treinador que você deseja exibir");
		                                        String nomeT2;
		                                        nomeT2 = ler.nextLine();
		                                        System.out.println(CadastroTreinador.procurar(nomeT2));
		                                       
		                                       
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
	 
	                                case 1: 
	                                	System.out.println("Digite o nome Aula: ");
	                                	String nomeAula;
	                                	nomeAula = ler.nextLine();
	                                	
	                                	System.out.println("Digite o dia da semana: ");
	                                	String diaDasemana;
	                                	diaDasemana = ler.nextLine();
	                                	
	                                	System.out.println("Digite a hora da Aula: ");
	                                	String hora;
	                                	hora = ler.nextLine();
	                                	
	                                	Aulas aula = new Aulas (nomeAula, diaDasemana, hora);
	                                	
	                                	CadastroAula.cadastrar(aula);
	                                	System.out.println(CadastroAula.procurar(nomeAula));
	                                	
	 
	                                        break;
	                                case 2: 
	                                	System.out.println("Digite o nome da Aula a ser removida: ");
	                                	String nomeAulaRemocao;
	                                	nomeAulaRemocao = ler.nextLine();
	                                	
	                                	CadastroAula.remover(nomeAulaRemocao);
	                                	
	                                        break;
	                                case 3:
	                                	System.out.println("Digite o nome da Aula: ");
	                                	String nomeAulaBusca;
	                                	nomeAulaBusca = ler.nextLine();
	                                	
	                                	System.out.println(CadastroAula.procurar(nomeAulaBusca));
	                                	
	                                        break;
	                                default:
	                                        break;
	                                }
				} while (opcao4 != 0);
                                break;
                        case 4: // Administrar Mensalidades
                               
 
                                break;
 
                        default:
 
                                System.out.println("Opção é invalida");
                                break;
                        }
                        
                    }while(opcao1 != 0);

                    break;

            case 2: // Menu Cliente

                    System.out.println("2- Cliente ");

                    break;
                    
            case 3: // Menu Treinador
            	
            	System.out.println("3- Treinador");
            	
            	break;

            default:

                    System.out.println("Opção é inválida");

            }
        
   }while(opcao != 0);

}
}
