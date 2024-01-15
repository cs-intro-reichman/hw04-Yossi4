public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = {-202, 48, 13 , 7, 8};
        System.out.println( secondMaxValue(array1));





        
    }
    public static int sumTilln (int n){ //computes the sum from 0 to a given number
        int sum = 0;
        for (int i = 1;i < n ;i++ ) {
            sum += i;
            
        }
        return sum;
    }
    
    public static int findMissingInt (int [] array) {// done
        int missingInteger = 0;
        int sum = 0;
        for (int i = 0;i < array.length  ;i++ ) {//0<x<n
            sum += array[i];
        }

        missingInteger = sumTilln(array.length+1) - sum;
        return missingInteger;
    }

    public static int MaxValueOfArray(int [] array) {
        int max = array[0];
        for (int i = 1;i < array.length ;i++ ) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int secondMaxValue(int [] array) {//done
        int firstMax = MaxValueOfArray(array);
        if (numberOfAppearances(array, firstMax) > 1) {
            return firstMax;
        }
        else{


        int secondMax = 0;
        for (int i = 0; i < array.length ; i++ ) {
            if (array[i] != firstMax) {
                if (array[i] > secondMax) {
                    secondMax = array[i];
                    
                }

                
            }
            
        }
        return secondMax;
    }
    }
    public static boolean elementInArray(int [] array, int x) {//checks if a given x is in a given array
        boolean flag = false;
        for (int i = 0; i < array.length && !flag ;i++ ) {
            if (array[i] == x) {
                flag = true;
                
            }
            
        }
        return flag;
    }
    public static int numberOfAppearances (int [] array, int x){
        int counter = 0;
        for (int i = 0 ;i < array.length ;i++ ) {
            if (array[i] == x) {
                counter++;
            }
        }
        return counter;
    }





    public static boolean containsTheSameElements(int [] array1,int [] array2) {//done
        boolean flag = true;
        for (int i = 0;i < array1.length && flag ;i++ ) {
            if (!elementInArray(array2,array1[i])) {
                flag = false;    
            }            
        }
        return flag;
    }

    







    public static boolean isSorted(int [] array) {////////done
        int current = array[0];
        int next = array[1];
        boolean flag = true;

        if (next >= current) {//potentialy increasing
            

            for (int i = 0;i < array.length-1 && flag ;i++ ) {
                current = array[i];
                next = array[i+1];
                if (next < current) {
                    flag = false;
  
                }    
            }
            
        }
        else{//potentialy decreasing

                for (int i = 0;i < array.length-1 && flag ;i++ ) {
                current = array[i];
                next = array[i+1];
                if (next > current) {
                    flag = false;
                }    
            }


        }
        return flag;
    }

}





















