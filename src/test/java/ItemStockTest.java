import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemStockTest {

  @Nested
  class 空の場合 {
    ItemStock sut;

    @BeforeEach
    void setup() {
      sut = new ItemStockImp();
    }

    @Test
    void size_Aが0を返す() {
      assertThat(sut.size("A"), is(0));
    }

    @Test
    void contains_Aはfalseを返す() {
      assertThat(sut.contain("A"), is(false));
    }
  }

  @Nested
  class 商品Aを1件含む場合 {
    ItemStock sut;

    @BeforeEach
    void setup() {
      sut = new ItemStockImp();
      sut.add("A", 1);
    }

    @Test
    void size_Aが1を返す() {
      assertThat(sut.size("A"), is(1));
    }

    @Test
    void contains_Aはtrueを返す() {
      assertThat(sut.contain("A"), is(true));
    }
  }
}
