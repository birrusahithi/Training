package com.consultadd.exercise6;
/*
5. Suppose you have a Saving Box with an initial amount of $50 and you have to add some more to it. C
reate a class 'AddAmount' with a data member named 'amount' with an initial value of $50.
Now make two constructors of this class as follows:
        1 - without any parameter - no amount will be added to the Saving Box
        2 - having a parameter which is the amount that will be added to Saving Box
        Create an object of the 'AddAmount' class and display the final amount in the Saving Box. Also,
        create a method that can display how many transactions are done on the Saving Box.
*/
public class AddAmount {
    static int amount = 50;
    static int transactions=0;
    AddAmount(){
    }
    AddAmount(int money){
        this.amount +=money;
        transactions++;
    }
    public int getTransactions(){
        return this.transactions;
    }
    public static void main(String[] args){
        AddAmount obj1 = new AddAmount(20);
        AddAmount obj2 = new AddAmount(30);
        AddAmount obj3 = new AddAmount(55);
        System.out.println("Final Amount : " + amount);
        System.out.println("Transactions : "+ transactions);

    }

}
