Difference(int[] elements) {
    this.elements = elements;
}

void computeDifference() {
    int min = elements[0];
    int max = elements[0];

    for (int i = 1; i < elements.length; i++) {
        if (elements[i] < min) {
            min = elements[i];
        } else if (max < elements[i]) {
            max = elements[i];
        }
    }

    maximumDifference = max - min;
}
