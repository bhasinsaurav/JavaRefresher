package com.refresher.condStatements;

public class Operators {

    // There are 2 kinds of operators relational operators and logical operators
    //Relational Operators
    //They return a boolean results
    // They are
    /**
     * Less than (<)
     * Greater Than (>)
     * Less Than equal To (<=)
     * Greater Than equal to (>=)
     * Equal to Equal to (==)
     * Not Equal to (!=)
     */
    //Logical Operators
    // There are 3 kinds of logical operators in java
    //1. Logical And (&&)
    //2. Logical Or (||)
    //3. Not (!)

    // Conditional Statements
    // If , Else and Else-If, Switch Statements and Ternary Operators

    //Loops are of 4 kinds
    // For Loops , Enchanced for loop(for-each-loop) , While loop , do-while loop
    public static void main(String[] args) {
        System.out.println("5<3=" + (5 < 3));

        System.out.println(1 != 2 && 1 < 2);  // true && true = true

        //Switch Case
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Sunday";
        }

        System.out.println(dayName);


        // Ternary Statement
        //result = (condition) ? valueIfTrue : valueIfFalse;

        int a = 1;

        String isEven = a % 2 == 0 ? "Even" : "Odd";
        System.out.println(isEven);

        //loops
        for(int i=0; i<10 ; i++){
            System.out.println(++i);
        }
    }

}
