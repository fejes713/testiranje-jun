package z2;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver" ,  "/Applications/chromedriver");

            ChromeDriver driver = new ChromeDriver(); //init chrome driver
            driver.get("file:/Users/stefanfejes/Downloads/jun_2020/zadatak4.html");

            WebElement naziv = driver.findElement(By.xpath("/html/body/div/form/input[1]"));
            naziv.sendKeys("ImeIme");

            WebElement godina = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
            godina.sendKeys("2000");

            WebElement cena = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
            cena.sendKeys("300");

            WebElement dodaj = driver.findElement(By.xpath("/html/body/div/form/button"));
            dodaj.click();

            String dodatElementNaziv = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[4]/td[1]")).getText();


            // u tabeli
            Assert.assertEquals(dodatElementNaziv, "ImeIme");

            // pretraga
            WebElement pretraga = driver.findElement(By.xpath("/html/body/div/input"));
            pretraga.sendKeys("ImeIme");

            // proveriti pretragu dal radi
            String nazivPretraga = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]")).getText();
            Assert.assertEquals(nazivPretraga, "ImeIme");

            pretraga.clear();

            WebElement obrisiPrvi = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[4]/a"));
            obrisiPrvi.click();

            String prviElementNakonBrisanja = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[1]")).getText();
            Assert.assertEquals("Treba da bude Bordeaux red", "Bordeaux red", prviElementNakonBrisanja);

        }
}
