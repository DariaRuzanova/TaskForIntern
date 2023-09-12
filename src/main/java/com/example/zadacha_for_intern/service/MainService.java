package com.example.zadacha_for_intern.service;


import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class MainService {
    public String getCountCharsToString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        str.chars().forEach(x -> {
            int count = map.getOrDefault((char) x, 0);
            count = count + 1;
            map.put((char) x, count);
        });
        List<Map.Entry<Character, Integer>> counts = map.entrySet().stream()
                .sorted(Comparator.comparingInt(x -> -x.getValue())).toList();

        StringBuilder s = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts) {
            s.append(String.format("\"%s\":%d, ", entry.getKey(), entry.getValue()));
        }
        if(s.length() !=0) {
            s.delete(s.length()-2, s.length());
        }
        return s.toString();
    }
}


