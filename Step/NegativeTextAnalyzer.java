public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private final String[] sadSmales = {":(", "=(", ":|"};
    @Override
    protected String[] getKeywords() {
        return sadSmales;
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
