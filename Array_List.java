import java.util.*;
//importing util package

class Array_List{
    static void arraylist()
    {
        int[] array = new int[10];         
        // initialize arrays with size n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int l = 0; l < 10; l++)
        {
            int n = sc.nextInt();
            // prompt user for number of elements

            array[l] = n;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int l = 0; l < 10; l++){
            list.add(array[l]);
        }
        System.out.println(list);
        //printing the list
        sc.close();
    }
}
