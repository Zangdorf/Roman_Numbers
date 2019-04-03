package romanNumbers;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

  RomanNumberConverter rnc;

  @Before
  public void setup() {
    rnc = new RomanNumberConverter();
  }

  @Test
  public void checkRomanToIntConverter() {
    assertThat(rnc.convertRomanToInt("XXIV"))
      .isEqualTo(24);
    assertThat(rnc.convertRomanToInt("MDCLXVI"))
      .isEqualTo(1666);
  }

  @Test
  public void check_null() {
      /*
    assertThatThrownBy(() -> hello.hello(null))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("cannot be null");
      */
  }


  @Test
  public void check_IllegalChar() {
      /*
      assertThat(rnc.convertBasicLetterToNumber('A'))
      .isInstanceOf(IllegalArgumentException.class);
      assertThat(rnc.convertBasicLetterToNumber('B'))
      .isInstanceOf(IllegalArgumentException.class);
      */
  }


  @Test
  public void checkIsValidRomanString() {
    assertThat(rnc.isValidRomanString("XXIIV"))
      .isEqualTo(false);
    assertThat(rnc.isValidRomanString("MMMMMD"))
      .isEqualTo(true); 
    assertThat(rnc.isValidRomanString("DCLXVI"))
      .isEqualTo(true); 
    assertThat(rnc.isValidRomanString("CCCCVI"))
      .isEqualTo(false);
  }

}
