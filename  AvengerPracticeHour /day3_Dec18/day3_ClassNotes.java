package day3_Dec18;

public class day3_ClassNotes {

    /*
      Topics:
                        -For Loop (Quick review)
                        -Loop Examples
                        -String Examples with Loop
                        -One Interview Question



                    For Loop(Quick review)

                 The for-loop has four parts --> init, test, increment/decrement,
                 --> separated by semi-colons (;)
                 and body


                 for ( init ; test ; increment/decrement ) {
                   body
                 }


                /*
                 Classic for-loop counting up from 0 to 99
                 0, 1, 2, 3, ... 99
                -init int i = 0
                -test i<100
                -increment i++
                */
/*
                for (int i=0; i<100; i++) {
        System.out.println(i);
    }

                /*
                 For-loop to print the values
                 0, 2, 4, 6, ... 98
                 -increment by i+=2, instead of i++
                  (same as i = i + 2)
                */
    /*
                for (int i=0; i<100; i+=2) {
        System.out.println(i);
    }

                /*
                 For-loop from 99 down to 0
                 99, 98, 97, ... 0
                 -init i=99
                 -test i>=0
                 -increment i--
                */
    /*

                for (int i=99; i>=0; i--) {
        System.out.println(i);
    }

                /*
                 For-loop from 0 to 100 by 5's
                 0, 5, 10, 15, .. 100
                 -test i<=100
                 -increment i+=5
                */

             //   for (int i=0; i<=100; i+=5) {
        //System.out.println(i);
    }

                /*
                writing two-digits numbers with nested loops
                hint:
                AB=10*A+B
                */

    /*
    writing three-digits numbers with nested loops
    hint:
    ABC=100*A+10*B+C
    */
    /*
    String Examples
                               1.
    Given a non-empty string like "Code" print a string like below output.
            (do with substring  first)
    Code → "CCoCodCode"
    abc → "aababc"
    ab → "aab"
            (do with replaceFirst())
    Code → "C-Co-Cod-Code"
    abc → "a-ab-abc"
    ab → "a-ab"


            2.
    Count the word that is given inside the sentence
    input: Java is Java
    word:Java
    output:2
     */


