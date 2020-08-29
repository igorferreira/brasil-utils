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

import com.github.igorferreira.brasilutils.PlacaUtil;

@Slf4j
@RunWith(JUnitPlatform.class)
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Tests PlacaUtil")
public class PlacaUtilValidaPlacaTest {

	@Order(1)
	@Test
	public void testIsNotPlaca() {

		final String placa = "K1K2101";
		log.info("placa invalida: {} ",placa);
		
		assertFalse(PlacaUtil.isPlaca(placa));
	}

	@Order(2)
	@Test
	public void testIsNotPlacaMercosul() {

		final String placa = "KRK2101";
		log.info("placa antiga: {} ",placa);
		
		assertFalse(PlacaUtil.isPlacaMercosul(placa));
	}

	@Order(3)
	@Test
	public void testIsPlacaMercosul() {

		final String placa = "EZT9B23";
		log.info("placa mercosul: {} ",placa);

		assertTrue(PlacaUtil.isPlacaMercosul(placa));
	}

	@Order(4)
	@Test
	public void testIsPlacaComHifen() {

		final String placa = "KRK-2101";
		log.info("placa com hifen: {} ",placa);
		
		assertTrue(PlacaUtil.isPlaca(placa));
	}

	@Order(5)
	@Test
	public void testIsPlacaSemHifen() {

		final String placa = "KRK2101";
		log.info("placa sem hifen: {} ",placa);

		assertTrue(PlacaUtil.isPlaca(placa));
	}

	@Order(6)
	@Test
	public void testPlacaMercosulIsNotPlaca() {

		final String placa = "EZT9B23";
		log.info("placa mercosul nao placa antiga: {} ",placa);

		assertFalse(PlacaUtil.isPlaca(placa));
	}

}
