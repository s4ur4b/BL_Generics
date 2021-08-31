import java.util.Scanner;

public class MaxNoTest {

    //returns the max value of three strings
    public static String findMax(String a, String b, String c) {
        String max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        return max;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String str1 = scan.next();
        System.out.println("Enter the second String : ");
        String str2 = scan.next();
        System.out.println("Enter the third String : ");
        String str3 = scan.next();

        String max = findMax(str1,str2,str3);
        System.out.printf("The max of three strings \"%s\" \"%s\" \"%s\" is : \"%s\" \n",str1,str2,str3,max);
    }
}
