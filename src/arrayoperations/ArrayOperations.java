
package arrayoperations;

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
     Insertion insertion=new Insertion();
//     insertion.insertElementsAtBeg();
//insertion.insertElementAtLast();
insertion.insertElementAtSpecificPosition();
Deletion d=new Deletion();
d.deletion(insertion);
        
    }
    
}
