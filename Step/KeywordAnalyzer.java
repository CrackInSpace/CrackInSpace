public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    public Label processText(String text) {//после метода getKeywords() будет
        for (String words : getKeywords()) {// (String words : keywords)
            if (text.contains(words)) return getLabel();
        }
        return Label.OK;
    }
}
