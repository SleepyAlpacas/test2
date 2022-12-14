package main;

public class TimingPoints {
	private double startTime;
	private double beatLength;
	private int meter;
	private int inheritValue;
	/**
	 * Default constructor
	 */
	TimingPoints(){

	}
	/**
	 * A constructor which initializes its startTime, beatLength, meter,
	 * type, volume, and inherit value. 
	 * 
	 * @param startTime The starting time of the inheriting point
	 * @param beatLength The length of a beat measured in milliseconds
	 * @param meter The amount of beats in a measure
	 * @param inheritValue The amount of change in the scroll speed
	 */
	TimingPoints(double startTime, double beatLength, int meter, int inheritValue){
		this.startTime = startTime;
		this.beatLength = beatLength;
		this.meter = meter;
		this.inheritValue = inheritValue;
	}
	/**
	 * gets the beat length
	 * @return The beat length of a full beat in milliseconds if inheritValue ==1 , otherwise, a negative
	 * inverse scroll speed multiplier as a percentage.
	 */
	public double getBeatLength () {
		return beatLength;
	}
	/**
	 * gets the start time
	 * @return the starting time of the inheriting point
	 */
	public double getStartTime() {
		return startTime;
	}
	/**
	 * gets the meter
	 * @return the amount of beats in a measure
	 */
	public int getMeter() {
		return meter;
	}
	/**
	 * gets the inheriting value
	 * @return the inheriting value
	 */
	public int getInheritValue() {
		return inheritValue;
	}
}