package Smartphone;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Dispositivo implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void CorreioDeVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

}