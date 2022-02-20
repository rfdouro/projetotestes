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
public class OlaTest {
 
 public OlaTest() {
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
  * Teste para o método digaOla da classe Ola.
  */
 @Test
 public void testDigaOla() {
  System.out.println("digaOla");
  Ola instance = new Ola();
  String expResult = "Olá Mundo!";
  String result = instance.digaOla();
  assertEquals(expResult, result);
 }
 
}
