package day24Task;

/*3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
	8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
    This Question from Sunday Task(DEC 12)
				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

*/
public class ReverseStringJava {
    public static void main(String[] args) {

        String name = "Java";

        String result =reverse(name);

        System.out.println(result);

    }

    public static String reverse(String str){

        String reversed="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }

        return reversed;
    }

}


