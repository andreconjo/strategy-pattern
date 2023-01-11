package br.com.andreconjo;

import br.com.andreconjo.modelo.Usuario;
import br.com.andreconjo.notificacao.INotificacao;
import br.com.andreconjo.notificacao.NotificacaoEnum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("André Conjo");
        usuario.setNotificacao(NotificacaoEnum.TODOS);

        List<INotificacao> notificacoes = usuario.getNotificacao().getNotificacaoSelecionada();
        notificacoes.forEach(notificacao -> notificacao.enviarNotificacao(usuario.getNome(), "Olá, tudo bem?"));
    }
}