package pe.saucedemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebCompra1Producto extends BaseTest{
  @Test
  public void comprar()  {
	  
	  //Realizar compra de un solo producto
	  //Ingresar datos en Login
	  driver.findElement(By.name("user-name")).sendKeys("standard_user");
	  driver.findElement(By.name("password")).sendKeys("secret_sauce");
	  driver.findElement(By.name("login-button")).submit();
	  
	  //Agregar un artículo
	  driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	  driver.findElement(By.className("shopping_cart_container")).click();
	  driver.findElement(By.name("checkout")).click();
	  
	  //Datos de compra
	  driver.findElement(By.name("firstName")).sendKeys("Prueba");
	  driver.findElement(By.name("lastName")).sendKeys("Prueba");
	  driver.findElement(By.name("postalCode")).sendKeys("51");
	  driver.findElement(By.name("continue")).click();
	  
	  //Finalizar compra
	  driver.findElement(By.name("finish")).click();
	  
	  
	  String realizado = driver.findElement(By.className("tittle")).getText();
	  String esperado = "Checkout: Complete!";
	  
	  Assert.assertEquals(realizado, esperado, "No se realizó la compra");
	  
	  
  }
}
