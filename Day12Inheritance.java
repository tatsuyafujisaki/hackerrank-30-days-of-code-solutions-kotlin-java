class Student extends Person {
    private final int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    char calculate() {
        double average = Arrays.stream(testScores).average().orElseThrow(IllegalArgumentException::new);

        if (average >= 90) {
            return 'O';
        }

        if (average >= 80) {
            return 'E';
        }

        if (average >= 70) {
            return 'A';
        }

        if (average >= 55) {
            return 'P';
        }

        if (average >= 40) {
            return 'D';
        }

        return 'T';
    }
}
