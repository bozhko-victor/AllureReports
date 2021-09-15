package githab.eroshenko;

import org.junit.jupiter.api.Test;

public class AnnotetedStepTest {

    final static String REPOSITORY = "eroshenkoam/allure-example";
    final static Integer ISSUE_NUMBER = 68;

    @Test
    public void testGithab() {

        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);

    }
}
