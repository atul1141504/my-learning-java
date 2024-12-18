package codingExercises3Three;

public class Ex_5_WeatherAdvisory {

	private int temperature;
	public Ex_5_WeatherAdvisory(int temperature) {
		this.temperature = temperature;
	}
	
    public String provideWeatherAdvisory() {
        // TODO: Provide a weather advisory message based on the temperature.
        if (this.temperature<0){
            return "It's freezing! Wear a heavy coat.";
        }
        if (this.temperature>=0 && this.temperature <= 10){
            return "It's cold! Bundle up.";
        }
        if (this.temperature>=11 && this.temperature <= 20){
            return "It's cool! A light jacket will do.";
        }
        if (this.temperature>=21){
            return "It's warm! Enjoy the day.";
        }
        return "Invalid Data entered!";
    }
}
