package celular;

public class App {
    public static void main(String[] args) {
        celularMultUso celular = new celularMultUso();

        System.out.println("<-------------------->");
        celular.selecionarMusica("Caneta Azul - Manoel Gomes");
        celular.tocar();
        celular.pausar();

        System.out.println("<-------------------->");
        celular.atender();
        celular.iniciarCorreioVoz();
        celular.ligar(988402843);

        System.out.println("<-------------------->");
        celular.exibirPagina();
        celular.atualizarPagina();;
        celular.adicionarNovaAba();;

        System.out.println("<-------------------->");



    }
}
