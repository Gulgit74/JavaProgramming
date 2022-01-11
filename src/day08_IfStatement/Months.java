package day08_IfStatement;

public class Months {

    public static void main(String[] args) {
/*
 byte month = 9;

        boolean a = month == 1,
                b = month == 2,
                c = month == 3,
                d = month == 4,
                e = month == 5,
                f = month == 6,
                g = month == 7,
                h = month == 8,
                i = month == 9,
                j = month == 10,
                k = month == 11,
                l = month == 12;

        if (a){
            System.out.println("January");
        }else if (b){
            System.out.println("February");
        }else if (c){
            System.out.println("March");
        }else if (d){
            System.out.println("April");
        }else if (e){
            System.out.println("May");
        }else if (f) {
            System.out.println("June");
        }else if (g){
            System.out.println("July");
        }else if (h){
            System.out.println("August");
        }else if (i){
            System.out.println("September");
        }else if (j){
            System.out.println("October");
        }else if (k){
            System.out.println("November");
        }else{
            System.out.println("December");
        }


    }
}

 */

        int n = 10;
        String month = " ";
  if (n == 1){
        month = "January";
  } else if(n ==2) {
      month = "February";
  } else if (n == 3){
        month = "March";
  } else if (n == 4){
      month = "April";
  } else if(n == 5){
    month = "May";
  } else if(n ==6){
    month = "June";
  } else if(n == 7) {
      month = "July";
  }else if(n == 8) {
      month = "August";
  }else if(n == 9){
         month = "September";
  } else if (n == 10) {
      month = "October";

  }
  else if(n == 11){
      month = " Novenber";

  }
else if(n == 12){
    month = "December";
  }
  else {
      month = "invalide";
  }
        System.out.println("month = " + month);

    }

}
