

public class Arrays {

     public static int LinearSearch(String sweets[] , String key){
        for(int i=0; i<sweets.length;i++){
            if(sweets[i] == key){
            return i;
            }
        }
        return -1;
    }
    public static int getSmallest(int numbers[]){
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            } 
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.println("The Largest in array is : " + largest);
        return smallest;
   }
    public static void reverse(int numbers[]){
    int first = 0, last = numbers.length -1;
    while (first < last){
        int temp = numbers[first];
        numbers[first] = numbers[last];
        numbers[last] = temp;
        first++;
        last--;
    }
    for(int i=0;i<= numbers.length;i++){
        System.out.print(numbers[i] + " ");
       }
   } 
   public static void pairs(int numbers[]){
    for (int i =0;i<numbers.length;i++){
        int curr = numbers[i];
        for (int j=i+1; j<numbers.length;j++){
            System.out.print("(" + curr + "," + numbers[j] + ") ");
        }
        System.out.println();
    }
    System.out.println("The total no of pairs are : " + ((numbers.length )*(numbers.length -1))/2);
   }
   public static void main (String arg []){
       int numbers[] = {1,3,5,7,12,15};
       pairs(numbers);
    }
}