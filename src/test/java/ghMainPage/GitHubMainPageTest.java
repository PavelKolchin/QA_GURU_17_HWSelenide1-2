package ghMainPage;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class GitHubMainPageTest {

    @Test
    void pageFound() {

        open("https://github.com/");
        $$("ul.d-lg-flex li").findBy(text("Solutions")).hover();
        $$("div.HeaderMenu-dropdown ul li").findBy(text("Enterprise")).click();
        $("h1.h1-mktg").shouldHave(text("Build like the best"));
    }
}
