public class MagicBox<T> {
    T[] items;

    public MagicBox (int size) {
        items = (T[]) new Object[size];
    }
}
