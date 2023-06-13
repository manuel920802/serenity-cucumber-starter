package calculator.actions.calculate;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;

public class CalculatorForm {
    public static final By LEFT_OPERAND = ByAngular.model("first");
    public static final By OPERATOR = ByAngular.model("operator");
    public static final By RIGHT_OPERAND = ByAngular.model("second");
    public static final By GO_BUTTON = By.id("gobutton");
    public static final By RESULT = By.tagName("h2");
}
