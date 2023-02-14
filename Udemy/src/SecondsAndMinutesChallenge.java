
public class SecondsAndMinutesChallenge {
	public static String getDurationString(long minutes, long seconds){
		if(minutes <= 0){
			return "Invalid Value";
		}
		if(seconds <0 || seconds>59){
			return "Invaild Value";
		}
		long hours = (long)minutes/60;
		minutes = minutes - ( hours * 60 );
		if(hours<10 && minutes<10 && seconds<10){
			return "0" + hours + "h " + "0" + minutes + "m " + "0" + seconds + "s";
			
		}else if(hours<10 && minutes<10){
			return "0" + hours + "h " + "0" + minutes + "m " + seconds + "s";
			
		}else if(hours<10){
			return "0" + hours + "h " + minutes + "m " + seconds + "s";
			
		}else if(minutes<10 && seconds<10){
			return hours + "h " + "0" + minutes + "m " + "0" + seconds + "s";
			
		}else if(hours<10 && seconds<10){
			return "0" + hours + "h " + minutes + "m " + "0" + seconds + "s";
			
		}else if(seconds<10){
			return hours + "h " + minutes + "m " + "0" + seconds + "s";
			
		}
		else if(minutes<10){
			return hours + "h " + "0" + minutes + "m " + seconds + "s";
			
		}
		return hours + "h " + minutes + "m " + seconds + "s";
	}
	public static String getDurationString(long seconds){
		if(seconds <=0 || seconds>59){
			return "Invaild Value";
		}
		long minutes = (long)seconds/60;
		seconds = seconds - ( seconds * 60 );
		return getDurationString(minutes,seconds);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
