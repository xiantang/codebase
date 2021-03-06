package info.xiantang.designpattern.observer.b;

/**
 * @Author: xiantang
 * @Date: 2019/5/11 17:33
 */
public class Master implements Observer {
    public Master(Subject subject) {
        subject.aimAt(this);
    }

    @Override
    public void response() {
        System.out.println("Hot waken");
    }
}
