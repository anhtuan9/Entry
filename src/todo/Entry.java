package todo;

public class Entry {
    static int count = 0;
    private int hour, minute;
    private String nodes;
    private int id;

    public Entry() {
    }

    public Entry(int hour, int minute, String nodes) {
        this.hour = hour;
        this.minute = minute;
        this.nodes = nodes;
        this.id = ++count;
    }

    public static int getCount() {
        return count;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getNodes() {
        return nodes;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }

    public String toString() {
        return "Id: " + id + "\n"
                + "thời gian: " + hour + "h" + minute
                + "\n" + "ghi chú: " + nodes;
    }

}
