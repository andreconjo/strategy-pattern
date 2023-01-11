package br.com.andreconjo.notificacao;

import br.com.andreconjo.notificacao.impl.EmailNotificacao;
import br.com.andreconjo.notificacao.impl.WhatsAppNotificacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum NotificacaoEnum {
    WHATSAPP,
    EMAIL,
    TODOS;


    public List<INotificacao> getNotificacaoSelecionada() {
        switch (this) {
            case WHATSAPP:
                return Collections.singletonList(new WhatsAppNotificacao());
            case TODOS:
                return Arrays.asList(new WhatsAppNotificacao(), new EmailNotificacao());
            default:
                return Collections.singletonList(new EmailNotificacao());
        }
    }
}
