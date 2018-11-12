package QAtest.Helper;

import QAtest.Page.csssrPage;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class MainHelper {
    public static void BrowserSetAndOpenSite () {
        /** Установка конфигурации браузера и вход на сайт */
        Configuration.browser = "chrome";
        open("http://blog.csssr.ru/qa-engineer/");
        sleep(5000);
    }

    public static void GoOnFirstTab () {
        /** Переход на первую вкладку */
        $(csssrPage.FIRST_TAB).click();
        sleep(500);
    }
    public static void GoOnSecondTab () {
        /** Переход на вторую вкладку */
        $(csssrPage.SECOND_TAB).click();
        sleep(500);
    }
    public static void GoOnThirdTab () {
        /** Переход на третью вкладку */
        $(csssrPage.THIRD_TAB).click();
        sleep(500);
    }
    public static void GoOnFourthTab () {
        /** Переход на четвертую вкладку */
        $(csssrPage.FOURTH_TAB).click();
        sleep(500);
    }

    public static void DoubleClickOnFirstTabCheackboxes () {
        /** 2 нажатия по каждому чекбоксу в первой вкладке */
        $(csssrPage.FIRST_CHECKBOX_ON_FIRST_TAB).click();
        $(csssrPage.FIRST_CHECKBOX_ON_FIRST_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_FIRST_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_FIRST_TAB).click();
    }

    public static void DoubleClickOnSecondTabCheackboxes () {
        /** 2 нажатия по каждому чекбоксу во второй вкладке */
        $(csssrPage.FIRST_CHECKBOX_ON_SECOND_TAB).click();
        $(csssrPage.FIRST_CHECKBOX_ON_SECOND_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_SECOND_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_SECOND_TAB).click();
        $(csssrPage.THIRD_CHECKBOX_ON_SECOND_TAB).click();
        $(csssrPage.THIRD_CHECKBOX_ON_SECOND_TAB).click();
    }

    public static void DoubleClickOnThirdTabCheackboxes () {
        /** 2 нажатия по каждому чекбоксу во второй вкладке */
        $(csssrPage.FIRST_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.FIRST_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.THIRD_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.THIRD_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.FOURTH_CHECKBOX_ON_THIRD_TAB).click();
        $(csssrPage.FOURTH_CHECKBOX_ON_THIRD_TAB).click();
    }

    public static void DoubleClickOnFourthTabCheackboxes () {
        /** 2 нажатия по каждому чекбоксу в первой вкладке */
        $(csssrPage.FIRST_CHECKBOX_ON_FOURTH_TAB).click();
        $(csssrPage.FIRST_CHECKBOX_ON_FOURTH_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_FOURTH_TAB).click();
        $(csssrPage.SECOND_CHECKBOX_ON_FOURTH_TAB).click();
    }

    public static void OpenHrLink() {
        $(csssrPage.HR_LINK).click();
    }

    public static void OpenVkLink() {
        $(csssrPage.VK_LINK).click();
    }
}
