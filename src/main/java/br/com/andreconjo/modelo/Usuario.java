package br.com.andreconjo.modelo;

import br.com.andreconjo.notificacao.NotificacaoEnum;

public class Usuario {
    private String nome;
    private NotificacaoEnum notificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NotificacaoEnum getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(NotificacaoEnum notificacao) {
        this.notificacao = notificacao;
    }
}
