package negocios;

import classesBasicas.Aula;
import classesBasicas.Cliente;
import classesBasicas.Treinador;
import classesBasicas.Treino;

public class MyGymFachada implements IMyGymFachada{
	
	
	private CadastroCliente cadastroCliente;
	private CadastroAula cadastroAula;
	private CadastroTreinador cadastroTreinador;
	private CadastroTreino cadastroTreino;
	private CadastroPresenca cadastroPresenca;
	
	
	
public MyGymFachada (){
	cadastroAula = new CadastroAula();
	cadastroCliente = new CadastroCliente();
	cadastroPresenca = new CadastroPresenca();
	cadastroTreinador = new CadastroTreinador();
}

//CadastroCliente
public void cadastrarCliente (Cliente cliente) { // colocar a execao
	cadastroCliente.cadastrar(cliente);
}

public Cliente procurarCliente(long cpf){ // colocar a excecao
	return procurarCliente(cpf);
}

public boolean existeCliente (long cpf){
	return existeCliente(cpf);
}

public void removerCliente (long cpf){
	cadastroCliente.remover(cpf);
}

public Cliente [ ] exibir(){
	return cadastroCliente.exibir();
}
// CadastroAula
public void cadastrarAula (Aula aula ){
	cadastroAula.cadastrar(aula);
}
public Aula procuraAula(String nome){
	return procuraAula(nome);
}
public boolean existeAula(String nome){
	return existeAula(nome);
}
public void removerAula (String nome){
	cadastroAula.remover(nome);
}
public Aula [ ] Exibir(){
	return cadastroAula.exibir();
}
// Cadastro Treinador

//CadastroTreinador
public void cadastrarTreinador(Treinador treinador){
	cadastroTreinador.cadastrar(treinador);
}
public Treinador procurarTreinador(long cpf){
	return procurarTreinador(cpf);
}
public boolean existeTreinador(long cpf){
	return existeTreinador(cpf);
}
public void removerTreinador( long cpf){
	cadastroTreinador.remover(cpf);
}

//CadastroTreino

public void cadastrarTreino( Treino treino){
	cadastroTreino.cadastrar(treino);
}
public Treinador procurarTreino(long cpf){
	return procurarTreino(cpf);
}
public boolean existeTreino(long cpf){
	return existeTreino(cpf);
}
public void removerTreino( long cpf){
	cadastroTreinador.remover(cpf);
}

}
