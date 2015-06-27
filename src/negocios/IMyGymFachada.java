package negocios;

import classesBasicas.Aula;
import classesBasicas.Cliente;
import classesBasicas.Treinador;
import classesBasicas.Treino;



public interface IMyGymFachada {
// CADASRTO CLIENTE
	void cadastrarCliente(Cliente cliente);
	Cliente procurarCliente (long cpf);
	boolean existeCliente (long cpf);
	void removerCliente (long cpf);
	Cliente [ ] exibir();
// CADASTRO AULA
	void cadastrarAula (Aula aula );
	Aula procuraAula(String nome);
	boolean existeAula(String nome);
	void removerAula (String nome);
	Aula [ ] Exibir();
//CADASTRO TREINADOR
	void cadastrarTreinador(Treinador treinador);
	Treinador procurarTreinador(long cpf);
	boolean existeTreinador(long cpf);
	void removerTreinador( long cpf);
//CADASTRO TREINO
	void cadastrarTreino( Treino treino);
	Treinador procurarTreino(long cpf);
	boolean existeTreino(long cpf);
	void removerTreino( long cpf);
}
