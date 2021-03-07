package com.epam.java_basic.string_processor;

import java.util.Arrays;

/**
 *  Useful methods for string processing
 */
public class StringProcessor {

    private static final int OUTPUT_ONLY_DIGITS_WORD_IF_MANY =2;
    public String findShortestLine(String[] lines) {
        int shortestLineLength = Integer.MAX_VALUE;
        String shortestLine = null;
        for (String line : lines) {
            int lineLength = line.length();
            if (lineLength < shortestLineLength) {
                shortestLineLength = lineLength;
                shortestLine = line;
            }
        }
        return shortestLine;
    }

    public String findLongestLine(String[] lines) {
        int longestLineLength = Integer.MIN_VALUE;
        String longestLine = null;
        for (String line : lines) {
            int lineLength = line.length();
            if (lineLength > longestLineLength) {
                longestLineLength = lineLength;
                longestLine = line;
            }
        }
        return longestLine;
    }

    public String[] findLinesShorterThanAverageLength(String[] lines) {
        int linestLengthSum = 0;
        for (String line : lines) {
            linestLengthSum += line.length();
        }
        int linesArrayLength = lines.length;
        double averageLineLength = linestLengthSum / (double) linesArrayLength;
        String[] linesShortThanAverage = new String[linesArrayLength];
        int linesShorterThanAverageIndex = 0;
        for (String line : lines) {
            if (line.length() < averageLineLength) {
                linesShortThanAverage[linesShorterThanAverageIndex] = line;
                linesShorterThanAverageIndex++;
            }
        }
        return Arrays.copyOf(linesShortThanAverage, linesShorterThanAverageIndex);
    }

    public String[] findLinesLongerThanAverageLength(String[] lines) {
        int linesLengthSum = 0;
        for (String line : lines) {
            linesLengthSum += line.length();
        }
        int linesArrayLength = lines.length;
        double averageLineLength = linesLengthSum / (double) linesArrayLength;
        String[] linesLongerThanAverage = new String[linesArrayLength];
        int linesLongerThanAverageIndex = 0;
        for (String line : lines) {
            if (line.length() > averageLineLength) {
                linesLongerThanAverage[linesLongerThanAverageIndex] = line;
                linesLongerThanAverageIndex++;
            }
        }
        return Arrays.copyOf(linesLongerThanAverage, linesLongerThanAverageIndex);
    }

    /**
     * Find word with minimum various characters. Return first word if there are a few of such words.
     * @param words Input array of words
     * @return First word that consist of minimum amount of various characters
     */
    public String findWordWithMinimumVariousCharacters(String[] words) {
        int minVariousCharacters = Integer.MAX_VALUE;
        String wordWithMinCharacters = null;
        for (String word : words) {
            int variousCharactersInWord = 0;
            int wordLength = word.length();
            char [] wordChars = word.toCharArray();
            for (int i = 0; i < wordLength; i++) {
                if (i == word.indexOf(wordChars[i])) {
                    variousCharactersInWord++;
                }
            }
            if (minVariousCharacters > variousCharactersInWord) {
                minVariousCharacters = variousCharactersInWord;
                wordWithMinCharacters = word;
            }
        }
        return wordWithMinCharacters;
    }

    /**
     * Find word containing only of various characters. Return first word if there are a few of such words.
     * @param words Input array of words
     * @return First word that containing only of various characters
     */
    public String findWordConsistingOfVariousCharacters(String[] words) {
        String wordWithOnlyVariousCharacters = null;
        for(String word : words) {
            int variousCharactersInWord = word.length();
            int wordLength = word.length();
            char[] wordChars = word.toCharArray();
            for (int i = 0; i < wordLength; i++) {
                if (i != word.indexOf(wordChars[i])) {
                    variousCharactersInWord--;
                }
            }
            if (variousCharactersInWord == wordLength) {
                wordWithOnlyVariousCharacters = word;
                break;
            }
        }
        return wordWithOnlyVariousCharacters;
    }

    /**
     * Find word containing only of digits. Return second word if there are a few of such words.
     * @param words Input array of words
     * @return Second word that containing only of digits
     */
    public String findWordConsistingOfDigits(String[] words) {
        int amountOfWordsWithOnlyDigits = 0;
        String wordWithOnlyDigits = null;
        for (String word : words) {
            int digitsInWord = 0;
            char[] wordChars = word.toCharArray();
            for (char wordCharacter : wordChars) {
                if (Character.isDigit(wordCharacter)) {
                    digitsInWord++;
                }
            }
            if (digitsInWord == word.length()) {
                wordWithOnlyDigits = word;
                amountOfWordsWithOnlyDigits++;
                if (amountOfWordsWithOnlyDigits == OUTPUT_ONLY_DIGITS_WORD_IF_MANY) {
                    break;
                }
            }
        }
        return wordWithOnlyDigits;
    }
}
