package com.airbus.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionApp
{
    public static void main(String[] args) {
        //Declare pattern
        String pattern = "\\d+";  //what you want
        System.out.println(pattern);
        //find out all numbers from this string
        String inputString ="hey  hello 0 1, how subramanian 1 , 7m3";
        //logic to extract nos from the string
        //Compile the Pattern
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher digitMatcher =compiledPattern.matcher(inputString);
        System.out.println("Source String "+ inputString);
        while(digitMatcher.find()) {
            System.out.println(digitMatcher.group());
        }

    }
}
