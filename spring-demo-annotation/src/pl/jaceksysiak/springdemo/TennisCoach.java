package pl.jaceksysiak.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component    // default bean tennisCoach
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
