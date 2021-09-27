package com.iljasstan;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JUnit5ExampleOnSoftAssertions {
    @Test
    void shouldFindJUnit5Example() {
        Configuration.browser = "opera";
        Configuration.startMaximized = true;

        open("https://github.com/selenide/selenide/wiki/SoftAssertions");
        $("#wiki-body").shouldHave(text("JUnit5"));

    }
}
