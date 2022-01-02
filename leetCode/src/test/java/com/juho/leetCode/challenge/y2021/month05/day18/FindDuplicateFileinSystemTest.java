package com.juho.leetCode.challenge.y2021.month05.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindDuplicateFileinSystemTest {

    FindDuplicateFileinSystem fdfs = new FindDuplicateFileinSystem();
    
    @Test
    public void findDuplicateFileinSystem01Test() {
        String[] paths01 = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        List<List<String>> result01 = new ArrayList<>();
        List<String> result01Chidren01 = new ArrayList<>();
        result01Chidren01.add("root/a/2.txt");
        result01Chidren01.add("root/c/d/4.txt");
        result01Chidren01.add("root/4.txt");
        result01.add(result01Chidren01);
        List<String> result01Chidren02 = new ArrayList<>();
        result01Chidren02.add("root/a/1.txt");
        result01Chidren02.add("root/c/3.txt");
        result01.add(result01Chidren02);
        assertEquals(result01, fdfs.findDuplicate(paths01));

        String[] paths02 = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};
        List<List<String>> result02 = new ArrayList<>();
        List<String> result02Chidren01 = new ArrayList<>();
        result02Chidren01.add("root/a/2.txt");
        result02Chidren01.add("root/c/d/4.txt");
        result02.add(result02Chidren01);
        List<String> result02Chidren02 = new ArrayList<>();
        result02Chidren02.add("root/a/1.txt");
        result02Chidren02.add("root/c/3.txt");
        result02.add(result02Chidren02);
        assertEquals(result02, fdfs.findDuplicate(paths02));
    }
}