package atividade2;



public class Principal {
    public static void main(String[] args) {
        ModeloBasico celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.fazerLigacao("123456789");
        celularBasico.enviarMensagem("123456789", "Olá! Como você está?");
        celularBasico.desligar();

        ModeloAvancado celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.enviarMensagem("339087843", "Oi meu bem");
        celularAvancado.fazerLigacao("989599589");
        celularAvancado.desligar();
        celularAvancado.exibirHistoricoLigacoes();
        celularAvancado.exibirHistoricoMensagens();






        
        

    }
}
