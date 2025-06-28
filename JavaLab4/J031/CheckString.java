package JavaLab4.J031;

public class CheckString {
    private String userid;
    private String password;
    private String name;

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getData(){
        String[] data = new String[3];
        data[0] = getUserid();
        data[1] = getPassword();
        data[2] = getName();

        return data;
    }

    public void printResult(){
        String[] result = getData();
        System.out.printf("User Id: %s\n",result[0]);
        System.out.printf("Password: %s",result[1].substring(0, 2));
        for(int i=0; i<result[1].length()-2;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.printf("Uer name: %s\n",result[2]);
    }

}
