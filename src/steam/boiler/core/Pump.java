package steam.boiler.core;

public class Pump {

	private boolean isOn;
	private boolean isControllerOn;
	private double pumpCapacity;

	public boolean isOn() {
		return isOn;
	}

	public boolean isControllerOn() {
		return isControllerOn;
	}

	public double getPumpCapacity() {
		return pumpCapacity;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void setControllerOn(boolean isControllerOn) {
		this.isControllerOn = isControllerOn;
	}

	public void setPumpCapacity(double pumpCapacity) {
		this.pumpCapacity = pumpCapacity;
	}

}
