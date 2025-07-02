package JavaLab4.J036;

public class CheckReverse {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public boolean isSameRv(){
        StringBuilder onlyLetters = new StringBuilder();
        
        String userInput = getInput();
        userInput = userInput.trim();
        userInput = userInput.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        char a;
        char b;
        boolean isSame = false;
        for(int i=0; i<userInput.length(); i++){
            a = userInput.charAt(i);
            b = userInput.charAt(userInput.length() - 1 - i);

            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
