import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class ArrayShift {
    static int n;
    static int[] a;
    static int k;
    public static void main(String[] args) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the test case: ");
        int t = Integer.parseInt(br.readLine());
        System.out.print("Thanks. Now please enter the number of elements in the array and the steps of rotation: ");
        String[] inputLine1 = br.readLine().split("\\s");
        // So, as I understand it, if you need to take multiple values from one line and then assign them to differing variables,
        // then you need to have something that recognises the split as whitespace
        if(inputLine1.length >= 2) {
            n = Integer.parseInt(inputLine1[0]); // the amount in the array
            k = Integer.parseInt(inputLine1[1]); // the transformation amount
            a = new int[n];
        } else {
            System.out.println("Input is too short, or you didn't put a space between the input.");
            throw new Exception("Incorrect output, please try again.");
        }
        System.out.println("Thanks. Now tell me the values of the array, in accordance with the length that you described: ");
        String[] inputLine2 = br.readLine().split("\\s");
        if (inputLine2.length >= n) {
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(inputLine2[i]);

            }System.out.println(Arrays.toString(a));
        }
    }
}
