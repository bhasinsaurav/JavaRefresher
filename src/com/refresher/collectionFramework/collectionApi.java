package com.refresher.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class collectionApi {
    /*
    *Collections class has a sort method which is used for sorting
    * Comparator inteface is used  in which it has the compare method where we can apply our method to sort by passing two values
    * We just need to apply comparator and .sort method will do everything , we just need to pass the comparator object as a parameter
    *  Integer class implemets comparable so it wokrs well with .sort without any comparator object
    * but if we create our custom class , either we need to implement comparable to make it work with .sort or we need to pass  comparator object as a parameter in .sort method
    * foreach is used to get the data from the collection , It uses the object of Consumer interface to get the data.
    */
    public static void main(String[] args) {

        Collection nums = new ArrayList();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.forEach(n -> System.out.println(n)); // use to get all the valuue . In the brancket it is using lambda expression
    }



}
