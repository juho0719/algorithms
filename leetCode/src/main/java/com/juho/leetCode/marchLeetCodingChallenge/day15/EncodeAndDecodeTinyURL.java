package com.juho.leetCode.marchLeetCodingChallenge.day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EncodeAndDecodeTinyURL {
    String defaultScheme = "http://tinyurl.com/";
    String digits = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Map<String, String> urlMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while(sb.toString().length() < 6) {
            int index = random.nextInt(62);
            sb.append(digits.charAt(index));
        }
        String encodeContextPath = sb.toString();
        String encodeUrl = defaultScheme+encodeContextPath;
        urlMap.put(encodeUrl, longUrl);
        return encodeUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlMap.get(shortUrl);
    }
}