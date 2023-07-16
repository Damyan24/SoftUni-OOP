package Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Browsable,Callable {
    private List<String> numbers;

    private List<String> urls;

    public Smartphone(List<String> numbers , List<String>urls){
        this.numbers = numbers;
        this.urls = urls;

        numbers = new ArrayList<>();
        urls = new ArrayList<>();
    }

    @Override
    public String browse() {
        return "Browsing: ";
    }

    @Override
    public String call() {
        return "Calling... ";
    }
}
