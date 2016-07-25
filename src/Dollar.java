/**
 * Created by Witek on 02.07.2016.
 */
public class Dollar {
    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Dollar && this.getAmount() == ((Dollar) obj).getAmount()) {
            return true;
        }else {
            return false;
        }
    }

    public int getAmount() {
        return amount;
    }
}
