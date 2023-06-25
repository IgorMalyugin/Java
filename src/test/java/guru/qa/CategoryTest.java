package guru.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CategoryTest {

    static Stream<Arguments> checkCategory(){
        return Stream.of(
                Arguments.of(Category.SHOES, List.of("Обувь", "Детская", "Для новорожденных",
                        "Женская", "Мужская", "Ортопедическая обувь", "Аксессуары для обуви")),
                       Arguments.of(Category.BABY, List.of("Детям", "Для девочек", "Для мальчиков",
                        "Для новорожденных", "Детская электроника", "Конструкторы", "Детский транспорт",
                        "Детское питание", "Религиозная одежда", "Товары для малыша", "Подгузники", "Подарки детям"))
        );
    }

    @Tags({
            @Tag("WEB"),
            @Tag("normal")
    })
    @MethodSource("checkCategory")
    @ParameterizedTest
    void checkCategory(Category category, List<String> product) {
        open("https://www.wildberries.ru/");
        $(".swiper-container").should(exist);
        $(".nav-element__burger-line").click();
        $(".menu-burger__main-list").$(byText(category.name())).click();
        $(".menu-catalog").shouldHave(text(String.join(" ", product)));
    }
}
