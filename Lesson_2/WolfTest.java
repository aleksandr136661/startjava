public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender("Самец");
		wolf.setName("Акела");
		wolf.setWeight(75f);
		wolf.setAge(8);
		wolf.setColor("Белый");

		System.out.println("Пол - " + wolf.getGender());
		System.out.println("Кличка - " + wolf.getName());
		System.out.println("Вес - " + wolf.getWeight());
		System.out.println("Возраст - " + wolf.getAge());
		System.out.println("Окрас - " + wolf.getColor());

		wolf.walk();
		wolf.sit();
		wolf.hawl();
		wolf.run();
		wolf.hunt();
	}
}