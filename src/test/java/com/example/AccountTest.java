package com.example;

import org.junit.Test;
//import io.qameta.allure.Description;
//import io.qameta.allure.Story;
//import io.qameta.allure.junit4.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


//@Story("Печать строки на банковской карте")
@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"ТимотиШаламе", false},
                {"Тимоти  Шаламе", false},
                {"Тимоти Шала ме", false},
                {" ТимотиШаламе", false},
                {"ТимотиШаламе ", false},
                {"", false},
                {"Ти", false},
                {"Тим", false},
                {"Т Ш", true},
                {"Тимоти ШаламеШаламе", true},
                {"Тимоти ШаламеШаламем", false},
                {null, false},
        };
    }


    @Test
//    @DisplayName("Печать строки на банковской карте)")
//    @Description("Проверяем:\n" +
//            " - в строке не меньше 3 и не больше 19 символов \n" +
//            " - в строке есть только один пробел \n" +
//            " - пробел стоит не в начале и не в конце строки")
    public void checkNameToEmboss() {
        Account account = new Account(name);
        assertEquals(expected, account.checkNameToEmboss());
    }
}