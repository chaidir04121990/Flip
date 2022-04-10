package FlipWeb;

import TestAutomation.Config;
import TestAutomation.PageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LangToEnglish extends Config {
    @Test
    public void english() throws InterruptedException {
        System.out.println("to english");
        PageObject.Init_PageObject().landingPage();
        PageObject.Init_PageObject().BTNloginisEnabled();
        PageObject.Init_PageObject().ClickBTNlogin();
        PageObject.Init_PageObject().loginPage();
        if (PageObject.Init_PageObject().LangDropdown()){
            Assert.assertEquals(PageObject.Init_PageObject().getText_list(),"Indonesia");
        }
        PageObject.Init_PageObject().clickLangDropdown();
        if (PageObject.Init_PageObject().EngisDisplayed()){
            PageObject.Init_PageObject().clickEng();
        }
        Assert.assertEquals(PageObject.Init_PageObject().englishPage(),"Hello there!");

        Thread.sleep(3000);
    }
}
