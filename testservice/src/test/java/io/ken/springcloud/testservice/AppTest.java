package io.ken.springcloud.testservice;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        String id = UUID.randomUUID().toString().replace("-","");
        System.out.println(id);
    }
}
