package point_line;

public class Line {
    Point begin;
    Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x,y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient(){
        int rise = end.getY() - begin.getY();
        int run = end.getX() - begin.getX();
        return rise/run;
    }

    public double distance(Point point) {
        int rise = end.getY() - begin.getY();
        int run = end.getX() - begin.getX();
        double denominator = Math.sqrt(Math.pow(rise, 2) + Math.pow(run, 2));

        return Math.abs(rise * point.getX() - run * point.getY()
                + end.getX() * begin.getY() - end.getY() * begin.getX()) / denominator;
    }

    public boolean intersects(Line another) {
        if(this.getGradient()*another.getGradient() == -1)
            return true;
        return false;
    }
}
