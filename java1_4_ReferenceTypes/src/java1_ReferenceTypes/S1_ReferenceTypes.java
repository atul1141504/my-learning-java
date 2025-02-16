package java1_ReferenceTypes;

public class S1_ReferenceTypes {
	private int planetId;

	public S1_ReferenceTypes(int planetId) {
		this.setPlanetId(planetId);
	}
	
	public int getPlanetId() {
		return this.planetId;
	}

	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}

	String Planet(int planetId) {
		switch (this.planetId) {
			case 1:
				return "Earth";
			case 2:
				return "Mars";
			case 3:
				return "Jupitor";
			default:
				return "None";
		}
	}
}
