package day24Task;

public class TaskQuestionsDecTenAndTwelve {

/*

   Solutions of Task:
   /* 1.  create a method named frequencyOfWord that passes two parameters:
//    string sentence and String word, then returns the frequency of word from the sentence
//    Ex:
//    sentence = "Java java java python python"
//    word = "java";
//    frequencyOfWord(sentence, word) ==>  3

    public static int frequencyOfWord(String sentence, String word) {
        String[] newArr = sentence.split(" ");
        int frequency = 0;
        for (String each : newArr) {
            if (each.equalsIgnoreCase(word)) {
                frequency++;
            }
        }
        return frequency;

    }

//2. create a method named isAnagram that passes two String parameters,
//the method returns true if the given two strings are anagram, otherwise returns false
//Ex:str1 = "cba"{'c','b','a'}     str2 = "bac";
//    isAnagram(str1, str2) ====> true

    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();//{'c','b','a'}
        char[] ch2 = str2.toCharArray();//{'b','a','c'}
        Arrays.sort(ch1);//{'a','b','d'}==>ch1[0]
        Arrays.sort(ch2);//{'a','b','c'}==>ch2[0]
        int count = 0;
        boolean result = false;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]) {
                count++;
            }
        }
        if (count == ch1.length) {
            return !result;
        } else {
            return result;
        }
    }

//3. create a method named reverse that passes one string parameter, the method can return the reversed string
//    Ex:str = "Java";
//    reverse(str) ==> avaJ


    public static String reversed(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }

//4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
//    the method returns true if the string is palindrome, otherwise returns false
//    Ex:str = "Level"
//    isPalindrome(str) ===> true

    public static boolean isPalindrome(String parameter) {
        boolean result = true;
        if (reversed(parameter).equalsIgnoreCase(parameter)) {
            return result;
        } else {
            return !result;
        }
    }

//5. create method that accepts one integer array and one integer number and returns the frequency of the number
//    Ex:int[] array ={1,1,1,1,1,2,2};
//frequency(array, 1) ==> 5

    public static int frequencyOfArrayNumber(int[] Arr,int num){
        int count=0;
        for (int each : Arr) {
            if (each==num){
                count++;
            }
        }
        return count;
    }


//    6. create a method named addElement that takes one integer array and one integer,
//    the method can add the Integer number after the  last index of the integer array and returns the new array
//    Ex:arr ={1,2,3};   num = 4;
//    addElement(arr, num) ==> {1,2,3,4}

    public static int[] addElement(int[] arr,int num){
        int[] newArr=new int[arr.length+1];
        int count=0;
        for (int each : arr) {
            newArr[count++]=each;
        }
        newArr[count]=num;
        return newArr;
    }
//7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array
//Ex:arr1 = {1,2,3}  arr2 = {4,5,6}     merge(arr1, arr2) ====> {1,2,3,4,5,6}

    public static int[] merge(int[] arr1,int[] arr2){
        int[] newArr=new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            newArr[i++]=each;
        }
        for (int each : arr2) {
            newArr[i++]=each;
        }
        return  newArr;
    }

//8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
//Ex:arr = {10, 20, 30, 40};
// reverse(arr) ==> {40, 30, 20, 10}

    public static int[] reversedarray(int[] arr){
        int[] reversed=new int[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j]=arr[i];
        }
        return reversed;
    }
//9. Create a method named contains that passes one integer array and one integer parameters,
//the method returns true if the given integer is contained in the given array, otherwise returns false
//Ex:arr = {1,2,3,4,5,6,7};  num = 10;
//contains(arr, num) ===> false
    public static boolean contains(int[] arr,int num){
        boolean result=true;
        int count=0;
        for (int each : arr) {
            if(each==num){
                count++;
            }
        }
        if(count>=1){
            return result;
        }else{
            return !result;
        }
    }
//10. create a method named removeElement that passes one integer array and one integer,
//    the method removes the integer index from the integer array and returns the new array
//Ex:array = {10, 20, 30, 40, 50, 60}  index = 2
//removeElement(array, index) ==== {10, 20, 40, 50, 60}
        public static int[] removeElement(int[] arr, int indx){
        int[] newArr=new int[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(i==indx){
                continue;
            }
            newArr[j++]=arr[i];
        }
        return newArr;
    }*/

}
