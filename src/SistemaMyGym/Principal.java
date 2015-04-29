package SistemaMyGym;

import java.util.Scanner;

import Dados.RepositorioClientes;

public class Principal {

	private static Scanner ler;
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		ler = new Scanner(System.in);
		int opcao;
		System.out.println("1- Administrador \n2- Cliente ");
		opcao = ler.nextInt();
		
		switch (opcao) {
		
		case 1: // Menu Administrar
			
		System.out.println("1-Administrar Cliente \n2-Administrar Treinador \n3-Administrar Aulas \n4-Administrar Mensalidades ");
		
		int opcao1;
		opcao1 = ler.nextInt();
		switch(opcao1){
		
		case 1: // Administrar Cliente
		System.out.println("1-Cadastrar Cliente \n2-Remover Cliente \n3-Exibir Cliente");
		
		int opcao2;
		opcao2 = ler.nextInt();
		
		switch(opcao2){//Menu Administrar Cliente - 2
		
		case 1:// Cadastrar Cliente
			System.out.println("-- CADASTRO CLIENTE -- \n\nNome: ");
			String nome;
			nome = ler.nextLine();
			
			System.out.println("\nIdade: ");
			int idade;
			idade = ler.nextInt();
			
			System.out.println("\nEndereço: ");
			
			
			break;
		case 2:// Remover Cliente
			break;
		case 3:// Exibir Cliente
			break;
		default:
			break;
		
		}
		
		break;
		case 2:// Administrar Treinador
		
		System.out.println("1-Cadastrar Treinador \n2-Remover Treinador \n3-Exibir Treinador");
		int opcao3;
		opcao3 = ler.nextInt();
		
		switch(opcao3){
		
		case 1 : // cadastrar Treinador
			break;
		case 2: // Remover Treinador
			break;
		case 3: // Exibir Treinador
			break;
		default:
			break;
		}
		break;
		
		case 3: // Administrar Aulas
			
			System.out.println("1-Cadastrar Aulas \n2-Remover Aulas \n3-Exibir Aulas");
			int opcao4;
			opcao4 = ler.nextInt();
			
			switch(opcao4){
			
			case 1 : // Cadastrar Aulas
				
				break;
			case 2: // Remover Aulas
				break;
			case 3: // Exibir Aulas
				break;
			default:
				break;
			}
			break;
		case 4: // Administrar Mensalidades 
			
			break;
		
		default:
			
			System.out.println("Este não é um dia válido!");
			break;
		}
		
		break;
	
		case 2:
		
		System.out.println("2- Cliente ");
	
		break;
	
		
		default:
			
		System.out.println("Este não é um dia válido!");
	
		}

	}

}
