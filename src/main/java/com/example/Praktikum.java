package com.example;



public class Praktikum {
    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String[] names = {"Тимоти Шаламе", "ТимотиШаламе", "Тимоти  Шаламе", "Тимоти Шала ме", " ТимотиШаламе", "ТимотиШаламе ", "", "Ти", "Тим", "Т Ш", "Тимоти ШаламеШаламе", "Тимоти ШаламеШаламем", null};
        for (int i = 0; i < names.length; i = i + 1) {
            Account account = new Account(names[i]);
            System.out.println(account.checkNameToEmboss());
        }

    }

}
