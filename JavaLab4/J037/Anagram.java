package JavaLab4.J037;

public class Anagram {
    private String s1;
    private String s2;

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public int[][] countAlpha(){
        String sentence1 = getS1();
        String sentence2 = getS2();

        sentence1 = sentence1.toLowerCase();
        sentence2 = sentence2.toLowerCase();

        int[] alphaCount1 = new int[26];
        int[] alphaCount2 = new int[26];

        for (int i = 0; i < sentence1.length(); i++) {
            char ch1 = sentence1.charAt(i);
            if (Character.isLetter(ch1)) {
                alphaCount1[ch1 - 'a']++;
            }
        } 

        for (int i = 0; i < sentence2.length(); i++) {
            char ch2 = sentence2.charAt(i);
            if (Character.isLetter(ch2)) {
                alphaCount2[ch2 - 'a']++;
            }
        }

        return new int[][]{alphaCount1, alphaCount2};
    }

    public boolean checkAnagram(){
        int[][] count = countAlpha();
        for(int i=0; i<26 ;i++){
            if(count[0][i]!=count[1][i]){
                return false;
            }
        }
        return true;
    }
}
