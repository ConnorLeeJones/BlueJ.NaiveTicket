# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.

### Exercise 2.1
* Create a TicketMachine object on the object bench.
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
* Use `getBalance` to check that the machine has a record of the amount inserted.
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?


------> Zero



### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior?
	* What happens if you insert too much money into the machine – do you receive any refund?

------> No

	* What happens if you do not insert enough and then try to print a ticket?

------> It still prints



### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
	* Does the printed ticket look different?

------> Yes, printed new value on ticket


### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.

------> public class Student
------> public class LabClass



### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?


------>  Yes

* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
	* Do you notice a change in the class diagram?
------> Yes, Red X's
	* What error message do you get when you now press the compile button?
------> <identifier> expected
	* Do you think this message clearly explains what is wrong?
------> Not really

### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.

------> It is possible

### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.

------> Fields: Price, Balance, Total
------> Methods: GetPrice(); getBalance(); insertMoney(); printTicket()
------> Constructor: TicketCost()




### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class?

------> Takes a parameter (ticketCost) and sets value.

### Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count;
------> integer
private Student representative;
------> string
private Server host;
------> String
```

### Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive;
------>  alive
private Person tutor;
------> tutor
private Game game;
------> game
```
### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in?

------>  yes

* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible?

------> Yes, red X’s again
------> Private CAN be removed, unsure how this would affect it. (Default? Public/private?)


	* Check by pressing the compile button to see if there is an error message.
	* Make sure that you reinstantiate the original version after your experiments!

### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration?
------> Yes

* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.


### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.

### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
------>  Student
```

### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)
```
------> Two, String and double


### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?

------> Title, price, publication date, publisher, author

* Can you assume anything about the names of its fields?

Work all Exercises from 2.19 to 2.58 that are **NOT** marked *Challenge exercise*.
READ upto and INCLUDING section 2.15 of this chapter.



### Exercise 2.19
------>  public Pet(String petsName)
  {
	name = petsName;					
... }




### Exercise 2.20
------>   public TicketMachine(int ticketCost)
  {

						
     int price = ticketCost;
      balance = 0;
      total = 0;

		
------> Accessor methods
	Methods have header and body
	Method signature




### Exercise 2.21
------> Price returns price entered, balance returns total balance entered




### Exercise 2.22
------> How much money has been inserted in ticketmachine?



### Exercise 2.23
------> Nope



### Exercise 2.24
------> Public int getTotal() 
{
Return total;
} 


### Exercise 2.25
------> Missing return statement



### Exercise 2.26
------> Getprice just returns price, print ticket displays price in different format and, updates total and balance, and doesn’t return anything (void)




### Exercise 2.27
------> No
	Void




### Exercise 2.29
------> Takes parameter?
Void?
“The word void in the setPrice() method proves that it it is a mutator method, and therefore it’s possible to know that it only alters the fields, but doesn’t create them.”
						
public void setPrice(int ticketCost)




### Exercise 2.30
------> value of its parameter to the price field.

public void setPrice(int ticketCost){
	price = ticketCost;
}


### Exercise 2.31
------>  public void increase(int points)
  {
	Score += points;
						
... }





### Exercise 2.32
------>

 public void discount(int amount)
  {
	Price -= amount;
						
... } 




### Exercise 2.35
------> Different, because it shows the value of the price variable

### Exercise 2.36
------>. #pricecents




### Exercise 2.37
------>  # price cents




### Exercise 2.38
------> No, these are just printing strings and will not print any values of any variables (parameters) because they are surrounded by quotation marks
					





### Exercise 2.39
------> You are no longer able to set the ticket price yourself, it is always set to 1000 cents no matter what




### Exercise 2.40
------>  No it does not need any parameters. It's a Mutator




### Exercise 2.41
------> Yes it is a mutator




### Exercise 2.44
------> Entering ‘0’ no longer triggers the use a positive amount result




### Exercise 2.45
------> Visibility. Yes, True/False options work quite well when only two different values are possible



### Exercise 2.46
------> No longer have to set balance to zero, as we are account for more possibilities depending on how much money in it 	




### Exercise 2.47
------> No, the insert money will not allow one to enter an amount that is less than zero.



### Exercise 2.48
------>  *  / and %


### Exercise 2.49
------> public Savings() {
int saving = price*discount;
}




### Exercise 2.50
------> Public Mean() {
int mean = total / count;
}




### Exercise 2.51
------> 
Public Compare(){
	If (price > budget){
	System.out.println(“too expensive”)
} else {
	System.out.println(“just right”)



### Exercise 2.52
------>
If (price > budget){
	System.out.println(“too expensive, budget = ” + budget)
} else {
	System.out.println(“just right”)



### Exercise 2.53
------> It returns after setting to 0, so it will always return 0. Can test by inserting money then getting balance



### Exercise 2.54
------> Will not compile. Return statement must be at the bottom



### Exercise 2.56
------> Both
