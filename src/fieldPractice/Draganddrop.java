package fieldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop extends Basepage {

	@BeforeTest
	public void Url() {

		Browser("chrome", "http://demoqa.com/droppable/");
	}

	@Test
	public void DragDrop() {

		WebElement Drag = driver.findElement(By.xpath(".//*[@id='draggableview']"));
		WebElement Drop = driver.findElement(By.xpath(".//*[@id='droppableview']"));
		DragandDrop(Drag, Drop);

	}

}
