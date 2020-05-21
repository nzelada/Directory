package NickZelada;

import java.util.Comparator;

/**
 * DirectoryComparator implements the Comparator interface with String. 
 * @author Nick Zelada
 * @version 03/07/2019 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class DirectoryComparator implements Comparator<String> {
/**
 * The compare method compares the two strings that goes in the parameter and 
 * checks if there is any digits in the string and compares it and compares the 
 * characters in the string too. 
 * @param a1 the first string
 * @param a2 the second string
 * @return either the compare result of cmp or Integer.compare(n1, n2)
 */
    @Override
    public int compare(String a1, String a2) { // two string parameter
        String w1, w2; // string variables
        int n1, n2; // int variables
        int index = 0; // index is set to zero

        for (int i = a1.length() - 1; i >= 0; --i) {
            if (!Character.isDigit(a1.charAt(i))) { /* checks to see if the 
                 character doesn't have a digit at the index of i */

                index = i + 1; /* add the index of i plus 1 and assigns it 
                 to index*/

                break; // the method then breaks
            }
        }

        n1 = Integer.parseInt(a1.substring(index)); /* assigns the certain index
         of the substring that is an int to n1 */

        w1 = a1.substring(0, index); /* returns the substring from 0 to the
         given index and assigns it to w1 */

        index = 0; // assigns 0 to the index

        for (int i = a2.length() - 1; i >= 0; --i) {
            if (!Character.isDigit(a2.charAt(i))) { /* checks to see if the 
                 character doesn't have a digit at the index of i */

                index = i + 1; /* add the index of i plus 1 and assigns it 
                 to index*/

                break; // the method then breaks
            }
        }

        n2 = Integer.parseInt(a2.substring(index)); /* assigns the certain index
         of the substring that is an int to n2 */

        w2 = a2.substring(0, index);/* returns the substring from 0 to the
         given index and assigns it to w2 */

        int compare = w1.compareTo(w2); /* w1 is compares it to w2, comparing
         two strings */

        if (compare == 0) { /* if the cmp is equal to 0, meaning that w1 and w1 
             both are the same */

            return Integer.compare(n1, n2); /* compares n1 and n2 and
             returns the value -1,0,1 */

        } else {
            return compare; //if not return the compare result of cmp
        }
    }
}
