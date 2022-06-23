package com.example;



public class Account {

    private final String name;

    private int countSpace() {
        int spaceCount = 0;
        for (char c : this.name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() < 3) return false;
        if (name.length() > 19) return false;
        if (this.countSpace() != 1) return false;
        if (name.charAt(0) == ' ') return false;
        if (name.charAt(name.length() - 1) == ' ') return false;

        return true;
    }
}
