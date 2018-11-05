package ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class OrTest {

    Or or;
    Or orAnd;
    Or orOr;
    And and;
    Var a = new Var("A");
    Var b = new Var("B");

    @Before
    void setUp()
    {
        this.or = new Or(this.a, this.b);
        this.and = new And(this.a, this.b);
        this.orAnd = new Or(this.a, this.and);
        this.orOr = new Or(this.or, this.or);
    }

    @Test
    void toPrefixString()
    {
        assertEquals("| A B", this.or.toPrefixString());
    }

    @Test
    void toInfixString() {
        assertEquals("A | B", this.or.toInfixString());
        assertEquals("A | A & B", this.orAnd.toInfixString());
        assertEquals("A | B | A | B", this.orOr.toInfixString());
    }
}