package JavaLab4.J035;

public class SeparateB {
    private String birth;

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int result(){
        String birth8 = getBirth();

        char year1 = birth8.charAt(0);
        char year2 = birth8.charAt(1);
        char year3 = birth8.charAt(2);
        char year4 = birth8.charAt(3);
        
        String month = birth8.substring(4, 6);
        String day = birth8.substring(6,8);

        int iyear1 =year1-'0';
        int iyear2 =year2-'0';
        int iyear3 =year3-'0';
        int iyear4 =year4-'0';
        int imonth = Integer.parseInt(month);
        int iday = Integer.parseInt(day);

        int result = iyear1+iyear2+iyear3+iyear4+imonth+iday;

        return result;
    }
}
