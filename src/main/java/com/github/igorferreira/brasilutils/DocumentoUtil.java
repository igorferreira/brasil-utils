package com.github.igorferreira.brasilutils;

import org.apache.commons.lang3.StringUtils;
import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;

public class DocumentoUtil {

	private DocumentoUtil() {}

	/**
	 * Metodo para formatar um documento CPF ou CNPJ para numericos.
	 */
	public static String formatarDocumentoCpfCnpjParaApenasNumeros(String cpfCnpj, boolean isCpf) {
		if (StringUtils.contains(cpfCnpj,".") || StringUtils.contains(cpfCnpj,"-") || StringUtils.contains(cpfCnpj,"/")) {
			cpfCnpj = cpfCnpj.replace(".", "").replace("-", "").replace("/", "");
		}
		// Ha sistemas que convertem os documentos para Long, perdendo os Zeros a esquerda.
		if (isCpf) {
			cpfCnpj = StringUtils.leftPad(cpfCnpj, 10, "0");

		} else {
			cpfCnpj = StringUtils.leftPad(cpfCnpj, 14, "0");
		}
		return cpfCnpj;
	}

	/**
	 * Metodo para validar CPF com ou sem formatacao.
	 */
	public static boolean validaCpf(String cpf){

		boolean validaCpf = true;

		String cpfApenasNumeros = formatarDocumentoCpfCnpjParaApenasNumeros(cpf,true);
		CPFValidator cpfValidator = new CPFValidator();

		try {
			cpfValidator.assertValid(cpfApenasNumeros);
		} catch (Exception e) {
			validaCpf = false;
		}
		return validaCpf;
	}

	/**
	 * Metodo para validar CNPJ com ou sem formatacao.
	 */
	public static boolean validaCnpj(String cnpj){

		boolean validaCnpj = true;

		String cpnjApenasNumeros = formatarDocumentoCpfCnpjParaApenasNumeros(cnpj,true);
		CNPJValidator cnpjValidador = new CNPJValidator();

		try {
			cnpjValidador.assertValid(cpnjApenasNumeros);
		} catch (Exception e) {
			validaCnpj = false;
		}

		return validaCnpj;
	}

	public static boolean isCpf(String numero) {
		String cpfApenasNumeros = formatarDocumentoCpfCnpjParaApenasNumeros(numero,true);
		return validaCpf(cpfApenasNumeros);
	}

	public static boolean isCnpj(String numero) {
		String cpnjApenasNumeros = formatarDocumentoCpfCnpjParaApenasNumeros(numero,false);
		return validaCnpj(cpnjApenasNumeros);
	}

}
