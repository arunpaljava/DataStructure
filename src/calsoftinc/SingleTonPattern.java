package calsoftinc;

public class SingleTonPattern {
    private static SingleTonPattern INSTANCE = null;

    private SingleTonPattern() {

    }

    public static SingleTonPattern getInstance() {
        if (null == INSTANCE) {
            synchronized (SingleTonPattern.class) {
                if (null == INSTANCE) {
                    INSTANCE = new SingleTonPattern();
                }
            }
        }
        return INSTANCE;
    }

}
