package ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class BooleanExpressionTest {

    BooleanExpression a;
    BooleanExpression b;
    @Before
    void setUp() {
        this.a = BooleanExpression.parseExpression("A ! B & C |");
        this.b = BooleanExpression.parseExpression("A B & ! C D | ! |");
    }

    @Test
    void toPrefixString() {
        assertEquals("| & ! A B C", this.a.toPrefixString());
        assertEquals("| ! & A B ! | C D", this.b.toPrefixString());
    }

    @Test
    void toInfixString() {
        assertEquals("!A & B | C", this.a.toInfixString());
        assertEquals("!(A & B) | !(C | D)",this.b.toInfixString());
    }
}