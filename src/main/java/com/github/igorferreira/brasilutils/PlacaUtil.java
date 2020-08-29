package com.github.igorferreira.brasilutils;

public class PlacaUtil {

	private PlacaUtil(){
	}

    public static boolean isPlacaMercosul(String placa) {
    	if (placa == null || "".equals(placa)) {
    		return false;
    	}
        boolean placaValida = true;

        if (placa.length() > 0) {
            if (placa.length() < 7) {
                placaValida = false;
            } else {
                if (!placa.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}")) {
                    placaValida = false;
                }
            }
        }
        return placaValida;
    }

    public static boolean isPlaca(String placa) {
    	if (placa == null || "".equals(placa)) {
    		return false;
    	}
        boolean placaValida = true;

        if (placa.length() > 0) {
            if (placa.length() < 7) {
                placaValida = false;
            } else {
                if (!placa.matches("[A-Z]{3}-[0-9]{4}") && !placa.matches("[A-Z]{3}[0-9]{4}")) {
                	placaValida = false;
                }
            }
        }
        return placaValida;
    }

}
