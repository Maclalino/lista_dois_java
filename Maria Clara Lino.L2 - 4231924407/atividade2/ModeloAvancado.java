package atividade2;
import java.util.ArrayList;
import java.util.List;


public class ModeloAvancado implements Celular {

     private List<String> historicoLigacoes = new ArrayList<>();
    private List<String> historicoMensagens = new ArrayList<>();

    @Override
    public void ligar() {
        System.out.println("Celular ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Celular desligado.");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
        historicoLigacoes.add("Ligou para: "+numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
        historicoMensagens.add("Para: " + numero + ", Mensagem: " + mensagem);
    }

    public void exibirHistoricoLigacoes() {
        System.out.println("Histórico de ligações:");
        for (String ligacao : historicoLigacoes) {
            System.out.println(" - " + ligacao);
        }
    }

    public void exibirHistoricoMensagens() {
        System.out.println("Histórico de mensagens:");
        for (String mensagem : historicoMensagens) {
            System.out.println(" - " + mensagem);
        }
    }
}
    

