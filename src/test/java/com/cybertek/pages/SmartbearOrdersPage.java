package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartbearOrdersPage {
    public SmartbearOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='cornerLeft']")
    public WebElement OrderHeader;

    @FindBy(name = "ctl00$MainContent$fmwOrder$ddlProduct")
    public WebElement DropdownMenu;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement Quantitybox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement Customernamebox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement citybox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement statebox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipcodebox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement VisaradioButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberBox;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expirationdatebox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processbutton;



}
