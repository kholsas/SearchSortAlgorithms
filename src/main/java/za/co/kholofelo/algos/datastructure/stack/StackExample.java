package za.co.kholofelo.algos.datastructure.stack;

import java.util.Stack;

public class StackExample
{
  public static void main(String[] args)
  {
    Stack<String> stack = new Stack<>();
    System.out.println(stack.empty());
    stack.push("Eat");
    stack.push("Sit");
    stack.push("Drink");
    stack.push("See");
    stack.push("Live");

    System.out.println(stack.empty());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.search("Sit"));
  }
}
