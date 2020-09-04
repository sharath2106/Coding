package hackerrank;// Java program to find product
// of all existing.subarray of an array

public class subarray {

    // Function to find product of all subarrays
    static void product_subarrays(int arr[], int n)
    {
        // Variable to store the product
        int res = 1;

        // Compute the product while
        // traversing for subarrays
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product = product * arr[j];
                res *= product;
            }
        }

        // Printing product of all existing.subarray
        System.out.println(res + "\n");
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 10, 3, 7 };

        int n = arr.length;

        // Function call
        product_subarrays(arr, n);
    }
}

// This code is contributed by AbhiThakur
