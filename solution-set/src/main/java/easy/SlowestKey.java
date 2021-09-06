package easy;

public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxTime = releaseTimes[0];
        char result = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int currTime = releaseTimes[i] - releaseTimes[i - 1];
            if (currTime > maxTime) {
                result = keysPressed.charAt(i);
                maxTime = currTime;
            } else if (currTime == maxTime)
                result = (char) Math.max(keysPressed.charAt(i), result);
        }
        return result;
    }
}
