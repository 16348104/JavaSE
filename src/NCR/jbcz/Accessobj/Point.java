package NCR.jbcz.Accessobj;

/**
 * Created by zb on 2018/2/1.
 */
public class Point {    //访问对象的变量和调用方法
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int x1, int y1) {
        x = x1;
        y = y1;
    }

}
