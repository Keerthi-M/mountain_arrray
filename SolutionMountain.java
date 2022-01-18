class SolutionMountain{
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        // last peak value from scanning head side
        int lastPeakIVal = arr[0];
        // last peak value from scanning tail side
        int lastPeakJVal = arr[arr.length - 1];
        // the index of peak
        int i = 0, j = arr.length - 1;
        for (int k = 0; k < arr.length - 1; k++) {
            int nextIVal = arr[i + 1];
            int nextJVal = arr[j - 1];
            if (lastPeakIVal < nextIVal) {
                lastPeakIVal = nextIVal;
                i++;
            }
            if (nextJVal > lastPeakJVal) {
                lastPeakJVal = nextJVal;
                j--;
            }
        }
        if (i == j &&  i > 0 && j < arr.length - 1) {
            return true;
        }
        return false;
    }
}