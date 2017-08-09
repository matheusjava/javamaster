package projetoaula;

public class pessoa {
   
private string nome;
private string endereco;
private string telefone;
private string bairro;
private contaCorrente contaCorrente;
private contaPoupanca contaPoupanca;

public pessoa () {

}


public string getNome () {
	return nome;
}


public void setNome(string nome) {
	this.nome = nome;
}


public string getEndereco() {
	return endereco;
}


public void setEndereco(string endereco) {
	this.endereco = endereco;
}


public string getTelefone() {
	return telefone;
}


public void setTelefone(string telefone) {
	this.telefone = telefone;
}


public string getBairro() {
	return bairro;
}


public void setBairro(string bairro) {
	this.bairro = bairro;
}


public contaCorrente getContaCorrente() {
	return contaCorrente;
}


public void setContaCorrente(contaCorrente contaCorrente) {
	this.contaCorrente = contaCorrente;
}

public contaPoupanca getContaPoupanca() {
	return contaPoupanca;
}


public void setContaPoupanca(contaPoupanca contaPoupanca) {
	this.contaPoupanca = contaPoupanca;
}

}



