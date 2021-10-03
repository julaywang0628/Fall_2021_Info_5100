package com.company;

public class Main {

    public static void main(String[] args) {
        //test1
        String[] args1 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(shortestDistance(args1, word1, word2));

        //test2
        String[] args2 = {"practice", "makes", "perfect", "coding", "makes"};
        String test1 = "makes";
        String test2 = "coding";
        System.out.println(shortestDistance(args2, test1, test2));

        //test3
        String[] args3 = {"practice", "makes", "perfect", "coding", "makes"};
        String case1 = "perfect";
        String case2 = "makes";
        System.out.println(shortestDistance(args3, case1, case2));
    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        if(wordsDict.length == 1) {
            return 0;
        }

        int answer = wordsDict.length;
        for(int i = 0; i < wordsDict.length; i++) {
            if(wordsDict[i].equals(word1)){
                for(int j = 0; j < wordsDict.length; j++) {
                    if(wordsDict[j].equals(word2)){
                        answer = Math.min(answer, Math.abs(i - j));
                    }
                }
            }

        }
        return answer;
    }
}
