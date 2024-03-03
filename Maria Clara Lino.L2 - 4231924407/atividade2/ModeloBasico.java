package atividade2;


public class ModeloBasico implements Celular {

    @Override
    public void desligar() {
        System.out.println("Celular desligado");
        
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Mensagem: "+ mensagem + " enviada para o número: "+ numero);
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo Ligação para: "+ numero);
        
    }

    @Override
    public void ligar() {
        System.out.println("Celular Ligado");
        
    }
    
}
