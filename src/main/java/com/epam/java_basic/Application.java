package com.epam.java_basic;

import com.epam.java_basic.string_processor.StringProcessor;
import com.epam.java_basic.string_processor.StringController;
import com.epam.java_basic.string_processor.StringView;

/**
 * 01_Java_Basic - Vladimir Vasyukov
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public void run () {
        StringController stringController = new StringController(
                new StringProcessor(),
                new StringView());
        stringController.inputLines();
        stringController.findShortestLine();
        stringController.findLongestLine();
        stringController.findLinesShorterThanAverageLength();
        stringController.findLinesLongerThanAverageLength();
        stringController.inputWords();
        stringController.findWordWithMinimumVariousCharacters();
        stringController.findWordConsistingOfVariousCharacters();
        stringController.findWordsConsistingOfDigits();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

}
