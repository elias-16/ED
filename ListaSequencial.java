package ED;

public class ListaSequencial {
	
	/* Aluno: Elias Victor de Andrade Torres
	 * Matrícula: 20210138917
	 */

	  private int dados[];
	  private int tamAtual;
	  private int tamMax;

	  // 1. Criação de lista vazia

	  public void CriarLista(){
	    tamAtual = 0;
	    tamMax = 10;
	    dados = new int[tamMax];
	  }

	  // 2. Verificar se a lista está vazia

	  public void ListaVazia(){
	    if(tamAtual == 0){
	      System.out.println("A lista está vazia");
	    }else{
	      System.out.println("A lista não está vazia");
	    }
	  }

	  // 3. Verificar se a lista está cheia

	 public void ListaCheia(){
	    if(tamAtual == tamMax){
	      System.out.println("A lista está cheia");
	    }else{
	      System.out.println("A lista não está cheia");
	   }
	 }

	 // 4. Obter o tamanho da lista

	  public void TamanhoLista(){
	    System.out.println("O tamanho atual da lista: " + tamAtual);
	  }

	  // 5.1 Obter o valor de uma posição

	  public void ObterValor(int pos){
	    System.out.println("Valor da posição:" + dados[pos - 1]);
	  }

	  // 5.2 Modificar o valor de uma posição

	  public void AlterarValor(int pos, int novoValor){
	    int aux = dados[pos - 1];
	    dados[pos - 1] = novoValor;
	    System.out.println("O valor " + aux + " da posição " + pos + " foi alterado para " + novoValor);
	  }

	  // 6. Inserir um elemento em uma posição

	  public void InserirValor(int pos, int valor){

	    if((pos < 1) || (pos > tamAtual + 1) || (tamAtual == tamMax)){
	      System.out.println("Posição inválida");
	      System.exit(0);
	    }

	   for(int i = tamAtual - 1; i >= pos - 1; i--){
	     dados[i + 1] = dados[i];
	   }
	    dados[pos - 1] = valor;
	    tamAtual++;
	  } 

	  // 7. Retirar elemento de uma posição

	  public void RetirarValor(int pos){
	    if((pos < 1) || (pos > tamAtual)){
	      System.out.println("Posição inválida");
	      System.exit(0);
	    }
	    
	    for(int i = pos - 1; i < tamAtual - 1; i++) {
	    	dados[i] = dados[i+1];
	    }
	    
	    tamAtual--;
	  }
	  
	  // Imprimir lista (para facilitar os testes) 
	  
	  public void ImprimirLista() {
		  for(int i = 0; i < tamAtual; i++) {
			  System.out.printf("%d ", dados[i]);
		  }
		  System.out.println("");
	  }
	  
	  public static void main(String[] args) {
		  
		  ListaSequencial lista = new ListaSequencial();
		  
		  // Testando...
		  lista.CriarLista();
		  lista.InserirValor(1, 2);
		  lista.InserirValor(2, 3);
		  lista.InserirValor(3, 7);
		  lista.InserirValor(4, 4);
		  lista.ImprimirLista();
		  lista.AlterarValor(2, 8);
		  lista.ImprimirLista();
		  lista.RetirarValor(1);
		  lista.ImprimirLista();
		  lista.InserirValor(2, 5);
		  lista.ImprimirLista();
		  lista.TamanhoLista();
	  }
}