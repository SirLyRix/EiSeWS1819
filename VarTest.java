package ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class VarTest {

    Var a;
    @Before
    void setUp() {
        this.a = new Var("A");
    }

    @Test
    void toPrefixString()
    {
    assertEquals("A", this.a.toPrefixString());
    }

    @Test
    void toInfixString() {
        assertEquals("A", this.a.toInfixString());
    }
}