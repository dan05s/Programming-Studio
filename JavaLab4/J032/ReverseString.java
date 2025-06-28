package JavaLab4.J032;

public class ReverseString {
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public char[] reverseString(){
        String data = getSentence();
        String result;
        int count =0;
        char charData[] = new char[data.length()];
        for(int i=data.length()-1; i>=0; i--){
            charData[count] = data.charAt(i);
            count ++;
        }
        return charData;
    }
}
