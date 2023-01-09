public class StopWatch {
    private long startTime;
    private long endTime = -1;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long elapsed() {
        if (endTime >= 0) {
            return endTime - startTime;
        }
        return System.currentTimeMillis() - startTime;
    }

    @Override
    public String toString() {
        long milliseconds = elapsed();
        int seconds = (int) (milliseconds / 1000) % 60 ;
        int minutes = (int) ((milliseconds / (1000*60)) % 60);
        int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
        int millis  = (int) (milliseconds - (seconds * 1000) - (minutes * 1000 * 60) - (hours * 1000 * 60 * 60));
        return String.format("%dh, %dmin, %ds, %dms", hours, minutes, seconds, millis);
    }
}