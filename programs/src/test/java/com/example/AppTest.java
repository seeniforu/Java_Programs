package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
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
    public void countEvenandOddDigits(){
        int d = 132493;

        int temp=0, oddcount=0, evenCount = 0;

        while(d!=0){
            temp = d%10;
            if(temp % 2 == 0)
                evenCount++;
            else
                oddcount++;
            
            d=d/10;
        }
        System.out.println("Odd Count is : "+oddcount+" Even Count is : "+evenCount);
    }

    @Test
    public void largestNumberinInt(){
        int l = 10873;

        int large = 0, temp = 0;
        large = l%10;

        while(l!=0){
            temp = l%10;
            if(temp>large){
                large = temp;
            }
            l = l/10;
        }
        System.out.println("Largest digit is : "+large);
    }

    @Test
    public void largestNumberinArray(){
        int arr[] = {23,45,99,30,76,908};

        int len = arr.length;

        int Largest = arr[0];

        for(int i = 0;i<len;i++){
            if(arr[i]>Largest)
                Largest = arr[i];
        }
        System.out.println("Largest number in array is : "+Largest);
    }

    @Test
    public void fibonnaciSeries(){

        int f = 10;
        int n1 = 0,n2=1,sum=0;

        System.out.println(n1);
        System.out.println(n2);

        for(int i = 2; i<f;i++){
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
        System.out.println("Sum = "+sum);
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

    @Test
    public void primeNumber(){
        int number = 97; // It is a prime number
        boolean flag = true;
        System.out.println((int)Math.sqrt(number)); // 9
        if(number>1){
            for(int i = 2;i<=Math.sqrt(number);i++){
                if(number%i == 0){
                    flag = false;
                }
            }
        }
        if(number>1 && flag == true){
            System.out.println("It is a prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }

    @Test
    public void largestPrimeNumber(){
        
        int num = 100000;
        for(int j = num-1;j>1;j--){
            if(isPrime(j)){
                System.out.println("Largest Prime number is "+j);
                break;
            }
        }
        
    }
     static boolean isPrime(int number){
        if(number>1){
            for(int i = 2;i<=Math.sqrt(number);i++){
                if(number%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    // Factorial of a number
    @Test
    public void factorialofAnumber(){
        int f = 10;
        int temp = 1;
        for(int i=1; i<=f;i++){
            temp = temp*i;
        }
        System.out.println("Factorial of number "+f+" is : "+temp);
    }

    // Sum of elements in array
    @Test
    public void sumOfElementsInArray(){
        //int arr[] = {34,45,56,67,78,89,100};
        int arr[] = {98, 55, 54, 59, 40};
        
        int len = arr.length;
        int sum = 0;

        for(int i = 0; i<len;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of digits in the array: "+sum);
    }

    // Sum of random number sin array
    @Test
    public void sumOfRandomNumbersinArray(){
        int arr[] = new int[5];
        Random r = new Random();

        int sum = 0;
        for(int i = 0; i<5;i++){
            arr[i] = r.nextInt(100);
            sum = sum + arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }

    // Even and odd number in a array
    @Test
    public void EvenandOddNumbersInArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even number : "+arr[i]);
            }else{
                System.out.println("Odd Number : "+arr[i]);
            }
        }
    }

    // Arrays equal or not
    @Test
    public void arraysEquality(){
        int[] a = {1,2,4};
        int[] b = {1,2,3};
        int countA = a.length;
        int countB = b.length;
        int temp = 0;
        if(countA == countB){
            for(int i =0;i<countA;i++){
                if(a[i]==b[i]){
                    temp++;
                }
            }
            if(temp == countA){
                System.out.println("Arrays are Equal");
            }else{
                System.out.println("Arrays are not equal with values");
            }
        }else{
            System.out.println("Arrays are not equal with length");
        }
    }

    //Find missing number in a range of numbers in array
    @Test
    public void arraysMissingNumber(){
        int a[] = {952,954,958,960};

        int aLen = a.length;
        int minRange = a[0], maxRange = a[0];
        int sum1 = 0, sum2 = 0;
        int rangediff = a[1]-a[0];
        for(int i = 0;i<aLen;i++){
            sum1 = sum1 + a[i];
            if(a[i]>maxRange){
                maxRange=a[i];
            }
            if(a[i]<minRange){
                minRange=a[i];
            }
        }

        System.out.println("Min : "+minRange+" Max : "+maxRange);

        for(int i = minRange;i<=maxRange;i=i+rangediff){
            sum2 = sum2+i;
        }

        System.out.println("Missing number is : "+(sum2-sum1));
    }

    // Sorting string array based on length of string
    @Test
    public void SortStringArray(){

        String stringList[] = {"Java","Assembly","C","Python","C++","R","Node"};
        int listLength = stringList.length;
        int lengthList[] = new int[listLength];
        String sortedList[] = new String[listLength];
        int temp = 0;

        for(int i = 0;i<listLength;i++){
            temp = stringList[i].length();
            lengthList[i] = temp;
        }
        Arrays.sort(lengthList);
        System.out.println(Arrays.toString(lengthList)); // [1, 1, 3, 4, 4, 6, 8]

        for(int j = 0;j<listLength;j++){
            for(int k = 0;k<listLength;k++){
                if(!(stringList[k].length()==lengthList[j]))
                    continue;
                else if(Arrays.toString(sortedList).contains(stringList[k])){
                    continue;
                }else{
                    sortedList[j] = stringList[k];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(sortedList)); // [C, R, C++, Java, Node, Python, Assembly]
    }

    // Find duplicates in string array
    @Test
    public void findDuplicatesinArray(){

        String arr[] = {"Java","Assembly","C","Python","C++","C","Python"};
        String flag = "ownLogic";
        int length = arr.length;
        boolean flagDup = false;

        if(flag == "ownLogic"){
            for(int i = 0;i<length;i++){
                for(int j = i+1;j<length;j++){
                    if(arr[i] == arr[j]){
                        System.out.println("Duplicate is : "+arr[j]);
                        flagDup = true;
                    }
                }
            }
            if(flagDup == false){
                System.out.println("No duplicates found");
            }

        }else if (flag == "Hashset") {
            HashSet<String> s = new HashSet<>();
            for(String l:arr){
                if(s.add(l)==false)
                    System.out.println("Duplicate is : "+l);
                    flagDup = true;
            }
        }
        if(flagDup == false){
            System.out.println("No duplicates found");
        }
    }

    //Binary Search
    @Test
    public void binarySearch(){

        int arr[] = {100,200,300,400,500,600,700,800,900,1000,1100,1200};
        int length = arr.length;
        int l = 0;
        int h = length-1;
        int element = 700;
        boolean flag = false;
        
        while (l<=h) {
            int mid = (l+h)/2;
            if(arr[mid] == element){
                System.out.println("Element is there: "+element);
                flag = true;
                break;
            }
            if(arr[mid]<element){
                l = mid+1;
            }
            if(arr[mid]>element){
                h = mid-1;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
    }

    //Bubble sort
    @Test
    public void bubbleSort(){
        int array[] = {44,49,46,47,45};

        int length = array.length;
        String flag = "Descending";

        for(int i = 0; i<length-1;i++){
            for(int j = 0;j<length-1;j++){
                if(flag == "Descendng"){
                    if(array[j]<array[j+1]){
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j]=temp;
                    }
                }else{
                    if(array[j]>array[j+1]){
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        if(flag == "Descending")
            System.out.println("Descending order array: "+Arrays.toString(array));
        else
            System.out.println("Ascending order array: "+Arrays.toString(array));
    }

    // Find second largest number in array
    @Test
    public void find2ndLargest(){
        int a[] = {10, 20,30, 80, 76,54, 67, 99};

        int max = 0;
        int secondMax = 0;

        for(int i = 0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        for(int j = 0;j<a.length;j++){
            if(a[j]<max && a[j]>secondMax)
                secondMax = a[j];
        }
        System.out.println("Largest is : "+max);
        System.out.println("Second max is : "+secondMax);
    }

    // Parallel sort and reverse order using built in methods
    @Test
    public void builtInSorting(){
        
        Integer a[] = {70,80,900,45,56,34};
        Arrays.parallelSort(a, Collections.reverseOrder());
        System.out.println("Parallel sorting: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted array: "+Arrays.toString(a));
    }

    // Finding number occerences of a character in a string
    @Test
    public void occurenceOfchar(){
        String s = "Find occurence of characters";
        String find = "e";
        
        int originalLength = s.length();
        String afterRemove = s.replaceAll(find, "");

        int newLength = afterRemove.length();

        int finalCount = originalLength-newLength;

        System.out.println("Number of occurence of "+find+" is : "+finalCount);
    }

    // Count number of words
    @Test
    public void countNumberOfWords(){
        String s = " Find occurence of characters ";
        int count = 1;

        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Count of words is : "+count);
    }

    // Printing 0 to 100 without using numbers - use '%'
    // use '/' for 1 to 100
    // for 0 to 10 - 'n'-'d' - Use ASCII table for other numbers
    @Test
    public void print100(){

        int start = 'e'%'e';

        int end = 'n'-'d';

        for(int i = start; i<=end;i++){
            System.out.println(i);
        }

        /*while(start<=end){
            System.out.println(start);
            start++;
        }*/
    }

    // Print numbers without loop, without recursion, without numbers
    @Test
    public void printNumbersWithoutLoop() {
        BitSet bitSet = new BitSet();
        bitSet.set('e'%'e', 'e');
        String substring = bitSet.toString()
                .replaceAll("\\{|, |}", "\n");
        
        System.out.println(bitSet.toString()); // Prints 0 to 100 in a set.
        System.out.println(substring); // Prints 0 to 100 one by one.
    }

    // Simple recursion for printing n numbers, without loops
    @Test
    public void recursionSimple(){
        printNumbers(0, 10);
    }

    public static void printNumbers(int startValue, int endValue){
        if(startValue<=endValue){
            System.out.println(startValue);
            startValue++;
            printNumbers(startValue, endValue);
        }
    }

    //Print statement without semicolon (;)
    @Test
    public void withoutSemicolon(){

        if(System.out.printf("Hello world") != null){

        }
        if(System.out.append("Hello world") != null){
            
        }
    }

    // Integer caching
    // if == is used it'll be false. Limit is -128 to 127.
    // Above range will give equal, out of this range will be not equal.
    // .equals will work for all ranges
    @Test
    public void integerCaching(){
        Integer a = 200;
        Integer b = 200;

        if(a == b){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }

    // NaN value
    // We cannot compare 2 NaN values, it'll always gives false.
    @Test
    public void NaN(){
        System.out.println((0.0/0.0)); // Prints NaN

        double nan = 0.0/0.0;

        if(nan == nan){
            System.out.println("True");
        }else{
            System.out.println("False"); // False is output
        }
    }

    // Print duplicate characters once in overall string
    // Output: [H, e, y, r, o]
    @Test
    public void dup(){

        String s = "Hey there How are you";
        ArrayList<String> a = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && !(a.contains(String.valueOf(s.charAt(i)))) && s.charAt(i) != ' '){
                    a.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        System.out.println(a.toString());
        System.out.println("Count of duplicates is : "+a.size());
    }

    // Printing all duplicate characters in a string
    // Output: H e y e r e o 
    @Test
    public void dup1(){

        String s = "Hey there How are you";
        char[] c = s.toCharArray();

        boolean isNotduplicate = false;

        for(int i=0;i<s.length();i++){
            boolean isduplicate = false;
            for(int j=i+1;j<s.length();j++){
                if(c[i] == c[j] && c[i] != ' '){
                    isduplicate = true;
                    break;
                }
            }
            if(isduplicate){
                System.out.print(c[i] + " ");
                isNotduplicate = true;
            }
        }
        if(!isNotduplicate){
            System.out.println("No duplicates found");
        }
    }

    // Program for subString
    // Either begin index or begin and end index as parameters
    // output: taking
    // Risk
    @Test
    public void subString(){
        String S1 = "Risk";
        String S2 = "taking";

        String S3 = S1 + S2;
        System.out.println("S3 : "+S3);

        S2 = S3.substring(0, S1.length());
        System.out.println(S2);
        S1 = S3.substring(S1.length());

        System.out.println(S1);
        System.out.println(S2);
    }

    @Test
    public void findLeapYear(){
        int year = 2021;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("It's a leap year");
                }
            }else{
                System.out.println("It's a leap year");
            }
        }else{
            System.out.println("Not a Leap year");
        }
    }
    // Removes all duplicates characters and prints only unique chacters not even first occurences
    @Test
    public void removeDupChars(){
        String s = "Hey there How are you";
        ArrayList<String> a = new ArrayList<>();
        String temp = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && !(a.contains(String.valueOf(s.charAt(i)))) && s.charAt(i) != ' '){
                    a.add(String.valueOf(s.charAt(i)));
                    temp = temp+s.charAt(i);
                }
            }
        }
        String remove = "["+ temp +"]";
        System.out.println(remove);
        String fin = s.replaceAll(remove,"");
        System.out.println(fin);
    }

    // Prints first occurences but removes other duplicate characters
    @Test
    public void printOnlyunique(){
        String s = "Hey there How are you";
        ArrayList<String> a = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(!(a.contains(String.valueOf(s.charAt(i))))){
                a.add(String.valueOf(s.charAt(i)));
            }
        }
        String temp = "";
        for(int k=0;k<a.size();k++){
            temp = temp + a.get(k);
        }
        System.out.println(temp);
    }
}
