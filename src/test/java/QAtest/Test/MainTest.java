package QAtest.Test;


import QAtest.Helper.MainHelper;
import QAtest.Page.csssrPage;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MainTest {
    @Test
    public void FirstTabTest(){
        MainHelper.BrowserSetAndOpenSite();
        MainHelper.GoOnFirstTab();
        MainHelper.GoOnFirstTab();
        $(csssrPage.H1_BODY).shouldHave(Condition.text("Работать с описаниями проектов и находить в них информацию."));
    }

    @Test
    public void SecondTabTest(){
        MainHelper.BrowserSetAndOpenSite();
        MainHelper.GoOnSecondTab();
        MainHelper.GoOnSecondTab();
        $(csssrPage.H1_BODY).shouldHave(Condition.text("Находить баги и несоответствия исходному дизайну в верстке наших проектов. Тестировать их с точки зрения\n" +
                "                удобства для пользователя. И указывать разработчикам на несовершенства."));
    }

    @Test
    public void ThirdTabTest(){
        MainHelper.BrowserSetAndOpenSite();
        MainHelper.GoOnThirdTab();
        MainHelper.GoOnThirdTab();
        $(csssrPage.H1_BODY).shouldHave(Condition.text("Распределять задачи между разработчиками. Отвечать на вопросы разработчиков. Контролировать выполнение\n" +
                "                задач. Информировать менеджера проекта о нештатных ситуациях. Связываться с заказчиками и уточнять\n" +
                "                информацию."));
    }

    @Test
    public void FourthTabTest(){
        MainHelper.BrowserSetAndOpenSite();
        MainHelper.GoOnFourthTab();
        MainHelper.GoOnFourthTab();
        $(csssrPage.H1_BODY).shouldHave(Condition.text("Иногда нужно будет работать непосредственно с файлами проектов: переименовывать их, или вырезать из них\n" +
                "                графику при помощи Photoshop."));
    }

    @Test
    public void EggInTheEgg(){
        MainHelper.BrowserSetAndOpenSite();
        MainHelper.GoOnFirstTab();
        MainHelper.GoOnThirdTab();
        MainHelper.GoOnSecondTab();
        MainHelper.GoOnFourthTab();
        MainHelper.GoOnFirstTab();
        MainHelper.GoOnSecondTab();
        sleep(20000);
    }
}
