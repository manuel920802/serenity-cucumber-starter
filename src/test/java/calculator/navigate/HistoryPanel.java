package calculator.navigate;

import org.openqa.selenium.By;

public class HistoryPanel {
    public static final By HISTORY_ROWS = By.xpath("//table/tbody/tr");
    public static final By EXPRESSION = By.xpath("td[2]");
    public static final By RESULT = By.xpath("td[3]");
}
