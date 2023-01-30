package classes;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);

}
