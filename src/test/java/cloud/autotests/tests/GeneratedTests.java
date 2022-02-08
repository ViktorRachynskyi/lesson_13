package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка банера главной страницы")
    void checkBannerTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("check banner", () -> {
           $(".col-12").shouldBe(visible);
        });
    }

 @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка работы поиска")
    void searchValidationTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("Нажимаем на иконку поиска", () -> {
           $(".navigation-search__icon").click();
        });

        step("Вводим в поиске значение и нажимаем Enter", () -> {
         $(".navigation-search__input").setValue("ЭДО").pressEnter();
     });

         step("Проверяем отображение страницы поиска", () -> {
         $(".col-sm-10.col-sm-offset-1").shouldBe(visible);
     });
    }

 @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка раздела 'О компании'")
    void searchCompanyInformationTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("Заходим в раздел 'О компании'", () -> {
           $(".nav-item.nav-item__have-children.nav-item-have-children").click();
        });

        step("Проверка отображения страницы", () -> {
         $(".light-blue-gray-bg.col-xs-12.nopad").scrollTo().shouldBe(visible).shouldHave(text("Разработчик и провайдер облачных сервисов для автоматизации B2B процессов управления цепочками поставок и взаиморасчетов."));
     });
    }

 @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка раздела 'Клиенты'")
    void searchClientsInformationTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("Заходим в раздел 'О компании'", () -> {
           $(".nav-item.nav-item__have-children.nav-item-have-children").click();
        });

        step("Заходим в раздел 'Клиенты'", () -> {
            $("ul[class='nav'] li:nth-child(2)").click();
     });

         step("Проверка отображения страницы 'Клиенты'", () -> {
         $(".col-xs-12.padding-bottom-20").shouldBe(visible).shouldHave(text("Финансы и бизнес"));
     });
    }

 @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка перехода на страницу клиента из раздела 'Клиенты' ")
    void goToClientPageTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("Заходим в раздел 'О компании'", () -> {
           $(".nav-item.nav-item__have-children.nav-item-have-children").click();
        });

        step("Заходим в раздел 'Клиенты'", () -> {
            $("ul[class='nav'] li:nth-child(2)").click();
     });

         step("Перейти на сайт клиента 'Газпром'", () -> {
         $$(".col-xs-6.col-md-4.bank-clients-logo").get(4).click();
     });

         step("Проверям, что мы перешли на страницу клиента 'Газпром'", () -> {
         switchTo().window(1);
         $("[id=logo]").shouldBe(visible);
     });
 }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка оформления подписки по почте")
    void subscriptionTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("Вводим email в поле", () -> {
            $("[type=email]").setValue("test@mail.com");
        });

        step("Нажимаем на подписаться", () -> {
            $("[id=b51159530]").click();
        });

        step("Проверка отображения успешного подписания", () -> {
            $(".form-message").shouldBe(visible).shouldHave(text("Спасибо! Вы подписаны на рассылку."));
        });
    }


    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка перехода на страницу авторизации продукта 'Курьер'")
    void openAutorizationProductPageTest() {
        step("Открываем сайт https://www.esphere.ru/", () -> {
            open("https://www.esphere.ru");
        });

        step("Переходим в раздел сервисов", () -> {
            $("[href='/enter']").click();
        });

        step("Переходим на страницу входа в подукт 'Курьер'", () -> {
            $$(".servise.col-xs-12.col-sm-3").get(2).click();
        });

        step("Проверка отображения страницы 'Курьера'", () -> {
            $(".login-box.inner.txt-center").shouldBe(visible).shouldHave(text("Войти в СФЕРА Курьер"));
        });
    }


    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка заголовка главной страницы")
    void titleTest() {
        step("Открываем сайт 'https://www.esphere.ru/'", () ->
                open("https://www.esphere.ru"));

        step("Заголовок страницы должен иметь текст 'СберКорус | КОРУС Консалтинг СНГ'", () -> {
            String expectedTitle = "СберКорус | КОРУС Консалтинг СНГ";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка ошибок в консоле")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт 'https://www.esphere.ru/'", () ->
                open("https://www.esphere.ru"));

        step("Журнал консоли не должны содержать текст 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}