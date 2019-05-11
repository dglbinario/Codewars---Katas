package com.dgl.katas;

import java.util.StringTokenizer;

public class JadenCase {
    /*
    Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.

    Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

    Example:

    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
    Note that the Java version expects a return value of null for an empty string or null.
    */

    public String toJadenCaseV1(final String phrase) {
        if(phrase == null || "".equals(phrase)) {
            return null;
        } else {
            String word;
            char firstLetter;
            StringTokenizer st = new StringTokenizer(phrase);
            StringBuilder jadenCased = new StringBuilder();

            while (st.hasMoreTokens()) {
                word = st.nextToken();
                firstLetter = Character.toUpperCase(word.charAt(0));
                jadenCased.append(firstLetter).append(word.substring(1)).append(" ");
            }

            return jadenCased.toString().trim();
        }
    }

    public String toJadenCase(final String phrase) {
        if(phrase == null || "".equals(phrase.trim())) {
            return null;
        } else {
            char[] chars = phrase.toCharArray();
            char[] result = new char[chars.length];
            result[0] = Character.toUpperCase(chars[0]);
            boolean previousIsSpace = false;
            for (int i = 1; i < chars.length; i++) {
                result[i] = previousIsSpace ? Character.toUpperCase(chars[i]) : chars[i];
                previousIsSpace = chars[i] == ' ';
            }
            return new String(result);
        }
    }
}

