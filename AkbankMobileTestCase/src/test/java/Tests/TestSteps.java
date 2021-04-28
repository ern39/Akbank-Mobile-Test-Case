package Tests;

import PageModels.TestDetailsModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class TestSteps {
    TestDetailsModel model = new TestDetailsModel();

    @Step("Click menu bar on upper right corner")
    public void clickMenuBar() {
        model.clickMenuBar();
    }

    @Step("Click 'ATM' at the bottom of screen")
    public void clickButtonAtm() {
        model.clickButtonAtm();
    }

    @Step("Click on the third ATM option")
    public void clickThirdOptionAtm() {
        model.clickThirdOptionAtm();
    }

    @Step("Click 'Yol Tarifi'")
    public void clickLocation() {
        model.clickLocation();
    }

    @Step("Check Google Maps is opened for directions")
    public void checkForDirections() {
        Assert.assertTrue("Google maps can not be opened!",model.checkForDirections());
    }

    @Step("Check that <key> is seen")
    public void checkTitle(String key) {
        Assert.assertTrue(model.checkTitle(key));
    }

    @Step("Then click 'En yakın Akbank'")
    public void clickNearestAkbank() {
        model.clickNearestAkbank();
    }

    @Step("Check that your location is shown correctly")
    public void checkCurrentLocation() { Assert.assertTrue("Your location is not found!",model.checkCurrentLocation()); }
}
