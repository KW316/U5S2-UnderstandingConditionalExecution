package com.codedifferently.labs.partC;

public class AlgoChallenge {

    public static void main(String[] args) {
        System.out.println(containE("Hello"));
        System.out.println(containE("Heeello"));
        System.out.println(containE("Heello"));
        System.out.println(everyOther("Kianna", 2));
        System.out.println(everyOther("Miracle", 2));
        System.out.println(everyOther("abcdefg", 2));
        System.out.println(everyOther("abcdefg", 3));
    }
     /* Problem 1
    Determine if the given string contains between 1 and 3 'e' characters.
    Only if the string contains between 1 and 3 'e' characters; return true.
    containE("Hello") --> true
    containE("Heelle") --> true
    containE("Heelele") --> false
     */

    public static Boolean containE(String str) {
        int x = 0;
        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equalsIgnoreCase("e")){
                x++;
            }else{

            }
        }
        if(x == 1 || x == 3){
            return true;
        }else{
            return false;
        }

    }

     /* Problem 2
    An elementary school teacher needs your help to create new strings for a fun activity they have planned.
     You will be provided a non-empty string and a number N. To create a new string, you will start with the character 0.
     Next you will add every Nth character of the string to the new string.

     Return the new string.

     Tip: If N is 3, use char 0, 3, 6 ... and so on. N is 1 or more.

     Example:
     everyOther("Miracle", 2) --> "Mrce"
     everyOther("abcdefg", 2) --> "aceg"
     everyOther("abcdefg", 3) --> "adg"
     */

    public static String everyOther(String str, int n) {
        int x = n;
        String[] arr = str.split("");
        String a = arr[0];
        for( x = n; x < arr.length; x = x + n){
                a = a+arr[x];
            }


        return a;
    }


}
