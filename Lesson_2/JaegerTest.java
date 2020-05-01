public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Bracer Phoenix");
		jaeger1.setMark("Mark-5");
		jaeger1.setWeight(2.128f);
		jaeger1.setHeight(70.91f);
		jaeger1.setOrigin("China");

		Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("Coyote Tango");
		jaeger2.setMark("Mark-1");
		jaeger2.setWeight(2.312f);
		jaeger2.setHeight(85.34f);
		jaeger1.setOrigin("Japan");

		jaeger1.move("3245667880:7829008040;3245667900:7829008340");
		String enemy = jaeger1.searchEnemy();
		jaeger1.shoot(enemy);
		jaeger2.move("3245667900:7829008340");
		jaeger2.setWeight(1.9f);
		jaeger2.setHeight(103.5f);
		System.out.println(jaeger2.getModelName() + " - рост: " + jaeger2.getHeight());
		System.out.println(jaeger2.getModelName() + " - вес: " + jaeger2.getWeight());
	}
}