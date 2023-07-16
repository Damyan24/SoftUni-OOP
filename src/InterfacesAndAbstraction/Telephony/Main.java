package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] nums = scan.nextLine().split("\\s+");
        String [] sites = scan.nextLine().split("\\s+");

        List<String> numbers = new ArrayList<>(Arrays.asList(nums));

        List<String> urls = new ArrayList<>(Arrays.asList(sites));

        Smartphone smartphone = new Smartphone(numbers,urls);


        Pattern patternNums = Pattern.compile("[\\d+]");
        Pattern patternLetters = Pattern.compile("[a-zA-Z]+");


        for(String num : numbers){
            Matcher matcher = patternLetters.matcher(num);
            boolean matcherFound = matcher.find();
            if(matcherFound){
                System.out.println("Invalid number!");
            }else {
                System.out.println(smartphone.call()+num);
            }
        }



        for(String url:urls){
            Matcher matcher = patternNums.matcher(url);
            boolean matcherFound = matcher.find();
            if(matcherFound){
                System.out.println("Invalid URL!");
            } else {
                System.out.println(smartphone.browse() + url+"!");
            }
        }




    }
}
