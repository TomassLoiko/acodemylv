package hooks;


import io.cucumber.java.After;
import utils.LocalDriverManager;

public class Hook {
    @After
    public void  tearDown() {
        LocalDriverManager.closeDriver();

    }


}
