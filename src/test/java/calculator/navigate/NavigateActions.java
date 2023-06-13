package calculator.navigate;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractionSteps {

    @Step("Open the calculator")
    public void toTheCalculatorApplication(){
         openUrl("https://juliemr.github.io/protractor-demo/");
    }
}
