package com.epam.java_basic.string_processor;

public class StringView {
    protected static final String SPECIFY_LINES_AMOUNT = "Specify lines amount";
    protected static final String SPECIFY_WORDS_AMOUNT = "Specify amount od words";
    protected static final String INPUT_LINE = "Input Line";
    protected static final String INPUT_WORD = "Input_Word";

    protected static final String SHORTEST_LINE = "Shortest line";
    protected static final String LONGEST_LINE = "Longest line";
    protected static final String LINES_SHORTER_THAN_AVERAGE = "Lines shorter than average length";
    protected static final String LINES_LONGER_THAN_AVERAGE = "Lines longer than average length";
    protected static final String WORD_WITH_MIN_VARIOUS_CHARACTERS = "Word with minimum various characters";
    protected static final String WORD_WITH_ONLY_VARIOUS_CHARACTERS = "Word with only various characters";
    protected static final String WORD_WITH_ONLY_DIGITS = "Word contains only digits";
    private int stringProcessorMethodCallsCounter = 0;

    public void printRequestAmount (String request) {
        System.out.printf("%s:%n", request);
    }

    public void printRequestString (String description, int lineIndex){
        System.out.printf("%s %d:%n", description, lineIndex + 1);
    }

    public void printLineMethodResult (String description, String result){
        stringProcessorMethodCallsCounter++;
        System.out.printf("%d) %s is %s (length is %d)%n", stringProcessorMethodCallsCounter,
                description, result, result.length());
    }
    public void printLineMethodResult(String description, String[] result) {
        stringProcessorMethodCallsCounter++;
        System.out.printf("%d) %s:%n", stringProcessorMethodCallsCounter, description);
        for (String line : result) {
            System.out.printf("%s (length is %d)%n", line, line.length());
        }
    }
    public void printWordMethodResult(String description, String result){
        stringProcessorMethodCallsCounter++;
        System.out.printf("%d) %s is %s%n", stringProcessorMethodCallsCounter, description, result);
    }
}
