package seleniumeasyteste.elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By allExamples = By.xpath("//*[@id=\"treemenu\"]/li/i");
	private By inputForms = By.xpath("//i[@class='tree-indicator glyphicon glyphicon-chevron-down']");
	private By simpleFormDemo = By.xpath("//a[@href='./basic-first-form-demo.html']");
	private By checkboxDemo = By.xpath("//a[@href='./basic-checkbox-demo.html']");
	private By radioButtonsDemo = By.xpath("//a[@href='./basic-radiobutton-demo.html']");
	private By lightboxClose = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");
	// simpleformdemo
	private By userMessage = By.id("user-message");
	private By button = By.xpath("//*[@id=\"get-input\"]/button");
	private By sum1 = By.id("sum1");
	private By sum2 = By.id("sum2");
	private By button2 = By.xpath("//*[@id=\"gettotal\"]/button");
	// checkboxdemo
	private By isAgeSelected = By.id("isAgeSelected");
	private By check1 = By.id("check1");
	private By cb1element = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input");
	// radiobuttonsdemo
	private By male = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
	private By buttoncheck = By.id("buttoncheck");
	private By female = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input");
	private By ageGroup = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input");
	private By getVallues = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");

	public By getInputForms() {
		return inputForms;
	}

	public By getSimpleFormDemo() {
		return simpleFormDemo;
	}

	public By getCheckboxDemo() {
		return checkboxDemo;
	}

	public By getRadioButtonsDemo() {
		return radioButtonsDemo;
	}

	public By getLightboxClose() {
		return lightboxClose;
	}

	public By getUserMessage() {
		return userMessage;
	}

	public By getButton() {
		return button;
	}

	public By getSum1() {
		return sum1;
	}

	public By getSum2() {
		return sum2;
	}

	public By getButton2() {
		return button2;
	}

	public By getIsAgeSelected() {
		return isAgeSelected;
	}

	public By getCheck1() {
		return check1;
	}

	public By getCb1element() {
		return cb1element;
	}

	public By getMale() {
		return male;
	}

	public By getButtoncheck() {
		return buttoncheck;
	}

	public By getFemale() {
		return female;
	}

	public By getAgeGroup() {
		return ageGroup;
	}

	public By getGetVallues() {
		return getVallues;
	}

	public By getAllExamples() {
		return allExamples;
	}

}
