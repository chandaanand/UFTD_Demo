package dgrp1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException, InterruptedException {
        //Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        Browser browser = BrowserFactory.launch(BrowserType.INTERNET_EXPLORER);
        browser.sync();

        browser.navigate("http://advantageonlineshopping.com/#/");
        browser.sync();

        Link speakersCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS")
                .tagName("SPAN").build());
        speakersCategoryTxtLink.click();

        WebElement boseSoundlinkBluetoothSpeakerIIIWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("Bose Soundlink Bluetooth Speaker III")
                .tagName("A").build());
        boseSoundlinkBluetoothSpeakerIIIWebElement.click();

        EditField quantityEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("quantity")
                .tagName("INPUT")
                .type("text").build());
        quantityEditField.setValue("4");

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        /*Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("ShoppingCart")
                .innerText("2 ")
                .role("link")
                .tagName("A").build());
        shoppingCartLink.click();
        */

        Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("ShoppingCart")
                .id("shoppingCartLink")
                .innerText(new RegExpProperty("\\d+"))
                .role("link")
                .tagName("A").build());
        shoppingCartLink.click();

        MyAM appModel = new MyAM(browser);
        appModel.AdvantageShoppingPage().Total_Cart_Amt().highlight();
        Thread.sleep(5000);
        appModel.AdvantageShoppingPage().Item_Amount().highlight();
        Thread.sleep(5000);
        appModel.AdvantageShoppingPage().Total_Cart_Amt().click();
        Thread.sleep(5000);

        WebElement remCartItem = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("removeProduct iconCss iconX")
                .innerText("")
                .tagName("DIV")
                .index(0).build());
        remCartItem.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
        hOMELink.click();



        browser.close();
    }

}