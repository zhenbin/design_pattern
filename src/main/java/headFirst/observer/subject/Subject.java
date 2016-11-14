package headFirst.observer.subject;

import headFirst.observer.observer.Observer;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
