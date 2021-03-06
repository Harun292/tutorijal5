package ba.unsa.etf.rs.tut5;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {

    private static KorisniciModel model=null;

    @BeforeAll
    static void setup (){
        model=new KorisniciModel();
        model.napuni();
    }

    @Test
    void testNovogKorisnika() {
        ObservableList<Korisnik> x = model.getKorisnici();
        x.add(new Korisnik("semso","Semso","Email","user","pass"));
        assertEquals(4,model.getKorisnici().size());
    }
}