package day24Task;

public class FrequencyOfIntegger {
    /* 5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
*/
    public static void main(String[] args) {
        int[] Arr ={1,2,3,2,2,3,5};
        int num = 0;
        System.out.println(frequency(Arr,2));
        //System.out.println(frequency(int[] Arr, int 2));
    }
    public static int frequency(int[]Arr, int num){
    int frequency=0;
        for (int i = 0; i < Arr.length ; i++) {
            if(Arr[i]<0 || Arr[i]>Arr.length){
                System.exit(0);
            }
        }
        for (int j = 0; j < Arr.length; j++) {
            if(Arr[j]==num)
                frequency++;
        }
        return frequency;
    }


    }



