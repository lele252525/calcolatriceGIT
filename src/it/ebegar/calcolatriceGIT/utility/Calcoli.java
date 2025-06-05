package it.ebegar.calcolatriceGIT.utility;

public class Calcoli {

    //Base
    public static int somma(int a, int b) {
        return a + b;
    }

    /**
     * @param base      Base della potenza
     * @param esponente Esponente della potenza
     * @return base elevata all'esponente
     * @author Riccardo Roman
     */
    public static int potenza(int base, int esponente) {
        return (int) Math.pow(base, esponente);
    }
    
    /**
     * @param fattoreUno  Primo fattore della moltiplicazione
     * @param fattoreDue  Secondo fattore della moltiplicazione 
     * @return moltiplicazione fattori
     * @author Daniele Costa
     */
    
    public static int moltiplicazione(int fattoreUno, int fattoreDue) {
    	return fattoreUno * fattoreDue;
    }
}
