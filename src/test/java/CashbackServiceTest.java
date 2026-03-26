import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCashback_noBonus_one() {
        //Arrange
        CashbackService service = new CashbackService();
        //Act
        String result = service.calculateCashback("Apple");
        //Assert
        assertEquals(400, result);



    }
}