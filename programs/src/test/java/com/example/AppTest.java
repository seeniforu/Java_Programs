package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
}
