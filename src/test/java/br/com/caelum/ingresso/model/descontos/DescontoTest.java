package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;


public class DescontoTest {

	@Test
	public void naoDeveConcederDescontoParaIngressoNormal() {
		Sala sala = new Sala("Eldorado - Imax",new BigDecimal(22.50));
		Filme filme = new Filme("RogueOne", Duration.ofMinutes(120),"SCI-FI", new BigDecimal(12.0));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme , sala);
		Ingresso ingresso = new Ingresso(sessao, new SemDesconto());
		
		BigDecimal precoEsperado = new BigDecimal("34.50");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
	
}