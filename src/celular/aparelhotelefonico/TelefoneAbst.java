package celular.aparelhotelefonico;

public abstract class TelefoneAbst implements TelefoneIntfc {
  
    @Override
    public void ligar(int numero){
        System.out.println("ligando para o " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de voz");
}
}