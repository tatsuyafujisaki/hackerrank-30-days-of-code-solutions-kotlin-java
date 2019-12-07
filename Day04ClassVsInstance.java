public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }

    public void amIOld() {
        System.out.println(age < 13 ? "You are young." : age < 18 ? "You are a teenager." : "You are old.");
    }

    public void yearPasses() {
        age++;
    }
}
