import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.fail;

public class Shop_by {
    WebDriver driver;


    @BeforeClass
    public void initWebdriver() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver123.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        driver = new ChromeDriver(options);
    }

    @BeforeMethod
    public void startUp() {
        driver.get("https://shop.by/");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }


    @Test
    public void Chek() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ButtonComp =
                driver.findElement(By.cssSelector("#cataloglink-944 > a > span.Catalog__LinkText.Catalog__LinkHaveChild > //span.Catalog__LinkTextBlock"));
        ButtonComp.click();
        Assert.assertTrue(ButtonComp.isDisplayed(), "computer button is not displayed");

    }
        @Test
        public void Chek1() {
            driver.get("https://shop.by/kompyutery/");
            WebElement buttonNote =
                    driver.findElement(By.xpath("//a[contains(text(),'Ноутбуки')]"));
            buttonNote.click();
            Assert.assertTrue(buttonNote.isDisplayed(), "computer button is not displayed");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    @Test
        public void Chek3() {
        driver.get("https://shop.by/noutbuki/");

        WebElement box =
                driver.findElement(By.
                        xpath("//*[@id=\"Attr_prof_1000\"]/div/div[1]/div/div[3]/a/label"));
        box.click();
        Assert.assertTrue(box.isDisplayed(), "box lenovo button is not displayed");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement box1 =
                driver.findElement(By.xpath("//*[@id=\"Attr_prof_1000\"]/div/div[1]/div/div[5]/a/label"));
        box1.click();
        Assert.assertTrue(box1.isDisplayed(), "box Dell button is not displayed");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement box2 =
                driver.findElement(By.xpath("//*[@id=\"Attr_prof_1000\"]/div/div[1]/div/div[4]/a/label"));
        box2.click();
        Assert.assertTrue(box2.isDisplayed(), "box HP button is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement price =
                driver.findElement(By.xpath("//div[@id='Attr_prof_1000']/div/div/div/div[5]/a/label"));
        Assert.assertTrue(price.isDisplayed(), "price2 is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement price2 =
                driver.findElement(By.xpath("//div[@id='Attr_prof_1000']/div/div/div/div[4]/a/label"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement screen =
                driver.findElement(By.xpath("//input[@id='minnum_45']"));
        screen.click();
        Assert.assertTrue(screen.isDisplayed(), "screen is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement screen12 =
                driver.findElement(By.name("price_before"));
        screen12.clear();
        Assert.assertTrue(screen12.isDisplayed(), "screen2 is not displayed");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement screen14 =
                driver.findElement(By.name("price_before"));
        screen14.sendKeys("700");
        Assert.assertTrue(screen14.isDisplayed(), "screen14 is not displayed");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button =
                driver.findElement(By.id("maxnum_45"));
        button.click();
        Assert.assertTrue(button.isDisplayed(), "button is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement amount_of_elements =
                driver.findElement(By.name("price_after"));
        amount_of_elements.clear();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(amount_of_elements.isDisplayed(), "pick is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement price10 =
                driver.findElement(By.name("price_after"));
        price10.sendKeys("1500");
        Assert.assertTrue(price10.isDisplayed(), "price is not displayed");
// при вводе цены наблюдается баг, невозможно некоторое время ввести значения
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement size =
                driver.findElement(By.xpath("//*[@id=\"Attr_prof_5828\"]/div/div[2]/span[1]"));
        size.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement size1 =
                driver.findElement(By.xpath("//*[@id=\"ContAttr_prof_5828\"]/div[25]/a/label"));
        size1.click();
        Assert.assertTrue(size1.isDisplayed(), "size 12 is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement size2 =
                driver.findElement(By.xpath("//*[@id=\"ContAttr_prof_5828\"]/div[19]/a/label"));
        size2.click();
        Assert.assertTrue(size2.isDisplayed(), "size 13,4 is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement show =
                driver.findElement(By.xpath("//*[@id=\"ModelFilter__NumModelWindow\"]/div[1]"));
        show.click();
        Assert.assertTrue(show.isDisplayed(), "show is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Test
                public void Chek4 () {
        driver.get("https://shop.by/noutbuki/?data_mode=1&mode=find&essense_id=846&sort=price--number&price_before=700&price_after=1500&prof_1000=8991&prof_1000=1612&prof_1000=2023&prof_5828=12111&prof_5828=12346");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        WebElement quality =
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[5]/div[2]/div[3]/div/div/div[1]"));
        Assert.assertTrue(quality.isDisplayed(),("quality is not displayed"));

        WebElement sort =
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[5]/div[2]/div[3]/div/div/div[2]/div[2]"));
        sort.click();
            Assert.assertTrue(sort.isDisplayed(),("sort is not displayed"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// От этого места все поехало
        WebElement sorting =
                driver.findElement(By.xpath("//*[@id=\"selFH1_chzn\"]/span[1]/span"));
        sorting.click();
        Assert.assertTrue(sorting.isDisplayed(), "sorting is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement sorting2 =
                driver.findElement(By.xpath("//span[2]/span/b"));
        sorting2.click();
        Assert.assertTrue(sorting2.isDisplayed(), "sorting2 is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement sorting3 =
                driver.findElement(By.xpath("//li[@id='selZYR_chzn_o_2']"));
        sorting3.click();
        Assert.assertTrue(sorting3.isDisplayed(), "sorting3 is not displayed");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            public void tearDown() throws Exception {
                driver.quit();
                String verificationErrorString = verificationErrors.toString();
                if (!"".equals(verificationErrorString)) {
                    fail(verificationErrorString);
                }
            }

            private boolean isElementPresent(By by) {
                try {
                    driver.findElement(by);
                    return true;
                } catch (NoSuchElementException e) {
                    return false;
                }
            }

            private boolean isAlertPresent() {
                try {
                    driver.switchTo().alert();
                    return true;
                } catch (NoAlertPresentException e) {
                    return false;
                }
            }

            private String closeAlertAndGetItsText() {
                try {
                    Alert alert = driver.switchTo().alert();
                    String alertText = alert.getText();
                    if (acceptNextAlert) {
                        alert.accept();
                    } else {
                        alert.dismiss();
                    }
                    return alertText;
                } finally {
                    acceptNextAlert = true;
                }
            }
    }
}