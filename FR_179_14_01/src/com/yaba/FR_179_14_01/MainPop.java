package com.yaba.FR_179_14_01;


// Java code to illustrate pop()
import java.util.*;

public class MainPop {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();

        // Use add() method to add elements
        STACK.push("premier");
        STACK.push("deuxième");
        STACK.push("troisième");
        STACK.push("quatrième");
        STACK.push("cinquième et dernier");

        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Removing elements using pop() method
        System.out.println("1er élément retiré (dernier empilé) : " +
                STACK.pop());
        System.out.println("élément suivant retiré (avant dernier) : " +
                STACK.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop peration "
                + STACK);
    }
}
