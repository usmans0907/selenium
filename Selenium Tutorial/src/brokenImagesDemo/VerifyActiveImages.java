package brokenImagesDemo;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;

public class VerifyActiveImages {
	
	int invalidImageCount;
	
	public void verifyimageActive(WebElement imgElement) throws ClientProtocolException, IOException {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			HttpResponse response = client.execute(request);
			
			if (response.getStatusLine().getStatusCode() != 200)
				invalidImageCount++;
		} 
}
