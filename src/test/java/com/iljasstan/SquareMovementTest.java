package com.iljasstan;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SquareMovementTest {

    @Test
    void shouldTestIsSquareMoved() {
        Configuration.browser = "opera";
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //it works!
        $("#column-a").dragAndDropTo($("#column-b"));
        //actions().clickAndHold($("#column-a")).moveByOffset(0, 250).release().perform(); it doesn't work :(
        //check
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
