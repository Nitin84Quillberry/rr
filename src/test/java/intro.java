import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class intro {
    public static void main(String[] args) throws InterruptedException {

        /*setting driver behavior by using options*/
        ChromeOptions options = new ChromeOptions();
        options.setImplicitWaitTimeout(Duration.ofSeconds(30));
        options.setAcceptInsecureCerts(true);


        WebDriver driver = new ChromeDriver(options);
//        driver.manage().deleteAllCookies(); /* deleting cookies before the browser starts*/

        driver.get("https://rahulshettyacademy.com/practice-project");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        String b = driver.getTitle();
        System.out.println("url= " + url);
        System.out.println("title= " + b);
        driver.findElement(By.id("name")).sendKeys("abc");
        driver.findElement(By.id("email")).sendKeys("nitnkohli@gmail.com");
        driver.findElement(By.id("form-submit")).click();
        driver.findElement(By.linkText("Automation Practise - 2")).click();

        /* Radio buttons */

        List<WebElement> radiobuttons = driver.findElements(By.xpath("//*[@name='radioButton']"));
        radiobuttons.stream().forEach(i -> i.click());

//        System.out.println(radiobuttons.size());
//        for (int i = 0; i < radiobuttons.size(); i++) {
//            radiobuttons.get(i).click();
////            Thread.sleep(1000);
//        }
//        driver.findElement(By.xpath("//*[@type='text'][@id='autocomplete']")).sendKeys("Sample text");
//
//        Select drp = new Select(driver.findElement(By.id("dropdown-class-example")));
//        drp.selectByValue("option3");
////        Thread.sleep(1000);
//
//        List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
//        for (int i = 0; i < checkbox.size(); i++) {
//            System.out.println(checkbox.get(i).getText());
//            checkbox.get(i).click();
////            Thread.sleep(1000);
//        }
//
//        driver.findElement(By.id("opentab")).click();
//        Set<String> tabs = driver.getWindowHandles();
//        Iterator<String> It = tabs.iterator();
//        String parentID = It.next();
//        String ChildID = It.next();
//        driver.switchTo().window(ChildID);
//        driver.manage().window().maximize();
////        System.out.println(driver.getTitle());
//        System.out.println(driver.getTitle());
//       String sp=driver.getTitle().split("-")[1].trim().split(",")[0];
//        System.out.println(sp);
//        driver.navigate().refresh();
//        driver.switchTo().window(parentID);
//
//        driver.findElement(By.id("name")).sendKeys("abcdefghijklm");
//        driver.findElement(By.id("alertbtn")).click();
//        Thread.sleep(4000);
//        driver.switchTo().alert().accept();
//        driver.findElement(By.id("confirmbtn")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();
//        Thread.sleep(3000);

        /* drag and drop*/

//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//        driver.manage().window().maximize();
//        WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
//        driver.switchTo().frame(frame);
//        Actions a = new Actions(driver);
//        WebElement source = driver.findElement(By.xpath("//*[@src='images/high_tatras_min.jpg']"));
//        WebElement target = driver.findElement(By.id("trash"));
//        a.dragAndDrop(source, target).build().perform();
//        Thread.sleep(5000);

        /*Mouse Hover Example*/

//        Actions a = new Actions(driver);
//        WebElement mouseHover = driver.findElement(By.id("mousehover"));
//        a.scrollToElement(mouseHover).build().perform();
//        a.moveToElement(mouseHover).build().perform();
//        Thread.sleep(10000);
//        Actions a = new Actions(driver);
//        WebElement footer = driver.findElement(By.xpath("//*[@id='gf-BIG']//table/tbody/tr/td[1]/ul"));
//        a.scrollToElement(footer).build().perform();
//        List<WebElement> tags = footer.findElements(By.tagName("a"));
//        for (int i = 0; i < tags.size(); i++) {
//            String keyboardaction = Keys.chord(Keys.CONTROL, Keys.ENTER);
//            tags.get(i).sendKeys(keyboardaction);
//            Thread.sleep(3000);
//        }
//        Set<String> openwidows = driver.getWindowHandles();
//        Iterator<String> It = openwidows.iterator();
//        while (It.hasNext()) {
//            driver.switchTo().window(It.next());
//            Thread.sleep(3000);
//            System.out.println(driver.getTitle());
//        }

        /*Fetch data from table */
//        Actions a = new Actions(driver);
//        WebElement table = driver.findElement(By.xpath("//*[@class='tableFixHead']"));
//        a.scrollToElement(table).build().perform();
////        Thread.sleep(3000);
//        int numberstotal = 0;
//        List<WebElement> listofnumbers = driver.findElements(By.xpath("//*[@class='tableFixHead']//table//tbody//tr//td[4]"));
//        List<String> orignalList=listofnumbers.stream().map(s-> s.getText()).collect(Collectors.toList());
//        System.out.println(orignalList);
//        List<String> Sorted=orignalList.stream().sorted().collect(Collectors.toList());
//        System.out.println(Sorted);
/*use iether above or below for loops */
//        for (int i = 0; i < listofnumbers.size(); i++) {
//            int numbers = Integer.parseInt(listofnumbers.get(i).getText());
////
//            numberstotal = numberstotal + numbers;
//        }
//        System.out.println(numberstotal);
//        String Actual = driver.findElement(By.xpath("//*[@class='totalAmount']")).getText().split(":")[1].trim();
//        Assert.assertEquals(numberstotal, Integer.parseInt(Actual));
        driver.quit();
    }
}
