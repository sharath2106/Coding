package existing;

public class NearNumberInArray {


    public static int getNearestNumberFromTarget(int[] inputArray, int target){

        if(inputArray.length==0){
            System.out.println("Empty array is detected, terminating the process");
            System.exit(1);
        }

        int IndexNearestNumberToTarget = 0;
        int absoluteDistanceBetweenNumber = Math.abs(inputArray[IndexNearestNumberToTarget] - target);

        if(absoluteDistanceBetweenNumber == 0){
            return IndexNearestNumberToTarget;
        }

        for(int i=1;i< inputArray.length;i++){

            int deltaCurrentElement = Math.abs(inputArray[IndexNearestNumberToTarget] - target);

            if(deltaCurrentElement == 0){
                return i;
            }

            else if(deltaCurrentElement < absoluteDistanceBetweenNumber){
                IndexNearestNumberToTarget = i;
                absoluteDistanceBetweenNumber = deltaCurrentElement;
            }
        }


        return IndexNearestNumberToTarget;
    }


    public static void main(String[] args) {

        System.out.println("Getting the nearest Number to the target");

        int[] input = {74,5,2,9,6};
        System.out.println(input[getNearestNumberFromTarget(input,7)]);
    }
}
