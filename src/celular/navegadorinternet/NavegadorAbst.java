package celular.navegadorinternet;

public abstract class NavegadorAbst implements NavegadorIntf {
    
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo a página.");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando a página.");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a página.");
    }
    
}
