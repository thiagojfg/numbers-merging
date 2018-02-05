/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagojfg.s2it;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author desen03
 */
public class NumberMergerTest {
    
    NumberMerger numberMerger;
    
    @Before
    public void setUp() {
        numberMerger = new NumberMerger();
    }
        
    @Test
    public void deveRetornar12() {
        
        int result = numberMerger.merge(1, 2);
        
        assertEquals(12, result);
    }
    
    @Test
    public void testResultadoMaiorQue1000000() {
        
        int result = numberMerger.merge(1000, 1000);
        
        assertEquals(-1, result);
    }
    
    @Test
    public void testMergeSimples() {
        
        int result = numberMerger.merge(111, 222);
        
        assertEquals(121212, result);
    }
    
    @Test
    public void testMergeSimplesComNumeroNegativo() {
        
        int result = numberMerger.merge(-111, -222);
        
        assertEquals(121212, result);
    }
    
    @Test
    public void testMergeComNumeroAMaiorQueB() {
        
        int result = numberMerger.merge(1234, 12);
        
        assertEquals(112234, result);
    }
    
    @Test
    public void testMergeComNumeroBMaiorQueA() {
        
        int result = numberMerger.merge(12, 1234);
        
        assertEquals(112234, result);
    }
    
}
