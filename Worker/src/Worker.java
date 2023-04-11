public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorcallback;
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorcallback.onError("Task " + i + " is ERROR");
            }

        }
    }
    public Worker(OnTaskDoneListener callback1, OnTaskErrorListener errorcallback1) {
        this.callback = callback1;
        this.errorcallback = errorcallback1;
    }
}
