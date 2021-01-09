package vtb.geekbrains;

public class WordCounter {
    private String word;
    private Integer count;

    public WordCounter(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }
}
