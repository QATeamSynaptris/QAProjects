/**
 * 
 */
package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

/**
 * @author Rajasekaran
 *
 */
public class VideoRecorder
{
	ATUTestRecorder recorder;
	
	public void startRecording()
	{
		  DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		  Date date = new Date();
		  		 
		  try 
		  {
			//Created object of ATUTestRecorder
			//Provide path to store videos and file name format.
			recorder = new ATUTestRecorder("\\\\10.60.11.45\\QABuild_Repository\\SeleniumProjectResources\\Recorded Video","TestVideo-"+dateFormat.format(date),false);
			//To start video recording.
			recorder.start(); 
		  }
		  catch (ATUTestRecorderException e)
		  {
			e.printStackTrace();
		  }			   
	}
	
	public void stopRecording()
	{
		//To stop video recording.
		try
		{
			recorder.stop();
		} catch (ATUTestRecorderException e)
		{
			e.printStackTrace();
		}	
	}
}
