package com.epam.java_basic.string_processor;

import java.util.Scanner;

public class StringController {
    private final StringProcessor stringProcessor;
    private final StringView stringView;
    private String[] lines;
    private String[] words;
    private final Scanner in = new Scanner(System.in, "UTF-8");

    public StringController(StringProcessor stringProcessor, StringView stringView) {
        this.stringProcessor = stringProcessor;
        this.stringView = stringView;
    }

    public void inputLines() { this.lines = scanString(StringView.SPECIFY_LINES_AMOUNT, StringView.INPUT_LINE); }

    public void inputWords() { this.words = scanString(StringView.SPECIFY_WORDS_AMOUNT, StringView.INPUT_WORD); }

    private String[] scanString(String requestNumber, String requestString) {
        stringView.printRequestAmount(requestNumber);
        int amountOfStrings = Integer.parseInt(in.nextLine());
        String[] strings = new String[amountOfStrings];
        int stringArayLength = strings.length;
        for (int i = 0; i < stringArayLength; i++) {
            stringView.printRequestString(requestString, i);
            strings[i] = in.nextLine();
        }
        return strings;
    }

    public void findShortestLine() {
        stringView.printLineMethodResult(StringView.SHORTEST_LINE,
            stringProcessor.findShortestLine(lines));
    }

    public void findLongestLine() {
        stringView.printLineMethodResult(StringView.LONGEST_LINE,
            stringProcessor.findLongestLine(lines));
    }

    public void findLinesShorterThanAverageLength() {
        stringView.printLineMethodResult(StringView.LINES_SHORTER_THAN_AVERAGE,
            stringProcessor.findLinesShorterThanAverageLength(lines));
    }

    public void findLinesLongerThanAverageLength() {
        stringView.printLineMethodResult(StringView.LINES_LONGER_THAN_AVERAGE,
            stringProcessor.findLinesLongerThanAverageLength(lines));
    }

    public void findWordWithMinimumVariousCharacters() {
        stringView.printWordMethodResult(StringView.WORD_WITH_MIN_VARIOUS_CHARACTERS,
            stringProcessor.findWordWithMinimumVariousCharacters(words));
    }

    public void findWordConsistingOfVariousCharacters() {
        stringView.printWordMethodResult(StringView.WORD_WITH_ONLY_VARIOUS_CHARACTERS,
            stringProcessor.findWordConsistingOfVariousCharacters(words));
    }

    public void findWordsConsistingOfDigits() {
        stringView.printWordMethodResult(StringView.WORD_WITH_ONLY_DIGITS,
            stringProcessor.findWordConsistingOfDigits(words));
    }

}
