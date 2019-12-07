static class TestDataEmptyArray {
    static int[] get_array() {
        return new int[]{};
    }
}

static class TestDataUniqueValues {
    static int[] get_array() {
        return new int[]{1, 2};
    }

    static int get_expected_result() {
        return minimum_index(get_array());
    }
}

static class TestDataExactlyTwoDifferentMinimums {
    static int[] get_array() {
        return new int[]{1, 2, 1};
    }

    static int get_expected_result() {
        return minimum_index(get_array());
    }
}
