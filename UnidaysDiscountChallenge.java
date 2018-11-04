import java.util.*;
/**
 * This is the UniDaysDiscountChallenege Class where all of the functionality will be coded
 *
 * @author Ali Alizadeh
 * @version 02 Nov 2018
 * 
 */
public class UnidaysDiscountChallenge
{
    // instance variables
    private String product;
    private int amount;
    private double totalPrice;
    private double deliveryCharge;
    private double overallTotal;

    ArrayList<String> productList=new ArrayList<String>();

    /**
     * Constructor for objects of class UniDaysDiscountChallenge
     */
    public UnidaysDiscountChallenge()
    {
        // This screen will be loaded upon the customer creating this class. It will give them an idea of all the products avalbile, their price along with the deals avalible.
        System.out.println("Products's:     Price:      Deals: ");
        System.out.println("\nA               £8.00       ---------");
        System.out.println("B               £12.00      2 FOR £20.00");
        System.out.println("C               £4.00       3 FOR £10.00");
        System.out.println("D               £7.00       BUY ONE GET ONE FREE");
        System.out.println("E               £5.00       3 FOR THE PRICE OF TWO\n");
    }

     /**
     * A method that enables the customer to add their desired product into the ArrayList.They have to give the String Product stating which one they require when this method is called.
     * Simply enter the String of the product you want E.g if you want A then type -  "A" into the textfield
     */
    public void AddToBasket(String Product)
    {
        // adding the Product into the Product ArrayList
        productList.add(Product);
        // Printing a message to the user once they have successfully added that item to their basket
        System.out.println("Product ("+ Product + ") has been added to your basket!");
    }
    
    public void CalculateTotalPrice()
    {   
        // local int varaibles to store the quantities of each product stored within the ArrayList
        int quantityA = 0;
        int quantityB = 0;
        int quantityC = 0;
        int quantityD = 0;
        int quantityE = 0;
        // A for loop to get all the Strings within the productList ArrayList.
        for(String str:productList)
        {
            // if the str (string) is equal to "A" or "a" (to prevent errors from occuring):
            if(str == "A" || str == "a") 
            {
                // then it will increament quantityA by one.
                quantityA++;
            }  else if(str == "B" || str == "b") {
                quantityB++;
            } else if(str == "C" || str == "c") {
                quantityC++;
            } else if(str == "D" || str == "d") {
                quantityD++;
            } else if(str == "E" || str == "e") {
                quantityE++;
            } else {
                //no other products
            } 
        }

        System.out.println("\nYour basket: ");
        // if quanityA is not (!) empty:
        if (quantityA != 0)
        {
            // then the total price will be quantityA * 8.00 (price of item A)
            totalPrice += quantityA * 8.00;
            // then it will print out the amount of times the customer has bought product A
            System.out.println(quantityA + " A's");
            //System.out.println(totalPrice);
        }

        // if quantityB is not (!) empty:
        if (quantityB != 0)
        {
            // then if quantityB is module 2:
            //without offer
            if (quantityB % 2 == 1)
            {
                // the totalPrice will be quantityB - 1 then / 2 x 20.00 + 12.00
                totalPrice += (((quantityB-1)/2)*20.00) + 12.00;
            }
            else
            {
                // else the total price will be quantityB / 2 *20.00
                // with offer
                totalPrice += ((quantityB/2)*20.00);
            }
            // then it will print out the amount of times the customer has bought product B
            System.out.println(quantityB + " B's");
            //System.out.println(totalPrice);
        }

        if (quantityC != 0){
            if (quantityC % 3 == 1){
                totalPrice += (((quantityC-1)/3)*10.00) + 4.00;
            }
            else if (quantityC % 3 == 2){
                totalPrice += (((quantityC-2)/3)*10.00) + (4.00*2);
            }
            else {
                totalPrice += ((quantityC/3)*10.00);
            }
            System.out.println(quantityC + " C's");
            //System.out.println(totalPrice);
        } 

        if(quantityD != 0) {
            if (quantityD % 2 == 1){
                totalPrice += (((quantityD-1)/2)*7.00) + 7.00;
            }
            else
            {
                totalPrice += ((quantityD/2)*7.00);
            }
            System.out.println(quantityD + " D's");
            //System.out.println(totalPrice);
        } 

        if(quantityE != 0) {
            if (quantityE % 3 == 0){
                totalPrice += ((quantityE/3)*10.00);
            }
            else if (quantityE % 3 == 1)
            {
                totalPrice += (((quantityE-1)/3)*10.00 + 5.00);
            }
            else
            {
                totalPrice += (((quantityE-2)/3)*10.00 + 10.00);
            }
            System.out.println(quantityE + " E's");
            //System.out.println(totalPrice);
        } 
        
        // A check to see if the arrayList is empty or not
        if (productList.isEmpty()){
            // if it is empty then it will display an error message to the customer
            System.out.println("\nYour basket is empty!");
            // it will also set the totalPrice to 0;
            totalPrice = 0;
        }

        // To check if the customer will get free delivery or not
        // so if their totalPrice is less than 50 but greater then 0
        if (totalPrice < 50 && totalPrice > 0)
        {
            // if so then they will get charged £7.00
            deliveryCharge = 7.00;
        }
        else {
            // else if it is greater or equal to 50 they will get free delivery
            deliveryCharge = 0.00;
        }
        
        // Calculating the overall total which is simply the totalPrice + deliveryCharge
        overallTotal = totalPrice + deliveryCharge;

        // try to add 2dp instead of 1dp
        //overallTotal = overallTotal*100;
        //overallTotal = Math.round(overallTotal);
        //overallTotal = overallTotal/100;
        System.out.println("\nYour total: £"+ totalPrice + "0");
        System.out.println("Your delivery costs: £"+ deliveryCharge + "0");
        System.out.println(" ------------------------- ");
        System.out.println("Your overall total is: £"+ overallTotal + "0\n");
    }
    
    // A method i created for my self to see what products are in the arrayList
    public void printList()
    {
        for(String str:productList)
        {
            System.out.println(str);  
        }
    }

    // A method i created to just get the overallTotal of the basket.
    public void printTotal()
    {
        System.out.println("\nYour overall total is: £"+ overallTotal +"0 \n");
    }

}
