import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreeMoneyNoScamServiceTest {

    @Test
    void calculatePayout_noBonus() {
        //Arrange
        FreeMoneyNoScamService service = new FreeMoneyNoScamService();
        //Act
        int result = service.calculatePayout(400, 2, "normal");
        //Assert
        assertEquals(400, result);
    }

    @Test
    void calculatePayout_withReferralBonus() {
        //Arrange
        FreeMoneyNoScamService service = new FreeMoneyNoScamService();
        //Act
        int result = service.calculatePayout(400, 3, "normal");
        //Assert
        assertEquals(600, result); // 400 + 200
    }

    @Test
    void calculatePayout_withVipBonus() {
        //Arrange
        FreeMoneyNoScamService service = new FreeMoneyNoScamService();
        //Act
        int result = service.calculatePayout(-400, 2, "VIP");
        //Assert
        assertEquals(100, result); // 400 + 500
    }
}