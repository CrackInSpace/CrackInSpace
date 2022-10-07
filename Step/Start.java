public class Start {
    public Label checkLabels(TextAnalyzer analyzers, String text) {
            if(analyzers.processText(text) != Label.OK) return analyzers.processText(text);
        return Label.OK;
    }
    public static void main(String[] args){
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        // тестовые комментарии
        String[] tests = new String[8];//или {"This comment is so good.", "1", "2", и т.д.};
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :| .";   // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer Negative = new NegativeTextAnalyzer();
        TextAnalyzer TooLong = new TooLongTextAnalyzer(commentMaxLength);
        TextAnalyzer Spam = new SpamAnalyzer(spamKeywords);
        TextAnalyzer[] textAnalyzers = {Negative, TooLong, Spam};
        //TextAnalyzer[] textAnalyzers = {new NegativeTextAnalyzer(), new TooLongTextAnalyzer(commentMaxLength),
        //               new SpamAnalyzer(spamKeywords)};// что проще для восприятия, но очень массивно
        Start testObject = new Start();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
    }
}
