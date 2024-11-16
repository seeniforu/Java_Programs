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
}
