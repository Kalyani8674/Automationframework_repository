package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qsp.genericutility.BaseClass;
import com.qsp.genericutility.ExcelUtility;
import com.qsp.objectrepositary.HomePage;

public class TC_DWS_004_Test extends BaseClass
{
	@Test
	public void clickonshoopingcart() throws EncryptedDocumentException, IOException
	{
		hp = new HomePage(driver);
		hp.getShoppingcartlink().click();
		excelLib= new ExcelUtility();
		
		String actualtitle = driver.getTitle();
		String Expectedtitle = excelLib.getStringDataFromExcel("shoppingcart", 1, 0);
		Assert.assertEquals(actualtitle,Expectedtitle,"shoppingcart page is not displayed");
		Reporter.log("shoppingcart pages is displayed",true);
	}
}
