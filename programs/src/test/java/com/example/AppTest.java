package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void removeDuplicateWords(){
        Scanner s = new Scanner(System.in);
        //String sentence = s.nextLine();
        String sentence = "This is a sample sentence and this is a sample test".toLowerCase();
        String dupRemoved = "";
        List<String> list = new ArrayList<>();
        list = Arrays.asList(sentence.split(" "));
        List<String> listTemp = new ArrayList<>();
        for(int i = 0; i<list.size();i++){
            if(!(listTemp.contains(list.get(i)))){
                listTemp.add(list.get(i));
            }
        }
        //System.out.println(list);
        for(int i = 0;i<listTemp.size();i++){
            dupRemoved = dupRemoved + listTemp.get(i) + " ";
        }
        System.out.println("Original Sentence: "+sentence);
        System.out.println("Duplicate removed: "+dupRemoved);
    }

    @Test
    public void removeSpecialCharater(){
        /*
         * Regex for space '\\s'
         * With ^ - Remove everything other than this "[^a-zA-Z\\s]"
         * Without ^ - Remove whatever mentioned in regex "[a-zA-Z\\s]"
         */
        String s = "!@#$%^&*(Hello there) [I'm Srini@#$%^vasa@#$%^n]";
        
        String regexOne = "[^a-zA-Z\\s]"; // Removes everything other than mentioned
        String regexTwo = "[a-zA-Z\\s]"; // Removes everything mentioned
        
        String s1 = s.replaceAll(regexOne, "");
        String s2 = s.replaceAll(regexTwo,"");

        System.out.println(s1); // Hello thereIm Srinivasan
        System.out.println(s2); //!@#$%^&*()['@#$%^@#$%^]
    }

    @Test
    public void removeVowelsWithregex(){
       String s = "Srinivasan";

       String regex = "[aeiouAEIOU]";

       String b = s.replaceAll(regex, "");
       System.out.println(b);
    }

    @Test
    public void findVowelsWithRegex(){
       String s = "Srinivasan";

       String regexforConsonants = "[aeiouAEIOU]";
       String regexforVowels = "[^aeiouAEIOU]";

       String Vowels = s.replaceAll(regexforVowels, "");
       String Consonants = s.replaceAll(regexforConsonants, "");
       System.out.println(Vowels);
       System.out.println(Consonants);
    }

    @Test
    public void countVowels(){
        String s = "AEIOU PP";
        int len = s.length();
        char c;
        int vowelsCount = 0;
        int consonantsCount = 0;
        for(int i = 0;i<len;i++){
            c = s.charAt(i);
            c = Character.toLowerCase(c);
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'){
                vowelsCount++;
            }else if(c==' '){
                continue;
            }else{
                consonantsCount++;
            }
        }
        System.out.println("Length of string: " + len);
        System.out.println(vowelsCount);
        System.out.println(consonantsCount);
    }

    @Test
    public void RecursionReverseString() {
        String s = "New String";
        int len = s.length();
        reverseUsingRecursion(s, len - 1);
    }

    public void reverseUsingRecursion(String s, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(s.charAt(i));
        reverseUsingRecursion(s, i - 1);
    }

    @Test
    public void reverseNumber(){
        int n = 90785;

        int temp = 0;
        while(n!=0){
            temp = temp*10 + n%10;
            n = n/10;
        }

        System.out.println("Reversed number is : " + temp); // Reversed Number is : 58709
    }

    @Test
    public void reverseNumberUsingString(){
        
        String s = "0100";

        int len = s.length()-1;
        String temp = "";
        while(len>=0){
            temp = temp + s.charAt(len);
            len--;
        }
        System.out.println("Reversed number is : " + temp); //Reversed number is : 0010
    }

    @Test
    public void countNumberofDigits(){
        int i = 999999999;

        int count = 0;

        while(i!=0){
            i = i/10;
            count = count+1;
        }
        System.out.println("No. of digits present is : "+count); // No. of digits present is : 9
    }

    @Test
    public void sumofDigits(){
        int i = 99;

        int temp, sum = 0;

        while(i!=0){
            temp = i%10;
            sum = sum+temp;
            i=i/10;
        }
        System.out.println("Sum of digits is : "+sum); // Sum of digits is : 18
    }

    @Test
    public void printDuplicates(){
        String string1 = "mssrr";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }

    @Test
    public void removeDup(){
        StringBuilder str = new StringBuilder();
        Set<Character> sets = new LinkedHashSet<>();
        String s = "Hello there hi";

        for(char c: s.toCharArray()){
            if(!str.toString().contains(String.valueOf(c))){
                str.append(c);
            }else{
                sets.add(c);
            }
        }
        System.out.println(str); // Helo thri
        System.out.println(sets.toString()); // [l, e,  , h]
    }

    @Test
    public void checkSubstringWithRegex(){
        String s1 = "Automation";
        String s2 = "Auto";

        boolean b = s1.matches("(.*)"+s2+"(.*)");

        System.out.println(b); //True
    }

    @Test
    public void checkSubstring(){
        String s1 = "Automation";
        String s2 = "on";
        int count = 0;
        String temp = "";
        for(int i = 0;i<s1.length();i++){
            for(int j = 0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    if(s1.charAt(i+1) == s2.charAt(j+1)){
                        count = count + 1;
                        temp = temp + s2.charAt(j);
                    }
                    else
                        continue;
                }
            }
        }
        if(count>1)
            System.out.println("Substring is Present : "+temp);
        else
            System.out.println("Not there");
        
        if(s1.contains(s2))
            System.out.println("Contains sub is present");
        else
            System.out.println("Not there");
    }

    @Test
    public void swapNumbers(){
        int a = 50;
        int b = 60;

        b = a+b-(a=b);
        System.out.println("Swapping a = "+a+" b = "+b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Swapping a = "+a+" b = "+b);

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("Swapping a = "+a+" b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapping a = "+a+" b = "+b);
    }
}
