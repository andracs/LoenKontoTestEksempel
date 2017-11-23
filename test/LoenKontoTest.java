import org.junit.Test;

import static org.junit.Assert.*;

public class LoenKontoTest {

    @Test
    public void testerIndbetaling () throws Exception {
        // Her tester jeg lidt
        LoenKonto k = new LoenKonto();
        k.setSaldo(1000);
        k.laegPengeInd(100);
        int resultat = k.getSaldo();
        // Laver assertion
        assertEquals("Hov, indebatilingen ser ikke rigtig ud!",1100, resultat);

    }


    @org.junit.Test
    public void testerMinusSaldo() throws Exception {
        LoenKonto konto = new LoenKonto();
        int saldo = konto.setSaldo(10);
        boolean resultat;
        if (saldo < 0) {resultat = false;}
        else {resultat = true; }
        assertTrue("Konto må ikke være i minus", resultat);
    }

}