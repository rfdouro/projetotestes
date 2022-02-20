package br.org.rfdouro.projtetotestes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author romulo
 */
public class SumSubTest {
 
 public SumSubTest() {
 }
 
 @BeforeAll
 public static void setUpClass() {
 }
 
 @AfterAll
 public static void tearDownClass() {
 }
 
 @BeforeEach
 public void setUp() {
 }
 
 @AfterEach
 public void tearDown() {
 }

 /**
  * Teste para o método sum da classe SumSub.
  */
 @Test
 public void testSum() {
  System.out.println("sum");
  int x = 1;
  int y = 2;
  SumSub instance = new SumSub();
  int expResult = 3;
  int result = instance.sum(x, y);
  assertEquals(expResult, result);
 }

 /**
  * Teste para o método sub da classe SumSub.
  */
 @Test
 public void testSub() {
  System.out.println("sub");
  int x = 3;
  int y = 2;
  SumSub instance = new SumSub();
  int expResult = 1;
  int result = instance.sub(x, y);
  assertEquals(expResult, result);
 }
 
}
