package were;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,5,6};
         System.out.println(findMissing(array,7));
    }

    public static int findMissing(int[] array, int n) {
        int total = 0;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum +=i;
        }


        for (int i = 0; i<array.length; i++) {
            total +=i;

        }
        return (sum - total);
    }
}
