package p4_methods;

public class P4_Methods {

    /*
        
        In this part, I will go talk about methods in Java.
        As Java is an object oriented programming language, methods are important.
        We used methods before. If you go back to the Array part, you can see we used the add, get, set, remove etc. methods.
        Those methods are part of the Array class. I will talk about classes in the next part.
        For a simple demonstration, I will only talk about methods and how they work in this part.
        For further information about classes, check out part 5.
        
        Let's jump into it!
        
    */
    
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(add(a,b));
        
    }
    
    /*
    
    Methods are initialized outside the "main" part, but inside the class.
    As you can see, the basic setup of this automatically generated code, it contains the following:
    a package,
    a class,
    and the main method.
    This is the most important part for us. Let's tear it down to it's core parts word by word.
    
        public static void part main(String [] args)
    
    The first word: public.
    This indicates the visibility of the given method. It can be 1 of 4 given words. Based on those, it indicates the permitted access:
    
    Modifier    Class   Package Subclass    World
    public      Y       Y       Y           Y
    protected   Y       Y       Y           N
    no modifier Y       Y       N           N
    private     Y       N       N           N
    
    As you can see, the main method can be accessed from anywhere. These modifiers will be important later on, while discussing classes.
    I will talk about packages and subclasses in later parts as well.
    
    The second word is "static"
    It means that the variable, or in this case method is associated with the whole class, rather than an object.
    I will explain this in more detail in the class part.
    
    The third word is "void"
    It indicates what the method will return once called.
    Void methods for example, will return nothing.
    The example below indicates, that it will return an integer value.
    
    The fourth word is "main". It is the name of the method.
    Two methods can be named the same, as long as they require different inputs.
    The required inputs are given after the name, between the "()".
    The method main in this case requires a String [], which will be used as "args".
    The name of the variables given between the brackets will be the names of the variables while used inside the methods.
    When called, they do not need to match. As you can see add is called with variable a and b.
    When the method is initialized, the variables n and m are used down below.
    
    There is one more important part to methods, which is the return statement.
    Every method that is not void, (which means it returns something) needs to have a return statement.
    It also needs to return a type of variable that is requested when the method is defined.
    
    */
    
    public static int add(int n, int m){
        
        return n+m;
    }
}
