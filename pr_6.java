//ID : 21CE056
//Name : Heppil Kheni
//Aim : what you element remove in string and print the remaing string.

import java.util.*;
public class pr_6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int a = sc.nextInt();

        String[] b = new String[a];

        System.out.println("Enter array : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }
        System.out.println("Enter string you want to remove");
        String c = sc.next();
        removestr(b, c);
        sc.close();
    }

    static void removestr(String x[],String y)
    {   int count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {
                count++;
            }
        }
        String[] d=new String[x.length-count];
        int j=0;
        for(int i=0;i<x.length;i++){
            if(!x[i].equals(y))
            {
                d[j]=x[i];
                j++;
            }
        }
        System.out.println("New Array is :");
        for(String newstr:d)
        {
            System.out.print(newstr);
        }
        System.out.println();
    }
}
