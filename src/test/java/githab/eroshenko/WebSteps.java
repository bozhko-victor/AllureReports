package githab.eroshenko;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static githab.eroshenko.AnnotatedStepTest.ISSUE_NUMBER;
import static githab.eroshenko.AnnotatedStepTest.REPOSITORY;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repository}")
    public void searchRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(REPOSITORY);
        $(".header-search-input").submit();
    }

    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(REPOSITORY)).click();
    }

    @Step("Открываем раздел Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Проверяем наличие Issue с номером {number}")
    public void shouldSeeIssueWithNumber(int number) {
        $(byText("" + ISSUE_NUMBER)).should(Condition.visible);
    }
}
