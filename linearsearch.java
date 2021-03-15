import java.util.Scanner;
public class linearsearch {
    public static void main(String[] agrs)
    {
        System.out.printf("enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("enter the elemnt of array: ");
        int [] array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.print("enter the item to be search: ");
        int item = sc.nextInt();

        Search sr = new Search();
        int result = sr.search(item, array);
        System.out.print("item found at: " +result);

        sc.close();
        
    }
}
