package com.iljasstan;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsOnWikiSelenide {
    @Test
    void shouldFindSoftAssertionsOnWikiPage() {
        Configuration.browser = "opera";
        Configuration.startMaximized = true;
        open("https://github.com");
        $("[data-test-selector='nav-search-input']").setValue("Selenide").pressEnter();
        $$(".repo-list li").first().$("a").pressEnter();
        $("#wiki-tab").click();

        $("#wiki-pages-box").$("ul").$("li button").click();
        $("#wiki-pages-box").$("ul").shouldHave(Condition.text("SoftAssertions"));
    }
}
