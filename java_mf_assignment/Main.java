/*
Program to implement Queue 
Ashraf Besada
*/  

// Import scanner to read input
import java.util.Scanner;
import static java.lang.Boolean.TRUE;
import static java.lang.System.exit;

public class Main {

    // Declare and initialize variables
    static int N;
    static int start = -1;
    static int end = -1;

    
    // Enqueue an item to the queue 
    static void push(int element, int[] QUEUE)
    {
        end++;
        
        // if queue is full, show error message
        if(end == N)
        {
            System.out.println("Sorry. Currently the queue is full. Please try again later when atleast one dequeue is performed. ");
            end--;
        }
        
        // if stack is empty, add element at the end
        else
        {
            start = 0;
            QUEUE[end] = element;
        }
    }

    // Dequeue an item from the queue
    static int pop(int[] QUEUE)
    {
        int element;
        
        // if queue is empty, show error message 
        if(start == -1||start > end)
        {
            System.out.println("Sorry. Currently the queue is empty. Please try again later when atleast one enqueue is performed.");
            return -1;
        }
        
        // if stack is not empty, remove first element 
        else
        {
            element = QUEUE[start];
            QUEUE[start] = 0;
            start++;
            return element;
        }
    }
    public static void main(String[] args) {
	System.out.println("--- Linear Queue Implementation ---");
	
    // Declare the object and initialize with 
    // predefined standard input object 
	Scanner scan = new Scanner(System.in);
    int id, element;
    System.out.println("Enter Length of Queue");
    N = scan.nextInt();
    int[] QUEUE = new int[N];
    while(TRUE)
    {
    
        // Show a list of options 
        System.out.println("Press \n 1. To Push element into the Queue \n 2. To Pop an element out of Queue \n 3. To View the Queue \n 4. Exit from the Program ");
        System.out.println("Enter your choice");
        id = scan.nextInt();
            switch (id)
            {
                // Push item into the queue
                case 1:
                    System.out.println("Enter a number");
                    element = scan.nextInt();
                    push(element, QUEUE);
                    break;
               
                // Pop item from the queue   
                case 2:
                    System.out.println("Removed Element is:  "+pop(QUEUE));
                    break;
                
                // Show elements in the queue
                case 3:
                    System.out.println("Elements in Queue are:");
                    for(int i = 0; i< QUEUE.length;i++)
                        System.out.print(QUEUE[i]+ " ");
                    System.out.println();
                    break;
                
                // Display an error message if selection is out of the scope               
                case 4:
                    exit(0);
                default: System.out.println("Invalid Option");
            }
        }
    }
}