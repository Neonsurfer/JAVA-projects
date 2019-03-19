package p2_variables;

public class P2_Variables {

    public static void main(String[] args) {

        /*
        
        The most basic element of programming are variables.
        They are the core of every command.
        Variables have different types, and values.
        
        Let's see what are the most basic variables.
        
        */
        
        int n = 0;
        Integer m = 1;
        String s = "Door";
        short sh = 5;
        char c = 'c';
        float f = 2.10f;
        boolean y = true;
        double x = 2.5;
                
        /*
        
        I could explain each of these, but to make it shorter, and easier to understand, I won't.
        For the most accurate explanations, visit the oracle JAVA documentation:
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        
        
        Variables are not restricted to these types however.
        Java is an object-based programming language, which means the code is divided up into classes and subclasses.
        For this reason, you can initialize variables as a variable of a class.
        As you can see, I created Human.java in this package.
        --I will explain classes and packages in a further lesson.
        
        Humans have height, weight, and age. (Yes we have other qualities, but for this example its enough)
        If we want to "create" a human, we need to give the same qualities in the same order.
                     
        */
        
        Human me = new Human (180,70,21);
        
        /*
        In this case kind of look at me and say I'm a variable.
        Well it would be kind of true, but you can easily modify n or m.
        I'm a bit difficult to modify.
        */
        n++;
        m++;
        
        me.age++;
        
        /*
        
        I just increased n and m by one.
        With the same logic, I increased my age by one.
        I will look more into classes in later tutorials.
        
        If you read the first tutorial (about loops), you might have noticed, that 'i' is also a variable.
        It is also initilaized, and also increased.
        (for simplicity, I will only talk about for loops)
                
        */
        for (int i = 0; i < 10; i++) {
            int tmp = 0;
            System.out.println(i);
        }
        
        /*
        If we only look at 'i', it is a variable.
        But it is a special variable in this case. Special in a way, that it only is accessible in the loop.
        If we try to refer to i outside the loop, we will get an error.
        It is the same for 'tmp'. (tmp is short for temporary)
        
        */
    }
    
}
