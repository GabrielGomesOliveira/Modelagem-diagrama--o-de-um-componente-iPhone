package celular;
import celular.aparelhotelefonico.TelefoneIntfc;
import celular.navegadorinternet.NavegadorIntf;
import celular.reprodutormusical.ReproducaoIntfc;

public class celularMultUso implements ReproducaoIntfc, TelefoneIntfc, NavegadorIntf {

    @Override
    public void tocar(){
        System.out.println("Ouvindo música.");
    }
    
    @Override
    public void pausar(){
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica(String nome){
        System.out.println(nome + "selecionada");
    }

    @Override
    public void ligar(int numero){
        System.out.println("Ligando para o " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando a página.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
}
 