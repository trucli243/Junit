
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testSNT.ktNt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class TestNT {
    @Test
    public void testSoLe()
            {
                int n = 5;
                boolean expected = true;
                boolean actual = ktNt.ktNt(n);
                Assertions.assertEquals(expected, actual);
            }
}
