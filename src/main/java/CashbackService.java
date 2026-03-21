/*
The following service calculates how much of a payout a customer get when investing and
possibly enlisting a new member to FreeMoneyNoScam™️
 */

public class CashbackService {
    public int calculateCashback(Order order) {
            int cashback = 0;
            int numberOfItems = order.getItems().size();

            // item bonus
            if (numberOfItems >= 5) {
                cashback += 200;
            } else if (numberOfItems >= 3) {
                cashback += 100;
            }

            // VIP bonus
            if (order.getMembershipType().equalsIgnoreCase("VIP")) {
                cashback += 300;
            }
            return cashback;
    }

}



/*
A) In pairs — test case design

Discuss the following questions:

    What are the cases in the method?
        Item and VIP bonus

    What are the edge cases?
        Rare and unexpected scenarios

    Which parts of the Order object affect the result?
        Item and membership

    How many tests are needed to cover the logic?
        Three tests, orderOfItems = 2, 4, 6
        Two tests, membership = VIP and not

        So five tests in all

B) Write unit tests

    Write 2 unit tests that test:

    2 different scenarios

In each test:

    Create an ArrayList

    Add items to it

    Create an Order

    Call calculateCashback


 */
