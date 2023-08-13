import java.util.Arrays;

public class ArrayAssignment {

    public static int[] toPower(int size,int power){
        int [] tempArray = new int[size];
        int index = 0 ;
        for (int i=1;i<=size;i++){
            tempArray[index] =  (int) Math.pow(index,power);
            index =i;
        }
        return  tempArray;
    }
    public static void main(String[] args) {

        //Part 1
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

            }

        }

        System.out.println(index);

        //Part 2
        System.out.println("An array of size 4 containing elements raised to the power of 2 of their index:"+ Arrays.toString(toPower(4,2)));


    }
}
