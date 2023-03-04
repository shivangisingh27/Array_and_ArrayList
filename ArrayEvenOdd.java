

//importing scanner and i/o packages
import java.util.*;

public class ArrayEvenOdd 
{
    public static void main(String[] args) {
        
        System.out.println("1. Smallest distance between two numbers in an array");
        System.out.println("2. Array to ArrayList");
        System.out.println("3. Even and Odd numbers");
        System.out.println("Enter your choice: ");
        Scanner sc1 = new Scanner(System.in);
        int choice = sc1.nextInt();
        //storing the choice entered by the user
        //switch case to perform operations based on the input given by the user.
        //there are three case in which we choose and perform operations such as finding smallest distance ,converting array into arraylist and even odd.
        switch(choice)
        {
            case 1:
                Smallest_distance.smallest_distance();
                break;
            case 2:
                Array_List.arraylist();
                break;
            case 3:
                        // Create two arrays odd and even
                int[] odd = new int[10];
                int[] even = new int[10];

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter numbers to classify, enter 'end' to stop: ");
                while(true)
                {
                    String input = sc.nextLine();
                    if(input.equals("end"))
                    {
                        break;
                    }
                    else
                    {
                        int num = Integer.parseInt(input);
                        if(num%2 == 0)
                        {
                            for(int i=0; i<even.length; i++)
                            {
                                if(even[i] == 0)
                                {
                                    even[i] = num;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            for(int i=0; i<odd.length; i++)
                            {
                                if(odd[i] == 0)
                                {
                                    odd[i] = num;
                                    break;
                                }
                            }
                        }
                    }
                }
                sc.close();
                // Print the arrays
                System.out.println("Even numbers: ");
                for(int i=0; i<even.length; i++)
                {
                    if(even[i] != 0)
                    {
                        System.out.print(even[i]+" ");
                    }
                }
                System.out.println();
                System.out.println("Odd numbers: ");
                //printing the odd no
                for(int i=0; i<odd.length; i++)
                {
                    if(odd[i] != 0)
                    {
                        System.out.print(odd[i]+" ");
                    }
                }
                
            default:
                System.out.println("Invalid choice");
        }
        sc1.close();
    }    
}
