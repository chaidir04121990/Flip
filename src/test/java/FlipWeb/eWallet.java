package FlipWeb;

import TestAutomation.Config;
import TestAutomation.PageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eWallet extends Config {

    @Test
    public void Chatbot_eWallet() throws InterruptedException {
        PageObject.Init_PageObject().landingPage();
//        Thread.sleep(5000);
        PageObject.Init_PageObject().VerifyChatbot();
        PageObject.Init_PageObject().ClickChatbot();
        PageObject.Init_PageObject().parentFrame();
//        Thread.sleep(3000);
        PageObject.Init_PageObject().VerifyChatbotOpen();
        PageObject.Init_PageObject().Search_Chatbot();
        PageObject.Init_PageObject().Click_search_chatbot();
//        Thread.sleep(3000);
        PageObject.Init_PageObject().parentFrame();
        PageObject.Init_PageObject().iframeWidget();
        PageObject.Init_PageObject().inputSearch();
        PageObject.Init_PageObject().SetinputSearch();
        PageObject.Init_PageObject().search_result();
        PageObject.Init_PageObject().Bank();
        PageObject.Init_PageObject().ClickBank();
        Thread.sleep(5000);
        PageObject.Init_PageObject().VerifyText();
    }
}
