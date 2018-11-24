package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Lugar;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.TipoDeIngresso;


public class DescontoTest {

	@Test
	public void naoDeveConcederDescontoParaIngressoNormal() {
<<<<<<< HEAD
		Lugar lugar = new Lugar ("A",1);
		Sala sala = new Sala("Eldorado - Imax",new BigDecimal(22.50));
		Filme filme = new Filme("RogueOne", Duration.ofMinutes(120),"SCI-FI", new BigDecimal(12.0));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme , sala);
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.INTEIRO,lugar);
=======
		Lugar lugar = new Lugar("A",1);
		Sala sala = new Sala("Eldorado - Imax",new BigDecimal(22.50));
		Filme filme = new Filme("RogueOne", Duration.ofMinutes(120),"SCI-FI", new BigDecimal(12.0));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme , sala);
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.INTEIRO, lugar);
>>>>>>> 927f7a9a07c9c3474cdfc4a8cddd4169b85185bf
		
		BigDecimal precoEsperado = new BigDecimal("34.5");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
	
}
