package Gamblingsimulator;

public class Gambler {
    int Stack;
    int HightLimit;
    int LowLimit;
    int bet;

    public int getHightLimit() {
        return HightLimit;
    }

    public void setHightLimit(int hightLimit) {
        HightLimit = hightLimit;
    }

    public int getLowLimit() {
        return LowLimit;
    }

    public void setLowLimit(int lowLimit) {
        LowLimit = lowLimit;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getStack() {
        return Stack;
    }

    public void setStack(int stack) {
        Stack = stack;
    }
}
