package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {

        CustomList<String> customList = new CustomList<>();

        customList.add("Jan");
        customList.add("Maciej1");
        customList.add("Maciej2");
        customList.add("Maciej3");
        customList.add("Maciej4");
        customList.add("Maciej5");
        customList.add("Maciej6");
        customList.add("Maciej7");
        customList.add("Maciej8");
        customList.add("Maciej9");
        customList.add("Maciej10");
        customList.add("Maciej11");
        customList.add("Maciej12");

        for (int i = 0; i < customList.size() ; i++) {
            System.out.println(customList.get(i));
        }

        System.out.println(customList.size());
    }
}
