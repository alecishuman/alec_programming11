import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class BankTests {
    Customer testCustomer;

    @Before
    public void setUp() {
        testCustomer = new Customer("Alec", 1, 300, 500);
    }

    @Test
    public void testInsertNotThere() {
//        Check deposit
        assertEquals(testCustomer.deposit(10, new Date(), "Checking"), 310, 0.001);
//        Check Withdrawal
        assertEquals(testCustomer.withdraw(610, new Date(), "Saving"), -110, 0.001);
        assertTrue(testCustomer.checkOverdraft(-100, "Saving"));
    }
}
