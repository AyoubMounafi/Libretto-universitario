package it.unibs.fp.libretto.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import it.unibs.fp.libretto.Esame;
import it.unibs.fp.libretto.Libretto;

public class LibrettoTest {

    @Test
    public void testCreazioneLibretto() {
        Libretto l = new Libretto();
        assertNotNull(l.getEsamiSuperati());
    }

    @Test
    public void testAggiungiEsame() {
        Libretto l = new Libretto();
        Esame e = new Esame("Analisi I", 9, 25);
        l.aggiungiEsami(e);
        assertEquals(1, l.getEsamiSuperati().size());
    }
}
