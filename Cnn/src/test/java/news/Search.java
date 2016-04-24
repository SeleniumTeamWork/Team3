package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Created by rrt on 4/23/2016.
 */
public class Search extends CommonAPI{

    @Test
    public void searchNews() throws InterruptedException{
        System.out.println(System.getenv().toString());
        clickByCss("#search-button");
        Thread.sleep(1000);
        typeByCss("#search-input-field", "Politics");
        takeEnterKeys("#search-input-field");
        Thread.sleep(3000);

    }
}
