package br.si.miniteste1.facade.application;

import br.si.miniteste1.facade.entities.SMSOwnService;
import br.si.miniteste1.facade.entities.TelegramService;
import br.si.miniteste1.facade.entities.WhatsAppService;

class MensagemFacade {

	public static void Mensagem(int escolha, String mensagem) {

		if (escolha == 1) {
			System.out.println("WhatsApp Service escolhido...");
			WhatsAppService wpp = new WhatsAppService();
			wpp.sendMessage(mensagem);
		}
		else if (escolha == 2) {
			System.out.println("Telegram Service escolhido...");
			TelegramService ts = new TelegramService();
			ts.enviarSMS(mensagem);
		}
		else if (escolha == 3) {
			System.out.println("SMS Own Service escolhido...");
			SMSOwnService sms = new SMSOwnService();
			sms.enviarSMS(mensagem);
		}
	}
}