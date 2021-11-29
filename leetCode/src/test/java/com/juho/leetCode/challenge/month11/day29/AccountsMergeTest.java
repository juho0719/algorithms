package com.juho.leetCode.challenge.month11.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class AccountsMergeTest {

    AccountsMerge am = new AccountsMerge();

    @Test
    public void accountsMerge01Test() {
        List<List<String>> accounts100 = new ArrayList<>();
        List<String> accounts101 = new ArrayList<>();
        accounts101.add("John");
        accounts101.add("johnsmith@mail.com");
        accounts101.add("john_newyork@mail.com");
        accounts100.add(accounts101);
        List<String> accounts102 = new ArrayList<>();
        accounts102.add("John");
        accounts102.add("johnsmith@mail.com");
        accounts102.add("john00@mail.com");
        accounts100.add(accounts102);
        List<String> accounts103 = new ArrayList<>();
        accounts103.add("Mary");
        accounts103.add("mary@mail.com");
        accounts100.add(accounts103);
        List<String> accounts104 = new ArrayList<>();
        accounts104.add("John");
        accounts104.add("johnnybravo@mail.com");
        accounts100.add(accounts104);
     
        List<List<String>> result100 = new ArrayList<>();
        List<String> result101 = new ArrayList<>();
        result101.add("John");
        result101.add("john00@mail.com");
        result101.add("john_newyork@mail.com");
        result101.add("johnsmith@mail.com");
        result100.add(result101);
        List<String> result102 = new ArrayList<>();
        result102.add("Mary");
        result102.add("mary@mail.com");
        result100.add(result102);
        List<String> result103 = new ArrayList<>();
        result103.add("John");
        result103.add("johnnybravo@mail.com");
        result100.add(result103);

        assertEquals(result100, am.accountsMerge(accounts100));
    }
}