package classes;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                errorCallback.onError("Task " + i + " is !FAIL!");
            } else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }
}

