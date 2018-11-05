package ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class NotTest {

    Not not;
    Not notAnd;
    Not notOr;
    And and;
    Or or;
    Var a = new Var("A");
    Var b = new Var("B");
    @Before
    void setUp() {
        this.not = new Not(this.a);
        this.and = new And(this.a, this.b);
        this.or = new Or(this.a, this.b);
        this.notAnd = new Not(this.and);
        this.notOr = new Not(this.or);
    }

    @Test
    void toPrefixString()
    {
        assertEquals("! A", this.not.toPrefixString());
    }

    @Test
    void toInfixString() {
        assertEquals("!A", this.not.toInfixString());
        assertEquals("!(A & B)", this.notAnd.toInfixString());
        assertEquals("!(A | B)", this.notOr.toInfixString());
    }
}