package p1_loops;

public class P1_Loops {

    public static void main(String[] args) {
        /*
            
        One of the most basic problems in coding is repeating a task a set amount of times.
        To solve this problem easily, we use loops.
        There are different kinds of loops.
        The first, and most basic is the for loop.
        Example:        
        
        */
        
        for (int i = 0; i < 10; i++) {
            System.out.println("HI" + i);
        }
        
        /*
        
        This is a basic for loop.
        It initializes an 'i' variable to zero. Then it checks if 'i' is less then 10.
        If 'i' is less then ten, it executes all commands in the braces.
        In this example, it will write out 10 times. Notice, as it starts at 0, it will write it out till 9.
        This will be important later on.
        
        */
        
        /*
        
        The other important loop I want to talk about, is the do-while loop.
        It is a post-test loop, meaning it will execute all command between the braces.
        Then it will check if the conditions are still met.
        It is important to initialize a variable before the loop.
        Example:
      
        */
        
        int j = 0;
        do{
            System.out.println("HI" + j);
            j++;
        }while (j < 10);
        
        /*
        
        These are the two most basic loops.
        The rest of the loops you will probably use will be modifications of these loops.
        The other two most used loops are for-each loops and infinite loops.
        Infinite loops are not common in the beginning, because -as it is in the name- they won't stop.
        Later on however, they will be used.
        For-each loops are a bit more common. They are mostly used, when a specific object needs iteration in an array.
        I will explain these later.
        The most basic infinite loop:
        
        */
        do{
            System.out.println("This will run infinitely, unless there is a specific exit command");
            break;
        }while(true);
        
        /*
        
        As you can see in the example, the easiest way to exit an infinite loop, is to use the 'break' command.
        
        */
        
    }
    
}
