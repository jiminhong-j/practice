package j041;

import j041.model.Lotto;

public class Main {
    public static void main(String[] args){
        Lotto lotto = new Lotto();
        lotto.printNumbers();
        lotto.remakeAuto();
        lotto.printNumbers();
    }
}
