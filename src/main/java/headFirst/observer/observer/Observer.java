package headFirst.observer.observer;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public interface Observer {
    // get data through pull, not push
    void update();
}
