package QAtest.Page;

import org.openqa.selenium.By;

public class csssrPage {
    /** Вкладка "ВНИКАТЬ В ДЕТАЛИ ПРОЕКТОВ" */
    public static By FIRST_TAB = By.xpath("/html/body/div[1]/section[1]/section/div[1]/a");
    /** Вкладка "НАХОДИТЬ НЕСОВЕРШЕНСТВА" */
    public static By SECOND_TAB = By.xpath("/html/body/div[1]/section[1]/section/div[2]/a");
    /** Вкладка "НАХОДИТЬ НЕСОВЕРШЕНСТВА" */
    public static By THIRD_TAB = By.xpath("/html/body/div[1]/section[1]/section/div[3]/a");
    /** Вкладка "РАБОТАТЬ С ФАЙЛАМИ ПРОЕКТОВ" */
    public static By FOURTH_TAB = By.xpath("/html/body/div[1]/section[1]/section/div[4]/a");

    /** Заголовок тела выбранной вкладки" */
    public static By H1_BODY = By.xpath("//*[@class=\"info-details\"]/h1");

    /** Чекбокс "Внимательность" на первой вкладке */
    public static By FIRST_CHECKBOX_ON_FIRST_TAB = By.xpath("/html/body/div[1]/section[2]/div[1]/aside/ul/li[1]/label");
    /** Чекбокс "Умение рассуждать логически" на первой вкладке */
    public static By SECOND_CHECKBOX_ON_FIRST_TAB = By.xpath("/html/body/div[1]/section[2]/div[1]/aside/ul/li[2]/label");

    /** Чекбокс "Идеальный глазомер" на второй вкладке */
    public static By FIRST_CHECKBOX_ON_SECOND_TAB = By.xpath("/html/body/div[1]/section[2]/div[2]/aside/ul/li[1]/label");
    /** Чекбокс "Чувство прекрасного" на второй вкладке */
    public static By SECOND_CHECKBOX_ON_SECOND_TAB = By.xpath("/html/body/div[1]/section[2]/div[2]/aside/ul/li[2]/label");
    /** Чекбокс "Умение четко формулировать задачи" на второй вкладке */
    public static By THIRD_CHECKBOX_ON_SECOND_TAB = By.xpath("/html/body/div[1]/section[2]/div[2]/aside/ul/li[3]/label");
    /** Ссылка "Софт для быстрого создания скриншотов" на второй вкладке */
    public static By FOURTH_CHECKBOX_ON_SECOND_TAB = By.xpath("/html/body/div[1]/section[2]/div[2]/aside/ul/li[4]/label");

    /** Чекбокс "Внимательность" на третьей вкладке */
    public static By FIRST_CHECKBOX_ON_THIRD_TAB = By.xpath("/html/body/div[1]/section[2]/div[3]/aside/ul/li[1]/label");
    /** Чекбокс "Ответственность" на третьей вкладке */
    public static By SECOND_CHECKBOX_ON_THIRD_TAB = By.xpath("/html/body/div[1]/section[2]/div[3]/aside/ul/li[2]/label");
    /** Чекбокс "Умение вести несколько дел параллельно" на третьей вкладке */
    public static By THIRD_CHECKBOX_ON_THIRD_TAB = By.xpath("/html/body/div[1]/section[2]/div[3]/aside/ul/li[3]/label");
    /** Чекбокс "Умение рассуждать логически" на третьей вкладке */
    public static By FOURTH_CHECKBOX_ON_THIRD_TAB = By.xpath("/html/body/div[1]/section[2]/div[3]/aside/ul/li[4]/label");

    /** Чекбокс "Умение упорядочивать хаос" на четвертой вкладке */
    public static By FIRST_CHECKBOX_ON_FOURTH_TAB = By.xpath("/html/body/div[1]/section[2]/div[4]/aside/ul/li[1]/label");
    /** Чекбокс "Чувство прекрасного" на четвертой вкладке */
    public static By SECOND_CHECKBOX_ON_FOURTH_TAB = By.xpath("/html/body/div[1]/section[2]/div[4]/aside/ul/li[2]/label");

    /** Ссылка на службу поиска талантов */
    public static By HR_LINK = By.xpath("/html/body/div[1]/footer/nav/div[1]/a");
    /** Ссылка на группу в вк */
    public static By VK_LINK = By.xpath("/html/body/div[1]/footer/nav/div[2]/a");
}
