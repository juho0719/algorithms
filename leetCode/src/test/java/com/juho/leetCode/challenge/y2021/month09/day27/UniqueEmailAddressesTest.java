package com.juho.leetCode.challenge.y2021.month09.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddressesTest {

    UniqueEmailAddresses uea = new UniqueEmailAddresses();

    @Test
    public void uniqueEmailAddresses01Test() {
        String[] emails01 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        assertEquals(2, uea.numUniqueEmails(emails01));

        String[] emails02 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        assertEquals(3, uea.numUniqueEmails(emails02));
    }
}