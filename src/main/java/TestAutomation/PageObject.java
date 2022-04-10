package TestAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObject extends Config{
    @FindBy(xpath = "//button[text()=\"Masuk\"]")
    WebElement BTNlogin;

    @FindBy(xpath = "//html[@class=\"notranslate\"]")
    WebElement LandPage;

    @FindBy(xpath = "//div[@class=\"content-container col-xl-6 col-lg-7 col-md-8 col-sm-12 col-12\"]")
    WebElement PageLogin;

    @FindBy(xpath = "//div[@class=\"navbar-nav\"]/div/div")
    WebElement Language_Dropdown;

    @FindBy(xpath = "//div[@class=\"navbar-nav\"]/div/div/div/div/div/div")
    WebElement Dropdown_text;

    @FindBy(xpath = "//li[@value=\"en\"]")
    WebElement English_Lang;

    @FindBy(xpath = "//div[@class=\"sc-hcmgZB bsqFum\"]/h2")
    WebElement loginPageEng;

    @FindBy(xpath = "//html[@class=\"fc-widget-small\"]")
    WebElement chatbot;

    @FindBy(xpath = "//div[@class=\"viewport h-chat-custom h-open\"]")
    WebElement chatbotOpen;

    @FindBy(xpath = "//div[@class=\"search-category\"]")
    WebElement chatbotSearch;

    @FindBy(xpath = "//input[@placeholder=\"Search for Answers\"]")
    WebElement input_search;

    @FindBy(xpath = "//div[@class=\"article-lists-sections animated fadeIn faster\"]")
    WebElement Search_List_Result;

    @FindBy(xpath = "//ul[@class=\"list-section scroll-section search-result \"]/li[2]/div/span[text()=\"Bank yang di Support oleh Flip\"]")
    WebElement Bank_Support;

    @FindBy(xpath = "//div[@class=\"modal-body \"]/p")
    WebElement TextBody;


    public static PageObject Init_PageObject(){
        PageObject po = new PageObject();
        PageFactory.initElements(driver,po);
        return po;
    }

    public boolean landingPage(){
        LandPage.isDisplayed();
        System.out.println("This is Landing Page");
        return true;
    }

    public boolean loginPage(){
        PageLogin.isDisplayed();
        System.out.println("This is Login Page");
        return true;
    }

    public boolean LangDropdown(){
        Language_Dropdown.isDisplayed();
        System.out.println("Dropdown language is displayed");
        return true;
    }

    public String getText_list(){
        String dropdown_text = Dropdown_text.getText();
        System.out.println("It's Indonesia");
        return dropdown_text;
    }

    public void clickLangDropdown(){
        Language_Dropdown.click();
    }

    public boolean EngisDisplayed(){
        English_Lang.isDisplayed();
        return true;
    }

    public void clickEng(){
        English_Lang.click();
    }

    public String englishPage(){
        loginPageEng.isDisplayed();
        System.out.println("Now it's changed to English");
        String Hello_english = loginPageEng.getText();
        return Hello_english;
    }

    public boolean BTNloginisEnabled(){
        BTNlogin.isDisplayed();
        BTNlogin.isEnabled();
        System.out.println("Button is Enabled");
        return true;
    }
    public void ClickBTNlogin(){
        BTNlogin.click();
        System.out.println("Button is Clicked");
    }

    public boolean VerifyChatbot(){
        driver.switchTo().frame("fc_widget");
        chatbot.isDisplayed();
        System.out.println("chatbot is displayed");
        return true;
    }
    public void ClickChatbot(){
        chatbot.click();
        System.out.println("Chatbot is clicked");
    }

    public void parentFrame(){
        driver.switchTo().defaultContent();
    }

    public void iframeWidget(){
        driver.switchTo().frame("fc_widget");
    }
    public boolean VerifyChatbotOpen(){
        driver.switchTo().frame("fc_widget");
        chatbotOpen.isDisplayed();
        System.out.println("Chatbot is open");
        return true;
    }
    public boolean Search_Chatbot(){
        chatbotSearch.isDisplayed();
        return true;
    }
    public void Click_search_chatbot(){
        chatbotSearch.click();
        System.out.println("Chatbot is clicked");
    }
    public boolean inputSearch(){
        input_search.isDisplayed();
        System.out.println("input search available");
        return true;
    }
    public void SetinputSearch(){
        input_search.sendKeys("e-Wallet");
        System.out.println("input search is written");
    }
    public boolean search_result(){
        Search_List_Result.isDisplayed();
        System.out.println("search result available");
        return true;
    }
    public boolean Bank(){
        Bank_Support.isDisplayed();
        System.out.println("Bank yang di support oleh Flip");
        return true;
    }
    public void ClickBank(){
        Bank_Support.click();
    }
    public boolean VerifyText(){
        TextBody.getText().contains("(OVO, DANA, Gopay, Shopeepay)");
        return true;
    }
}
