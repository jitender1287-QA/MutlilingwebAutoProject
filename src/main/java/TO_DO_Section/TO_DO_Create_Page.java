package TO_DO_Section;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TO_DO_Create_Page {
WebDriver driver;
public TO_DO_Create_Page (WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	
	
}
@FindBy(xpath="//span[normalize-space()='To Do']")
WebElement To_do_click;
@FindBy(xpath = "//span[@class='todo-heading-text add-todo-button']")
WebElement button;
@FindBy(xpath = "//input[@id='title']")
WebElement title_enter;
@FindBy(xpath = "//select[@id='all-projects']")
WebElement all_Project;
@FindBy(xpath = "//input[@id='startDate']")
WebElement startDate;
@FindBy(xpath = "//input[@id='endDate']")
WebElement endDate;
@FindBy(xpath = "//select[@id='project-tool']")
WebElement project_tool;
@FindBy(xpath = "//select[@id='project-priority']")
WebElement project_priority;
@FindBy(xpath = "//textarea[@id='description']")
WebElement description;
@FindBy(xpath = "//button[@type='submit']")
WebElement submit;

public void To_do_create() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	To_do_click.click();
	String tx=button.getText();
	System.out.println(tx);
	button.click();
	title_enter.sendKeys("JC New Project");
Select sel=new Select(all_Project);
sel.selectByVisibleText("JC Test Automation Ai");
startDate.sendKeys("20-08-2024");
endDate.sendKeys("20-09-2024");
Select sel1=new Select(project_tool);
sel1.selectByVisibleText("Plagiarism");
Select sel2=new Select(project_priority);
sel2.selectByVisibleText("Low");
description.sendKeys(" am new to Selenium and learning at the moment. I am trying to open footer links in selenium but it's not working on https://byjus.com/ or https://www.amazon.in I have already tried using Action class and also with Javascript by scrolling the element into view. Can someone please help me achieve it. Thanks in advance. ");
submit.click();
}
}
