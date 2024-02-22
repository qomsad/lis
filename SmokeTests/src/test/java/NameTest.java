import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class NameTest
{
    @Test
    public void test()
    {
        open("https://ya.ru/");
        $x("//input[@id='text']").setValue("Кориков Павел Дмитриевич").pressEnter();
        sleep(3000);
    }

}
