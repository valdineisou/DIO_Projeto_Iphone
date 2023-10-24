import Smartphone.Dispositivo;

public class Iphone {
    public static void main(String[] args) {

        Dispositivo iphone = new Dispositivo();

        System.out.println("--APARELHO TELEFÔNICO--");
        iphone.ligar();
        iphone.atender();
        iphone.CorreioDeVoz();

        System.out.println("--NAVEGADOR DE INTERNET--");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("--REPRODUTOR MUSICAL--");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
