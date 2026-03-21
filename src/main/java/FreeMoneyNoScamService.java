
/*    Exercise 1
    The following service calculates how much of a payout a customer get when investing and possibly enlisting a new member to FreeMoneyNoScam™️
    The service that you should test looks like this:
*/

    public class FreeMoneyNoScamService {

        public int calculatePayout(int investment,
                                   int referralCount,
                                   String membershipType) {

            int payout = investment;

            // referral bonus
            if (referralCount >= 3) {
                payout += 200;
            }

            // membership bonus
            if (membershipType.equalsIgnoreCase("VIP")) {
                payout += 500;
            }

            return payout;
        }
    }

/*   A) In pairs - test case design

    What are the cases in the method?
        Referral and membership

    What are the edge cases?
        Rare and unexpected scenarios

    How could this be covered?
        By running through different scenarios

    B) Write unit tests

    Write 3 unit tests that test:
        2 different successful scenarios
        An edge case
            Made in Test

    Identify: What is the biggest risk in this method?
        invest negative, and still get the test right
    How could it be fixed?
        use an if statement
 */

