package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {

    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "search_query")
    public WebElement searchbox;

    @FindBy(xpath = "//span[@class='etsy-icon wt-nudge-b-1']")
    public WebElement searchbutton;


}
