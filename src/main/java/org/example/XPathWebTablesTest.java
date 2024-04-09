package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathWebTablesTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");

        // "ADD" düğmesine tıkla
        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();

        // Yeni kayıt formunu doldur
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInput.sendKeys("Doe");

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailInput.sendKeys("johndoe@example.com");

        WebElement ageInput = driver.findElement(By.xpath("//input[@id='age']"));
        ageInput.sendKeys("30");

        WebElement salaryInput = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryInput.sendKeys("50000");

        WebElement departmentInput = driver.findElement(By.xpath("//input[@id='department']"));
        departmentInput.sendKeys("IT");

        // Kaydet düğmesine tıkla
        WebElement saveButton = driver.findElement(By.xpath("//button[@id='submit']"));
        saveButton.click();

        // Eklenen kaydı bul
        WebElement editedRecord = driver.findElement(By.xpath("//div[@role='row'][last()]"));

        // Kaydı düzenle
        WebElement editButton = editedRecord.findElement(By.xpath(".//button[text()='Edit']"));
        editButton.click();

        // Kaydı güncelle
        WebElement updatedFirstNameInput = driver.findElement(By.xpath("//input[@id='firstName']"));
        updatedFirstNameInput.clear();
        updatedFirstNameInput.sendKeys("Jane");

        WebElement updateButton = driver.findElement(By.xpath("//button[@id='submit']"));
        updateButton.click();

        driver.quit();
    }
}
