public class CheckCorrect {
    private String[] usernames = {"kim", "lee", "park", "hong", "choi"};
    private String[] password = {"1111", "1234", "3456", "3535", "7777"};

    public String[] getUsernames() {
        return usernames;
    }

    public String[] getPassword() {
        return password;
    }

    public void setUsernames(String[] usernames) {
        this.usernames = usernames;
    }

    public void setPassword(String[] password) {
        this.password = password;
    }

    public int CheckCorrect(String name, String pw){
        String[] names = getUsernames();
        String[] pws = getPassword();
        
        for (int i = 0; i < usernames.length; i++) {
            if (names[i].equals(name)) {
                if (pws[i].equals(pw)) {
                    return 1;
                } else {
                    return 3;
                }
            }
        }
        return 2;
    }
}
