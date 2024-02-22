import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SiteTest{

    @Test
    @Order(1)
    //Открытие главной страницы сайта
    public void openSiteTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//div[@class='b-title']").shouldBe(visible);
        sleep(2000);
    }

    @Test
    @Order(2)
    //Нажатие на раздел «Акции и скидки»
    public void discountTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/aktsii-i-skidki/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Акции и скидки"));
        sleep(2000);
    }

    @Test
    @Order(3)
    //Нажатие на раздел «Гарантия низкой цены»
    public void lowPriceTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/garantiya-nizkoy-tseni/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("ГАРАНТИЯ НИЗКОЙ ЦЕНЫ"));
        sleep(2000);
    }

    @Test
    @Order(4)
    //Нажатие на раздел «Оплата и доставка»
    public void deliveryTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/oplata-i-dostavka/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Оплата и доставка"));
        sleep(2000);
    }

    @Test
    @Order(5)
    //Нажатие на раздел «Статьи»
    public void blogTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/stati/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Статьи"));
        sleep(2000);
    }

    @Test
    @Order(6)
    //Нажатие на раздел «Галерея»
    public void galleryTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/galereya/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Галерея"));
        sleep(2000);
    }

    @Test
    @Order(7)
    //Нажатие на раздел «Сотрудничество»
    public void companyTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/sotrudnichestvo/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Сотрудничество"));
        sleep(2000);
    }

    @Test
    @Order(8)
    //Нажатие на раздел «Контакты»
    public void contactsTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/kontakti/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Контакты"));
        sleep(2000);
    }

    @Test
    @Order(9)
    //Выбор «Акционные товары»
    public void catalogTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(visible)
                .shouldBe(innerText("Акционные товары"));
        sleep(2000);
    }


    @Test
    @Order(10)
    //Нажатие на кнопку «Купить» товара «5-HTP 100мг, 60капс.»
    public void buyTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//input[@data-product='4738']").click();
        $x("//span[@class='b-count']").shouldBe(innerText("1"));
        sleep(2000);
    }

    @Test
    @Order(11)
    //Нажатие на кнопку «Оформить»
    public void cartTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//input[@data-product='4738']").click();
        $x("//a[@href='/cart/']").click();
        $x("//tr[@id='cart-Product4738']").shouldBe(visible);
        $x("//a[@href='/cart/?change%5BProduct4738%5D=0']").click();
        sleep(2000);
    }

    @Test
    @Order(12)
    //Выбор радиокнопки «Почтой России» в способе доставки
    public void deliveryMethodTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//input[@data-product='4738']").click();
        $x("//a[@href='/cart/']").click();
        $x("//input[@id='OrderForm_delivery'][@value='4']").click();
        $x("//input[@id='OrderForm_delivery'][@value='4']").shouldBe(attribute("checked"));
        $x("//a[@href='/cart/?change%5BProduct4738%5D=0']").click();
        sleep(2000);
    }

    @Test
    @Order(13)
    //Выбор радиокнопки «Наложенным платежом» в способе оплаты
    public void deliveryPayTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//input[@data-product='4738']").click();
        $x("//a[@href='/cart/']").click();
        $x("//input[@id='OrderForm_delivery'][@value='4']").click();
        $x("//input[@id='OrderForm_payment'][@value='8']").click();
        $x("//input[@id='OrderForm_payment'][@value='8']").shouldBe(attribute("checked"));
        $x("//a[@href='/cart/?change%5BProduct4738%5D=0']").click();
        sleep(2000);
    }

    @Test
    @Order(14)
    //Нажатие на кнопку «Отправить» в меню корзины
    public void checkoutTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//input[@data-product='4738']").click();
        $x("//a[@href='/cart/']").click();
        $x("//button[@name='order']").click();
        $x("//div[@class='errorSummary']").shouldBe(visible);
        $x("//a[@href='/cart/?change%5BProduct4738%5D=0']").click();
        sleep(2000);
    }

    @Test
    @Order(15)
    //Ввод «Подарочный сертификат» в поле поиска
    public void searchTest() {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//*[@id='q']").setValue("Подарочный сертификат");
        $x("//*[@id='site-search']/div/form/button").click();
        $x("//a[@href='/shop/podarochnie-sertifikati-power-mag/podarochniy-sertifikat-5000-r.html']").shouldBe(visible);
        sleep(2000);
    }

    @Test
    @Order(16)
    //Нажатие на кнопку «Войти»
    public void signInTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//*[@id='header-login-cart']/div[1]/span[1]/a").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(Condition.visible)
                .shouldBe(innerText("Вход на сайт"));
        sleep(2000);
    }

    @Test
    @Order(17)
    //Нажатие на кнопку «Регистрация»
    public void singUpTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//*[@id='header-login-cart']/div[1]/span[2]/a").click();
        $x("//div[@class='b-page-title']")
                .shouldBe(Condition.visible)
                .shouldBe(innerText("Регистрация на сайте"));
        sleep(2000);
    }

    @Test
    @Order(18)
    //Выбор сортировки «По цене» в каталоге товаров
    public void sortByPriceTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//a[@href='/shop/aktsionnie-tovari/?sort=price']").click();
        $x("/html/body/div/div[2]/div[2]/div/div[3]/ul[2]/li[3]").shouldBe(visible);
        sleep(2000);
    }

    @Test
    @Order(19)
    //Переход на 2 страницу каталога товаров
    public void paginationTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//a[@href='/shop/aktsionnie-tovari/?page=2']").click();
        $x("//*[@id='yw0']/li[4]").shouldBe(visible);
        sleep(2000);
    }

    @Test
    @Order(20)
    //Удаление товара «5-HTP 100мг, 60капс.» из корзины
    public void deleteCartTest()
    {
        Configuration.pageLoadTimeout = 60000;
        open("https://power-mag.ru/");
        $x("//a[@href='/shop/aktsionnie-tovari/']").click();
        $x("//input[@data-product='4738']").click();
        $x("//a[@href='/cart/']").click();
        $x("//a[@href='/cart/?change%5BProduct4738%5D=0']").click();
        $x("//*[@id=\"cart\"]/p").shouldBe(innerText("В вашей корзине пусто."));
        sleep(2000);
    }

}
