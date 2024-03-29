package com.lentouqin.lettcode2023;

public class Lt191 {

    public int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            count += n &1;
            n >>>=1;
        }
        return count;
    }
}
