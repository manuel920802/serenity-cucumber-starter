package calculator.actions.calculate;

import calculator.domain.MathsOperation;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static calculator.actions.calculate.CalculatorForm.*;

public class CalculateActions extends UIInteractionSteps {

    @Step("Enters {0} and click Go")
    public void calculate(MathsOperation operation){
        $(LEFT_OPERAND).sendKeys(operation.getLeftOperand());
        $(OPERATOR).selectByVisibleText(operation.getOperator());
        $(RIGHT_OPERAND).sendKeys(operation.getRightOperand());
        $(GO_BUTTON).click();
        waitForAngularRequestsToFinish();
    }

    public String result(){
        return $(RESULT).getText();
    }
}
