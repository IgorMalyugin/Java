package guru.qa.selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
    public void testIssueSearch() {
        open("https://github.com");

        $("#query-builder-test").setValue("IgorMalyugin/Selenide").pressEnter();
        $(linkText("IgorMalyugin/Selenide")).click();
        $("#issues-tab").click();


    }
}
