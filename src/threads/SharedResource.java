package threads;

public class SharedResource {
    private volatile boolean flag = true;

    public void toggle() {
        flag = !flag;
    }

    public boolean getFlag() {
        return flag;
    }
}