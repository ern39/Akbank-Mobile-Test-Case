package PageModels;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;

public class TestDetailsModel extends BaseModel{
    public By btnMenuBar = By.id("com.akbank.android.apps.akbank_direkt:id/akbank_header_right_btn_icon");
    public By currentLocation = By.xpath("//android.view.View[@content-desc='Google haritası']/android.view.View[92]");
    public By title = By.id("com.akbank.android.apps.akbank_direkt:id/title");
    public By btnThirdOptionAtm = By.id("com.akbank.android.apps.akbank_direkt:id/maplistrow_image");
    public By btnNearestAkbank = By.id("com.akbank.android.apps.akbank_direkt:id/item3");
    public By btnAtm = By.id("com.akbank.android.apps.akbank_direkt:id/map_atm_selected_wrapper");
    public By btnLocation = By.id("com.akbank.android.apps.akbank_direkt:id/map_detail_fragment_btnYolTarifi");
    public By btnDirections = By.id("com.google.android.apps.maps:id/directions_endpoint_textbox");

    public boolean checkTitle(String text){
        return StringUtils.replace(getText(title), "\n", " ").equals(text);
    }

    public void clickNearestAkbank(){
        clickElement(btnNearestAkbank);
    }

    public boolean checkCurrentLocation(){
        return controlVisibleElement(currentLocation) != null;
    }

    public void clickButtonAtm(){
        clickElement(btnAtm);
    }

    public void clickMenuBar(){
        clickElement(btnMenuBar);
    }

    public void clickThirdOptionAtm(){
        checkList(btnThirdOptionAtm,2);
    }

    public void clickLocation() {
        clickElement(btnLocation);
    }

    public boolean checkForDirections(){
        return controlVisibleElement(btnDirections) != null;
    }
}
