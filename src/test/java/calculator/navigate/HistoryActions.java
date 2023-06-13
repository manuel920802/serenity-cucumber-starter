package calculator.navigate;

import calculator.domain.RecordedOperation;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;

public class HistoryActions extends UIInteractionSteps {

    public List<RecordedOperation> history(){
        return findAll(HistoryPanel.HISTORY_ROWS).map(this::extractRecordedOperationFrom);
    }

    private RecordedOperation extractRecordedOperationFrom(WebElementFacade row) {
        return new RecordedOperation(
                row.find(HistoryPanel.EXPRESSION).getText(),
                row.find(HistoryPanel.RESULT).getText()
        );
    }
}
