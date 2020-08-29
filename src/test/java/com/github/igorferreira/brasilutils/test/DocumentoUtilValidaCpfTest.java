package com.github.igorferreira.brasilutils.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import lombok.extern.slf4j.Slf4j;

import com.github.igorferreira.brasilutils.DocumentoUtil;

@Slf4j
@RunWith(JUnitPlatform.class)
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Tests DocumentoUtil")
public class DocumentoUtilValidaCpfTest {

	@Order(1)
	@Test
	public void testCPFValidoComPontuacao() {

		final String cpfComPontuacao = "542.821.517-81";
		log.info("cpfComPontuacao: {} ",cpfComPontuacao);

		assertTrue(DocumentoUtil.validaCpf(cpfComPontuacao));
	}

	@Order(2)
	@Test
	public void testCPFValidoSemPontuacao() {

		final String cpfSemPontuacao = "54282151781";
		log.info("cpfSemPontuacao: {} ",cpfSemPontuacao);

		assertTrue(DocumentoUtil.validaCpf(cpfSemPontuacao));
	}

	@Order(3)
	@Test
	public void testCPFInvalidoSemPontuacao() {

		final String cpfSemPontuacao = "14282151781";
		log.info("cpfSemPontuacao: {} ",cpfSemPontuacao);

		assertFalse(DocumentoUtil.validaCpf(cpfSemPontuacao));
	}

	@Order(4)
	@Test
	public void testCPFInvalidoComPontuacao() {

		final String cpfComPontuacao = "142.821.517-81";
		log.info("cpfComPontuacao: {} ",cpfComPontuacao);

		assertFalse(DocumentoUtil.validaCpf(cpfComPontuacao));
	}

	@Order(5)
	@Test
	public void testIsCPFComPontuacao() {

		final String cpfComPontuacao = "542.821.517-81";
		log.info("cpfComPontuacao: {} ",cpfComPontuacao);

		assertTrue(DocumentoUtil.isCpf(cpfComPontuacao));
	}

	@Order(6)
	@Test
	public void testIsCPFSemPontuacao() {

		final String cpfSemPontuacao = "59247582067";
		log.info("cpfSemPontuacao: {} ",cpfSemPontuacao);

		assertTrue(DocumentoUtil.isCpf(cpfSemPontuacao));
	}

	@Order(7)
	@Test
	public void testIsCNPJComPontuacao() {

		final String cnpjComPontuacao = "50.044.702/0001-45";
		log.info("cnpjComPontuacao: {} ",cnpjComPontuacao);

		assertTrue(DocumentoUtil.isCnpj(cnpjComPontuacao));
	}

	@Order(8)
	@Test
	public void testIsCNPJSemPontuacao() {

		final String cnpjSemPontuacao = "74801647000159";
		log.info("cnpjSemPontuacao: {} ",cnpjSemPontuacao);

		assertTrue(DocumentoUtil.isCnpj(cnpjSemPontuacao));

	}
}
