
import com.mytest.mytestapp.homePage;
import com.mytest.mytestapp.zipCodeDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import static com.mytest.mytestapp.creditApplicationDetails.*;
import static com.mytest.mytestapp.employmentInformation.employerName;
import static com.mytest.mytestapp.employmentInformation.employmentStatus;
import static com.mytest.mytestapp.employmentInformation.jobTitle;
import static com.mytest.mytestapp.employmentInformation.startDate;
import static com.mytest.mytestapp.employmentInformation.employerPhone;
import static com.mytest.mytestapp.employmentInformation.monthlyIncome;
import static com.mytest.mytestapp.employmentInformation.nextButton;
import static com.mytest.mytestapp.kiaForte.*;
import static com.mytest.mytestapp.kiaModels.forte;
import static com.mytest.mytestapp.selectMake.kia;
import static java.util.concurrent.TimeUnit.SECONDS;

public class MyFirstTest {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www-staging.autogravity.com/");
        homePage.nextButton(driver).click();

        driver.manage().timeouts().implicitlyWait(3, SECONDS);
        Actions builder = new Actions(driver);
        kia(driver);
        builder.moveToElement(kia).build().perform();
        kia.click();

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        forte(driver);
        builder.moveToElement(forte).build().perform();
        forte.click();

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        WebElement zipCode = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div[1]/div[1]/input"));
        builder.moveToElement(zipCode).build().perform();
        zipCode.click();
        zipCode.sendKeys( "92660");
        zipCodeDialog.findButton(driver).click();

        driver.manage().timeouts().implicitlyWait(3, SECONDS);
        sForteAuto(driver);
        builder.moveToElement(sForteAuto).build().perform();
        sForteAuto.click();

        driver.manage().timeouts().implicitlyWait(6, SECONDS);
        sForteAutoNext(driver);
        builder.moveToElement(sForteAutoNext).build().perform();
        sForteAutoNext.click();

        driver.manage().timeouts().implicitlyWait(3, SECONDS);
        sForteAutoLeaseNext(driver);
        builder.moveToElement(sForteAutoLeaseNext).build().perform();
        sForteAutoLeaseNext.click();

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        firstName(driver);
        builder.moveToElement(firstName).build().perform();
        firstName.click();
        firstName.sendKeys( "Homer J");

        lastName(driver);
        builder.moveToElement(lastName).build().perform();
        lastName.click();
        lastName.sendKeys("Simpson");

        dateOfBirth(driver);
        builder.moveToElement(dateOfBirth).build().perform();
        dateOfBirth.click();
        dateOfBirth.sendKeys("10011935");

        mobileNumber(driver);
        builder.moveToElement(mobileNumber).build().perform();
        mobileNumber.click();
        mobileNumber.sendKeys("4243464416");

        email(driver);
        builder.moveToElement(email).build().perform();
        email.click();

        int ran;
        ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
        email.sendKeys("username"+ran+"@thesimpsons.com");

        password(driver);
        builder.moveToElement(password).build().perform();
        password.click();
        password.sendKeys("iloveD0nuts");

        confirmPassword(driver);
        builder.moveToElement(confirmPassword).build().perform();
        confirmPassword.click();
        confirmPassword.sendKeys("iloveD0nuts");

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        createAndContinueButton(driver);
        builder.moveToElement(createAndContinueButton).build().perform();
        createAndContinueButton.click();

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        residenceStatus(driver);
        builder.moveToElement(residenceStatus).build().perform();
        residenceStatus.click();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        WebElement residenceStatus2 = driver.findElement(By.cssSelector("body > div:nth-child(22) > div > div > div > div:nth-child(1) > span > div > div"));
        residenceStatus2.click();

        Thread.sleep(1000);
        address(driver);
        builder.moveToElement(address).build().perform();
        address.click();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        address.sendKeys("15495 sand canyon avenue, Irvine, CA, United States");

        addressZipCode(driver);
        builder.moveToElement(addressZipCode).build().perform();
        addressZipCode.click();
        addressZipCode.sendKeys("92618");

        city(driver);
        builder.moveToElement(city).build().perform();
        city.click();
        city.sendKeys("Irvine");

        state(driver);
        builder.moveToElement(state).build().perform();
        state.click();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        WebElement state2 = driver.findElement(By.cssSelector("body > div:nth-child(23) > div > div > div > div:nth-child(5) > span > div > div"));
        state2.click();

        moveInDate(driver);
        builder.moveToElement(moveInDate).build().perform();
        Thread.sleep(1000);
        moveInDate.click();
        moveInDate.sendKeys("012000");

        mortgageRent(driver);
        builder.moveToElement(mortgageRent).build().perform();
        driver.manage().timeouts().implicitlyWait(1, SECONDS);
        mortgageRent.click();
        mortgageRent.sendKeys("2000");

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        residenceNextButton(driver);
        builder.moveToElement(residenceNextButton).build().perform();
        residenceNextButton.click();

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        employmentStatus(driver);
        builder.moveToElement(employmentStatus).build().perform();
        employmentStatus(driver).click();
        driver.manage().timeouts().implicitlyWait(6, SECONDS);
        WebElement employmentStatus2 = driver.findElement(By.cssSelector("body > div:nth-child(23) > div > div > div > div:nth-child(1) > span > div > div > div"));
        employmentStatus2.click();

        Thread.sleep(1000);
        employerName(driver);
        builder.moveToElement(employerName).build().perform();
        driver.manage().timeouts().implicitlyWait(3, SECONDS);
        employerName.click();
        employerName.sendKeys("Springfield Nuclear Power Plant");

        jobTitle(driver);
        builder.moveToElement(jobTitle).build().perform();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        jobTitle.click();
        jobTitle.sendKeys("Safety Inspector");

        startDate(driver);
        builder.moveToElement(startDate).build().perform();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        startDate.click();
        startDate.sendKeys("012000");

        employerPhone(driver);
        builder.moveToElement(employerPhone).build().perform();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        employerPhone.click();
        employerPhone.sendKeys("4243464416");

        monthlyIncome(driver);
        builder.moveToElement(monthlyIncome).build().perform();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        monthlyIncome.click();
        monthlyIncome.sendKeys("20000");

        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        nextButton(driver);
        builder.moveToElement(nextButton).build().perform();
        nextButton.click();

    }

}

