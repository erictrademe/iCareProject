package thebigbang.com.icare.screens;

/**
 * Created by ericzhong on 26/10/16.
 */


public abstract class LoadableComponent<T extends LoadableComponent<T>> {

    public T get() {
        if (isLoaded()) {
            return (T) this;
        }
        else {
            load();
            return (T) this;
        }
    }

    public abstract boolean isLoaded();

    public abstract void load();

}