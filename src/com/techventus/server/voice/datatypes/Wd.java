
package com.techventus.server.voice.datatypes;

import java.util.List;
/**
 * Weekday setting of a phone
 *
 */
public class Wd{
   	private boolean allDay;
   	private List times;

 	public boolean getAllDay(){
		return this.allDay;
	}
	public void setAllDay(boolean allDay){
		this.allDay = allDay;
	}
 	public List getTimes(){
		return this.times;
	}
	public void setTimes(List times){
		this.times = times;
	}
}
