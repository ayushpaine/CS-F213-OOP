A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle. Stack has one end. Whenever an element is added in the stack, it is added on the top of the stack, and the element can be deleted only from the stack. In other words, a stack can be defined as a container in which insertion and deletion can be done from the one end known as the top of the stack.  When we insert an element in a stack then the operation is known as a push. If the stack is full then the overflow condition occurs. When we delete an element from the stack, the operation is known as a pop. A view operation will let us see the top element without removal.

We will use an integer array to create a basic stack.

Interface **StackLab9** with three abstract methods is as below. (type this code between lines, above and outside your Class in solution) 

______________________________________________________________________________
interface StackLab9{
public void push(int val);
public  int pop();
public int view();
}
___________________________________________________________________


Give code for a class FixedStack which implements the above interface. FixedStack class is used to implement a fixed-size stack i.e. a fixed maximum number of elements that can be stored in the stack. 

Class **FixedStack**

Data Members :
- private int arr[]  // to store stack elements in an array
- private int top   // pointer pointing to the top most element of stack
- private boolean ok;

Methods : 
- public FixedStack(int ArraySize) : Constructor to initialises top to -1 and instantiate arr with a new array of length ArraySize.
- public void push(int val) : Method to add element to the stack. This method sets ok to false  if stack is full, otherwise adds element to arr and sets ok to true. 
- public int pop() : Method to remove and return element from the top of the stack. This method sets ok to false and returns -1 if stack is empty, otherwise sets ok to true and removes and returns the element at the top of the stack.
- public int view() : Method to view element present at top of stack. This method sets ok to false and returns -1 if stack is empty,  otherwise sets ok to true and returns the element at the top of the stack.
- public boolean returnOk() : returns the value of ok
