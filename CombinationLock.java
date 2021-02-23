public class CombinationLock {
    private String combination = "000";

    public CombinationLock(String combination) {
        this.combination = combination;
    }

    public boolean open(String input) {
        if(input == this.combination) {
            return true;
        }
        return false;
    }

    public boolean changeCombo(String input, String newCombo) {
        if(this.open(input)) {
            if(newCombo.length() == 3 && newCombo.matches("[0-9]+")) {
                this.combination = newCombo;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.combination;
    }
}
