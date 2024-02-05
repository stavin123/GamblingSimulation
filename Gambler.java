package Gamblingsimulator;

public class Gambler {
    private  int Stack;
    private int HightLimit;
    private int LowLimit;
    int bet;
    int Wins;
    int Losses;
    int NumberOfGames;
    int winpercentage=0,losspercentage=0;
    String WinLoss;

    public String getWinLoss() {
        return WinLoss;
    }

    public void setWinLoss(String winLoss) {
        WinLoss = winLoss;
    }

    public int getWinpercentage() {
        return winpercentage;
    }

    public void setWinpercentage(int winpercentage) {
        this.winpercentage = winpercentage;
    }

    public int getLosspercentage() {
        return losspercentage;
    }

    public void setLosspercentage(int losspercentage) {
        this.losspercentage = losspercentage;
    }

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

    public int getWins() {
        return Wins;
    }

    public void setWins(int wins) {
        Wins = wins;
    }

    public int getLosses() {
        return Losses;
    }

    public void setLosses(int losses) {
        Losses = losses;
    }

    public int getNumberOfGames() {
        return NumberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        NumberOfGames = numberOfGames;
    }
}
