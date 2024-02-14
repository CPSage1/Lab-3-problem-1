public class NewClass{

    public static int getLargest(int arr[], int sz){
        //The three integers
        int iterate1= 0;
        int iterate2= 0;
        int largest= 0;

        //Both inner and outer loops
        while (iterate1 < sz - 1){
            iterate2++;
            if (iterate2 == sz){
                iterate1++;
                iterate2 = iterate1;
                continue;
            }
            int product = arr [iterate1] * arr[iterate2];
            if (product > largest )
                largest = product;
        }
        return largest;
    }
}

// There are 3 integers(iterate1, iterate2, and largest).The outer loop runs when iterate1
// is less than sz-1 while the inner loop, iterate2, is directly affected by iterate1's amount
// of increments.