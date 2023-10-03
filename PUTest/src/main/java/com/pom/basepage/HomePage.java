package com.pom.basepage;

public class HomePage extends LoginPage {
    
	public void getpagetitle(){
	    String PageTitle = driver.getTitle();
	    System.out.println("Title Of The Page is : " +PageTitle);
	    
	}

	
}
