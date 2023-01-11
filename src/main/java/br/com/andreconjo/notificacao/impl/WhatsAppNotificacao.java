package br.com.andreconjo.notificacao.impl;

import br.com.andreconjo.notificacao.INotificacao;

public class WhatsAppNotificacao implements INotificacao {
    public void enviarNotificacao(String contato, String mensagem) {
        System.out.println("Enviando WhatsApp para " + contato + " com a mensagem: " + mensagem);
    }
}
