# UNiDAYS

PROJECT TITLE: UNiDAYSDiscountChallenge

PURPOSE OF PROJECT: To get a software eng position

VERSION or DATE: 02 / Nov / 2018

AUTHORS: Ali Alizadeh

BLUEJ DOWNLOAD LINK: https://www.bluej.org/download/release-notes.html

HOW TO START THIS PROJECT: Have BlueJ IDE downloaded. Once downloaded and opened go into the 'Project' tab and select 'Open Project'. Once the window has opened locate the folder you are currently storing my UNiDAYS folder in (probably Download) and then select Folder! 

USER INSTRUCTIONS: Once you have loaded the required files then simply either left click on the "Test" box and select "new Text()" 
or do a manual test by left clicking the UniDaysDiscountChallenge and selecting "new UniDaysDiscountChallenge()"

HOW I APPROCHED THE PROBLEM: I decided to use BlueJ due to the fact that I have been actively using it and gained good understanding ever since starting my Computing degree at University of Kent. At first, I created the main Class 'UnidaysDiscountChallenge' and then I created the two methods and called them 'AddToBasket' and 'CalculateTotalPrice'.

AddToBasker method: Although the interface required me to pass in an item I decided to create a String called Product and work internally. To do this I first imported the required library and created an ArrayList called 'productList' and then simply added each Product to that arrayList. This then gave me a list of user Inputs which I later used in my CalculatePrice method.

CalculateTotalPrice methold: Wihtin this method I decided to first create local integers that would hold the quantity of each product (A to E) and gave them a default value of 0 to start with. Then I created a for loop that simply got all the Strings within the productList array so in simple words collected all the data sorted in the list. Once the loop was set up I created a simple if statment to get the strings that contained just str == "A" but then edited it to include lowercase to reduce errors and make it more user friendly. Once the if and else statements did its job I would get an idea of how many products the customer wants so then I created a check to see if the quantity was not equal to 0 first to make sure the user wants that product. If it is not 0 then it will do the calculations to get the price and apply any discounts if required. Next it was time to work out the delivery charge so that was a simple if statement to check if the total price was lower than 50 and if so the value of the delivery charge would be 7.00 else if the total was 50 or more then the delivery charge would be 0.00. After this I then created new variable called 'overallTotal' that worked out the totalPrice along with delivery charge. 

Test Class: Upon creating a test class I simply looked at the interface given on the GitHub and changed a few things around to suit my program. For example, they added items to the basket by doing example.AddToBasket(itemOne); whereas i had to do Test10.AddToBasket("C");. Once I did my first test i quickly noticed an issue which was the fact that my total would come to 7.00 even when the customer didnt buy anything so therefore i went back and edited my CalculatePrice method and added a productList.isEmpty() if condition that checked if the arrayList is empty or not. If so it would display an error message and set the totalPRice variable to 0. Furthermore, I had to then go to the deliveryCharge if condition and change it so if the totalprice is lower than 50 but grater than 0 it would charhge the customer.
