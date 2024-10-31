public class Main {
    public static void main(String[] args) {
    	ListaEncadeada<Aluno> presenca = new ListaEncadeada<Aluno>();
    	
    	presenca.adicionaInicio(new Aluno("Douglas"));
    	presenca.adicionaInicio(new Aluno("Jonas"));
    	presenca.adicionaInicio(new Aluno("Jose"));
    	presenca.adicionaInicio(new Aluno("Pedin Pirigo"));
    	
    	/**
    	System.out.println("Resultados.");
    	System.out.println(presenca.buscaNo(0).getElemento().getNome());
    	System.out.println(presenca.buscaNo(1).getElemento().getNome());
    	System.out.println(presenca.buscaNo(2).getElemento().getNome());
    	System.out.println(presenca.buscaNo(3).getElemento().getNome());

    	System.out.println();
    	
    	System.out.println("Resultados de alteracoes.");
    	System.out.println(presenca.buscaNo(0).getElemento().getNome());
    	System.out.println(presenca.buscaNo(1).getElemento().getNome());
    	presenca.removerNo(2);
    	System.out.println(presenca.buscaNo(2).getElemento().getNome());
    	**/
    	
    	System.out.println("Antes da inverssão");
    	for (int i = 0 ;i<presenca.getTamanho(); i++){
    	System.out.println(presenca.buscaNo(i).getElemento().getNome());
    	}
    	presenca.inverter();
    	
    	System.out.println("Depois da inverssão");
    	for (int i = 0;i<presenca.getTamanho(); i++){
    	System.out.println(presenca.buscaNo(i).getElemento().getNome());
    	
    	}
    	
    	
    }
}