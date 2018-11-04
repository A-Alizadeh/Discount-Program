/**
 * This is the Test Class where I wiill test the functionality with some test cases from UniDays
 *
 * @author Ali Alizadeh
 * @version 02 Nov 2018
 * 
 */
public class Test
{
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // Test for an empty basket
       UnidaysDiscountChallenge Test1 = new UnidaysDiscountChallenge(); 
        Test1.CalculateTotalPrice();
        
        // Test for three items of product C
        UnidaysDiscountChallenge Test10 = new UnidaysDiscountChallenge();
        Test10.AddToBasket("C");
        Test10.AddToBasket("C");
        Test10.AddToBasket("C");
        Test10.CalculateTotalPrice();
        
        // Test for ten items in a different order
        UnidaysDiscountChallenge Test20 = new UnidaysDiscountChallenge();
        Test20.AddToBasket("E");
        Test20.AddToBasket("D");
        Test20.AddToBasket("C");
        Test20.AddToBasket("B");
        Test20.AddToBasket("A");
        Test20.AddToBasket("E");
        Test20.AddToBasket("D");
        Test20.AddToBasket("C");
        Test20.AddToBasket("B");
        Test20.AddToBasket("C");
        Test20.CalculateTotalPrice();
    }
}
