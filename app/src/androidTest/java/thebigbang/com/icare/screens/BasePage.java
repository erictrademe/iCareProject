package thebigbang.com.icare.screens;

/**
 * Created by ericzhong on 25/10/16.
 */


public abstract  class BasePage extends LoadableComponent {

    public <T extends BasePage> T is(Class<T> type) {
        if (type.isInstance(this)) {
            return type.cast(this);
        } else {

            throw new InvalidPageException("Invalid page type. Expected: " + type.getSimpleName() + ", but got: " + this.getClass().getSimpleName());
        }
    }

    public static class InvalidPageException extends RuntimeException {

        public InvalidPageException(final String message) {
            super(message);
        }
    }




}
