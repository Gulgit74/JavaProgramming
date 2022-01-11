package day15_ForLoop.day25_CustomMethods_Overloading;

public class MaxAndMinNum {
    public static int max(int[] array){
        int max = array[0];
        for (int each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }


    public static double max(double[] array){
        double max = array[0];
        for (double each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }


    public static long max(long[] array){
        long max = array[0];
        for (long each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }


    public static short max(short[] array){
        short max = array[0];
        for (short each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }


    public static float max(float[] array){
        float max = array[0];
        for (float each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }


    public static byte max(byte[] array){
        byte max = array[0];
        for (byte each : array) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }




/*
Task 2:
	1. create a method that can return the max number from an integer array
	2. create a method that can return the max number from double array
	3. create a method that can return the max number from long array
	4. create a method that can return the max number from short array
	5. create a method that can return the max number from float array
	6. create a method that can return the max number from byte array
 */

    public static int min(int[] array){
        int min = array[0];
        for (int each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    public static double min(double[] array){
        double min = array[0];
        for (double each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    public static long min(long[] array){
        long min = array[0];
        for (long each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    public static short min(short[] array){
        short min = array[0];
        for (short each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    public static float min(float[] array){
        float min = array[0];
        for (float each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    public static byte min(byte[] array){
        byte min = array[0];
        for (byte each : array) {
            if(each < min){
                min = each;
            }
        }

        return min;
    }


}

/*
Task 3:
	1. create a method that can return the min number from an integer array
	2. create a method that can return the min number from double array
	3. create a method that can return the min number from long array
	4. create a method that can return the min number from short array
	5. create a method that can return the min number from float array
	6. create a method that can return the min number from byte array
 */
