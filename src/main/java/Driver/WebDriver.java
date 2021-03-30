package Driver;

import com.codeborne.selenide.*;
import com.codeborne.selenide.proxy.SelenideProxyServer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.InetSocketAddress;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;


public class WebDriver {


    public void setup(){


        open("https://t.motorsport.tv/");
        open("https://t.motorsport.tv/");
        /**Proxy proxy = new Proxy();
        proxy.setAutodetect(false);
        proxy.setHttpProxy("148.77.34.200:54321");
        proxy.setSslProxy("148.77.34.200:54321");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy", proxy);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        capabilities.setCapability(ChromeOptions.CAPABILITY, options); **/










        //WebDriverRunner.getSelenideProxy().getProxy();
       // open("https://t.motorsport.tv/");
    }
}
