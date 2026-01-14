
package test;

import package1.MyClass;

public class App {

   public static void main(String[] args) {

       int a = 0;

       // declare and initialize a list of names
       String[][] listOfNames = {
            {"Alice", "Bob", "Charlie", "Dennis"},
            {"E", "F", "G", "H", "I"}
       }
        ;

       /*

        Now, I want to print
                the list of names
        So that the names are one per line
        Should look like:
        Alice
        Bob
        Charlie
        */
       for (int i = 0; i < listOfNames.length; i++) {
           for (int j = 0; j < listOfNames[i].length; j++) {
                System.out.print("Name: " + listOfNames[i][j] + " ");
           }
           System.out.println();
       }
       
       

    //    MyClass c = new MyClass();

   }
}
