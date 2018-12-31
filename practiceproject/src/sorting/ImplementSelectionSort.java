package sorting;

public class ImplementSelectionSort {

    public class SelectSortDemo {
        public int[] doSelectionSort(int[] arr){

            for (int i = 0; i < arr.length - 1; i++)
            {
                int index = i;
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[j] < arr[index])
                        index = j;

                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
            return arr;
        }

        public  void main(String a[]){

            int[] arr1 = {9,7,8,6,4,1,5};
            int[] arr2 = doSelectionSort(arr1);
            for(int i:arr2){
                System.out.print(i);
                System.out.print(", ");
            }
        }
    }
}
