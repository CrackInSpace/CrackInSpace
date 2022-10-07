public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;// = 40;
    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }
    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }

}
