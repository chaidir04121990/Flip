package FlipWeb;

import TestAutomation.Config;
import TestAutomation.PageObject;
import org.testng.annotations.Test;

public class Daftar extends Config {

    @Test
    public void Daftar_Sekarang() throws InterruptedException {
        PageObject.Init_PageObject().clickBTN(PageObject.Init_PageObject().BTN_daftar);
        PageObject.Init_PageObject().SignUP_Page();
    }
}
