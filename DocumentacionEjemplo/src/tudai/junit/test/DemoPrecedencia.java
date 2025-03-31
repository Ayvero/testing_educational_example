package tudai.junit.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoPrecedencia {
		
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			System.out.println("DemoPrecedencia -> BeforeClass ");
		}
		
		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			System.out.println("DemoPrecedencia -> AfterClass ");
		}

		
		@Before
		public void setUp() throws Exception {
			System.out.println("DemoPrecedencia -> Before");
			
		}
		/**
		 * Metodo tearDown para instancias de test
		 * @throws Exception
		 */
		@After
		public void tearDown() throws Exception {
			System.out.println("DemoPrecedencia -> After");
		}
		
		@Test
		public void testFuncion1() {
			System.out.println("DemoPrecedencia -> testFuncion1");
			Assert.assertEquals(2+2, 5);
			//fail("falla por forzado");
		}
		
		@Test
		public void testFuncion2() {
			System.out.println("DemoPrecedencia -> TestFuncion2");
		}
		@Test
		public void testFuncion3() {
			System.out.println("DemoPrecedencia -> TestFuncion3");
		}
		
}
