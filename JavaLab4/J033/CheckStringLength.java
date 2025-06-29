package JavaLab4.J033;

import java.util.ArrayList;

public class CheckStringLength {
    private int namesNum;
    private String[] names;

    public int getNamesNum() {
        return namesNum;
    }

    public String[] getNames() {
        return names;
    }

    public void setNamesNum(int namesNum) {
        this.namesNum = namesNum;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[][] checkStringLength(){
        String[] data = getNames();
        if (data == null || data.length == 0) {
            return new String[2][0];
        }

        int shortest =Integer.MAX_VALUE;
        int longest =Integer.MIN_VALUE;

        for (String s : data) {
            int len = s.length();
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }
        //이제 shortest(length) longest(length)과 일치하는 data[i] 구해서 반환
        ArrayList<String> longestList = new ArrayList<>();
        ArrayList<String> shortestList = new ArrayList<>();

        for (String s : data) {
            if (s.length() == longest) {
                longestList.add(s);
            } else if (s.length() == shortest) {
                shortestList.add(s);
            }
        }

        String[][] result = new String[2][0];
        result[0] = longestList.toArray(new String[0]); 
        result[1] = shortestList.toArray(new String[0]);

        return result;
    }
}
