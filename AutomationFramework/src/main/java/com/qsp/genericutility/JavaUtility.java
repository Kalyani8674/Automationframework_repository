package com.qsp.genericutility;

import java.time.LocalDateTime;

public class JavaUtility 
{
	//javalogics
	public String getSystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}
