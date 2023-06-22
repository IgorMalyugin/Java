package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTest {

    static {
        Configuration.pageLoadStrategy = "eager";
    }

    @Disabled
    @BeforeEach
    void preCondition() {
        open("https://www.wildberries.ru/");
    }

    @CsvSource({
            "https://www.wildberries.ru/', '151518564",
            "https://www.wildberries.ru/', '7153922"
    })
    @Tags({
            @Tag("WEB"),
            @Tag("normal")
    })
    @Disabled
    @DisplayName("Проверка поиска на сайте wildberries")
    @ParameterizedTest(name = "Проверить на сайте {0} коректную работу поиска товара {1}")
    void CheckSearchTest(String url, String searchQuery) {
        open(url);
        $("#searchInput").setValue(searchQuery).pressEnter();
        $("#productNmId")
                .shouldHave(text(searchQuery), Duration.ofSeconds(30));

    }


}
