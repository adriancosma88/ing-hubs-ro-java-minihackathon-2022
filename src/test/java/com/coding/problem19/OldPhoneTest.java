package com.coding.problem19;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class OldPhoneTest {
    OldPhone oldPhone = new OldPhone();

    @Test
    public void problem19_test1() {
      List<String> expectedResult = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
      assertTrue(resultIsEqualToExpectedList(expectedResult, oldPhone.letterCombinations("23")));
    }

    @Test
    public void problem19_test2() {
      List<String> expectedResult = Collections.emptyList();
      assertTrue(resultIsEqualToExpectedList(expectedResult, oldPhone.letterCombinations("1")));
    }

    @Test
    public void problem19_test3() {
      List<String> expectedResult = Collections.emptyList();
      assertTrue(resultIsEqualToExpectedList(expectedResult, oldPhone.letterCombinations("")));
    }

    @Test
    public void problem19_test4() {
      List<String> expectedResult = List.of("a", "b", "c");
      assertTrue(resultIsEqualToExpectedList(expectedResult, oldPhone.letterCombinations("2")));
    }

    @Test
    public void problem19_test5() {
      List<String> expectedResult = List.of("p", "q", "r", "s");
      assertTrue(resultIsEqualToExpectedList(expectedResult, oldPhone.letterCombinations("7")));
    }

    @Test
    public void problem19_test6() {
      List<String> expectedResult = List.of("djp", "ejp", "fjp", "dkp", "ekp",
          "fkp", "dlp", "elp", "flp", "djq", "ejq", "fjq", "dkq", "ekq", "fkq", "dlq",
          "elq", "flq", "djr", "ejr", "fjr", "dkr", "ekr", "fkr", "dlr", "elr", "flr",
          "djs", "ejs", "fjs", "dks", "eks", "fks", "dls", "els", "fls");
      assertTrue(resultIsEqualToExpectedList(expectedResult, oldPhone.letterCombinations("357")));
    }

    private boolean resultIsEqualToExpectedList(List<String> expectedList, List<String> result) {
      return expectedList.size() == result.size()
          && expectedList.containsAll(result)
          && result.containsAll(expectedList);
    }
}
