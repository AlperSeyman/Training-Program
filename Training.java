
public class Training {
	private int burpee;
	private int push_up;
	private int sit_up;
	private int squat;
	
	public Training(int burpee, int push_up, int sit_up, int squat) {
		this.burpee = burpee;
		this.push_up = push_up;
		this.sit_up = sit_up;
		this.squat = squat;
	}
	
	public int getBurpee() {
		return burpee;
	}
	public void setBurpee(int burpee) {
		this.burpee = burpee;
	}
	
	public int getPushup() {
		return push_up;
	}
	public void setPushup(int push_up) {
		this.push_up = push_up;
	}
	
	public int getSitup() {
		return sit_up;
	}
	
	public void setSitup(int sit_up) {
		this.sit_up = sit_up;
	}
	
	public int getSquat() {
		return squat;
	}
	
	public void setSquat(int squat) {
		this.squat = squat;
	}
	
	public void do_exercise(String exercise, int reps) {
		if (exercise.equals("Burpee")) {
			
			do_burpee(reps);
		}
		else if (exercise.equals("Push Up")) {
					
			do_pushUp(reps);
		}
		else if (exercise.equals("Sit Up")) {
			
			do_sitUp(reps);
		}
		else if (exercise.equals("Squat")) {
			
			do_squat(reps);
		}
		else {
			System.out.println("Invalid Exercise");
		}
	}
	public void do_burpee(int reps) {
		if(this.burpee == 0) {
			System.out.println("You have completed Burpee exercise");
		}
		else {
			this.burpee = this.burpee - reps;
			System.err.println("Current Reps : "+ this.burpee);
		}
	}
	
	public void do_pushUp(int reps) {
		if(this.burpee == 0) {
			System.out.println("You have completed Burpee exercise");
		}
		else {
			this.push_up = this.push_up - reps;
			System.err.println("Current Reps : "+ this.push_up);
		}
	}
	
	public void do_sitUp(int reps) {
		if(this.burpee == 0) {
			System.out.println("You have completed Burpee exercise");
		}
		else {
			this.sit_up = this.sit_up - reps;
			System.err.println("Current Reps : "+ this.sit_up);
		}
	}
	
	public void do_squat(int reps) {
		if(this.burpee == 0) {
			System.out.println("You have completed Burpee exercise");
		}
		else {
			this.squat = this.squat - reps;
			System.err.println("Current Reps : "+ this.squat);
		}
	}
	
	public  boolean train_is_over() {
		
		    return (this.burpee == 0) && (this.push_up == 0) && (this.sit_up == 0) && (this.squat == 0);
	}
}
