package lotto;

import lotto.domain.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoApplication {

    public static void run() {
        try {
            Money money = new Money(InputView.inputPurchaseAmount());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            throw e;
        }
    }
}
