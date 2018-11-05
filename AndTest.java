package ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class AndTest {

    And and;
    And andAnd;
    And andOr;
    Or or;
    Var a = new Var("A");
    Var b = new Var("B");
    @Before
    void setUp() {
        this.and = new And(this.a, this.b);
        this.or = new Or(this.a,this.b);
        this.andOr = new And(this.a, this.or);
        this.andAnd = new And(this.a, this.and);
    }

    @Test
    void toPrefixString() {
        assertEquals("& A B",this.and.toPrefixString());
    }

    @Test
    void toInfixString() {
        assertEquals("A & B", this.and.toInfixString());
        assertEquals("A & (A | B)", this.andOr.toInfixString());
    }
}