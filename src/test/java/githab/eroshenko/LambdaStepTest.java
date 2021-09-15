package githab.eroshenko;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
<<<<<<< HEAD
import static io.qameta.allure.Allure.step;
=======
>>>>>>> origin/main
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepTest {

<<<<<<< HEAD
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static Integer ISSUE_NUMBER = 68;

    @Test
    public void testGithab() {

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Ищем репозиторий" + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий" + REPOSITORY, () -> {
            $(linkText("eroshenkoam/allure-example")).click();
        });
        step("Открываем раздел Issues", () -> {
            $(partialLinkText("Issues")).click();
        });
        step("Проверяем наличие Issue с номером " + ISSUE_NUMBER, () -> {
            $(byText("" + ISSUE_NUMBER)).should(Condition.visible);
        });

=======
    @Test
    public void testGithab() {
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();

        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issues")).click();
        $(byText("68")).shouldBe(Condition.visible);
>>>>>>> origin/main
    }
}
