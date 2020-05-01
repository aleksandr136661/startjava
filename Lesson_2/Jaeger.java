public class Jaeger {

	private String modelName;
	private String mark;
	private float weight;
	private float height;
	private String origin;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String searchEnemy() {
		System.out.println("Выполняется поиск врагов.");
		return "";
	}

	public void shoot(String enemy) {
		System.out.println("Выполняется стрельба по врагам.");
	}

	public void move(String points) {
		System.out.println("Робот передвигается по маршруту.");
	}
}