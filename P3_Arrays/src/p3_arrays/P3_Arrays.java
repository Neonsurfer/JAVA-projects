package p3_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class P3_Arrays {

    public static void main(String[] args) {
        
        /*
        
        Let's say we want to store 10 integers.
        We could define 10 variables, but that would not be efficient, or easy.
        For this reason, we use arrays.
        
        Lets initialize 2 arrays for ints to show the 2 ways to do it
        */
        
        int [] array1 = {0,1,2,3,4,5};
        int [] array2 = new int [10];
        
        
        /*
        
        The first array is initialized, meaning it is declared, and values are assigned to each of its "slots".
        The second array is only defined, because all of it's "slots" contain null values.
        
        The type of arrays will be what they are defined to be.
        Since the first array only contains ints, it cannot contain any other types.
        This is true for all arrays. They can only contain one type of data.
        
        And here we run into the biggest problem with basic arrays.
        Their size is fixed.
        array1's length is 6, array2's length is 10 (indexed 0-9).
        
        The problem arises, if we want to store another set of numbers, in the same array.
        To solve that, we would have to create another array.
        Then we want to store another set of numbers, and so on and so on.
        
        For this problem, the solution is not to use an array, but to use a List.
        As an example, I will use an arrayList.
        
        ArrayLists are stored in a specific java package, which we need to import.
        The import line always goes after the package line. I will explain what these lines mean in a later part.
        Lets define some.
        
        */
        
        ArrayList first = new ArrayList<>();
        ArrayList <String> second = new ArrayList<>();
        
        /*
        
        The first ArrayList is defined as a basic array. It has no given type.
        The second ArrayList is defined as a String array. It can only contain Strings.
        Lets use some basic commands for the Arrays.
        
        */
        
        first.add(5);
        second.add("apple");
        
        /*
        
        By using the add method, we can add items to the arrays.
        When we add 5 to the first array, we give it a type.
        We already gave the second array a type.
        As this is an array as well, it can only store items of a given type.
        But these arrays are resizable. Meaning we can add as many items we want to.
        Let's add 100 items to the first list.
        
        */
        
        for(int i=0;i<100;i++){
            first.add(i);
        }
        
        /*
        
        The fist array now contains 101 items.
        Let's get the 50th item. We can get it with the get method.
        
        */
        
        System.out.println(first.get(50));
        
        /*
        
        As you can see it is 49. 
        We can also change any item at any time we want.
        
        */
        
        first.set(4, 1001);
        
        /*
        
        The 4th item in the first array is now set to 1001.
        Let's check if it is.
        
        */
        
        System.out.println(first.get(4));

        /*
        
        If you run the program, you will see that the 4th item in the array is 1001.
        We can also remove items from an array. For this, we use the remove() method
        
        */
        
        first.remove(4);
        
        /*
        
        Now let's check out the first 10 numbers.
        
        */

        for(int i=0;i<10;i++){
            System.out.print(first.get(i) + " ");
        }
        System.out.println("");
        
        /*
        
        If we fully want to clear out an array, we can also do that as well.
        Well, we could use a loop and delete every item one by one, but there is a simpler way, which is using the clear() method.
        
        */
        
        first.clear();
        
        first.add(100);

        /*
        
        Now the first array will only count one item, which is 100.
        We can check this by using a loop to get all items and write them out.
        
        */
        
        System.out.println("All items in the first array:");
        
        for(int i=0;i<first.size();i++){
            System.out.println(first.get(i) + " ");
        }
        
        /*
        
        As you can see, I used the size() method to get the size of the first array, and iterate through it.
        This is the end of the Array part. I will use these methods in later parts.
        
        */
    }
    
}
