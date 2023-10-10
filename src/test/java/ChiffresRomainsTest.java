import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions. *;

import ChiffresRomains.ChiffresRomains;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.ArrayList;
import java.util.List;

class ChiffresRomainsTest {

    private ChiffresRomains monChiffreRomain;
    @BeforeEach
    void setUp() {  monChiffreRomain = new ChiffresRomains(); }

    @AfterEach
    void tearDown() { monChiffreRomain  = null; }


    @Test
    void renseigner_Chiffre_1_doit_retourner_Chiffre_I() {

        //GIVEN
        String expectedChiffreRomain = "I";
        int Nombre = 1;

        //WHEN
        String actualChiffreRomain = monChiffreRomain.convert(Nombre);

        //THEN
        assertThat(actualChiffreRomain).isEqualTo(expectedChiffreRomain);
    }
    

}