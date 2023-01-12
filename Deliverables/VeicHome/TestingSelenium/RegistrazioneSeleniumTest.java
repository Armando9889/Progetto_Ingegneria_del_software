// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegistrazioneSeleniumTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC21() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
  }
  @Test
  public void tC22() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
    driver.close();
  }
  @Test
  public void tC23() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC24() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC25() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC26() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-12-11");
    driver.findElement(By.name("data")).sendKeys("0019-12-11");
    driver.findElement(By.name("data")).sendKeys("0193-12-11");
    driver.findElement(By.name("data")).sendKeys("1936-12-11");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC27() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-12-17");
    driver.findElement(By.name("data")).sendKeys("0019-12-17");
    driver.findElement(By.name("data")).sendKeys("0193-12-17");
    driver.findElement(By.name("data")).sendKeys("1936-12-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC28() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC29() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-12-11");
    driver.findElement(By.name("data")).sendKeys("0019-12-11");
    driver.findElement(By.name("data")).sendKeys("0193-12-11");
    driver.findElement(By.name("data")).sendKeys("1936-12-11");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC211() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-12-11");
    driver.findElement(By.name("data")).sendKeys("0019-12-11");
    driver.findElement(By.name("data")).sendKeys("0193-12-11");
    driver.findElement(By.name("data")).sendKeys("1936-12-11");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC213() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-12-17");
    driver.findElement(By.name("data")).sendKeys("0019-12-17");
    driver.findElement(By.name("data")).sendKeys("0193-12-17");
    driver.findElement(By.name("data")).sendKeys("1936-12-17");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("515792293924021933");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC214() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-12");
    driver.findElement(By.name("data")).sendKeys("0019-11-12");
    driver.findElement(By.name("data")).sendKeys("0193-11-12");
    driver.findElement(By.name("data")).sendKeys("1937-11-12");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("789654");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC215() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio465464");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC216() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("*&%45");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC217() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Nap***gs4787");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC218() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Pa287 15***R54*");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC219() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 27");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("51579v9392*0219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC220() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 27");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("1B3");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
  @Test
  public void tC221() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 27");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.id("ok")).click();
  }
  @Test
  public void tC222() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-17");
    driver.findElement(By.name("data")).sendKeys("0019-11-17");
    driver.findElement(By.name("data")).sendKeys("0193-11-17");
    driver.findElement(By.name("data")).sendKeys("1936-11-17");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("1579229392405487");
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("789");
    driver.findElement(By.id("ok")).click();
    driver.findElement(By.cssSelector("button")).click();
  }
  @Test
  public void tC223() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio38");
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("comune")).sendKeys("Napoli");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-11-12");
    driver.findElement(By.name("data")).sendKeys("0019-11-12");
    driver.findElement(By.name("data")).sendKeys("0193-11-12");
    driver.findElement(By.name("data")).sendKeys("1937-11-12");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("489");
    driver.findElement(By.id("ok")).click();
  }
  @Test
  public void tC212() {
    driver.get("http://localhost:8080/VeicHomeIS/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Registrati")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Ottavio");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Milano");
    driver.findElement(By.name("sesso")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sesso"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.name("indirizzo")).click();
    driver.findElement(By.name("indirizzo")).sendKeys("Via Palermo 25");
    driver.findElement(By.name("comune")).click();
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("data")).sendKeys("0001-12-17");
    driver.findElement(By.name("data")).sendKeys("0019-12-17");
    driver.findElement(By.name("data")).sendKeys("0193-12-17");
    driver.findElement(By.name("data")).sendKeys("1936-12-17");
    driver.findElement(By.name("data")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("prova1");
    driver.findElement(By.name("carta")).click();
    driver.findElement(By.name("carta")).sendKeys("5157922939240219");
    driver.findElement(By.name("scadenza")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.name("scadenza_anno")).click();
    {
      WebElement dropdown = driver.findElement(By.name("scadenza_anno"));
      dropdown.findElement(By.xpath("//option[. = '2027']")).click();
    }
    driver.findElement(By.name("cvv")).click();
    driver.findElement(By.name("cvv")).sendKeys("113");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("ottavio36");
    driver.findElement(By.id("ok")).click();
    assertThat(driver.switchTo().alert().getText(), is("Hai inserito dei caratteri non validi o campi mancanti"));
  }
}
