package todo;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Entry> list = new ArrayList<Entry>();
    private int length;

    public void showtodolist() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void sort() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getHour() > list.get(j).getHour()
                        || (list.get(i).getHour() == list.get(j).getHour() && list.get(i).getMinute() > list.get(j).getMinute())) {
                    Entry temp = new Entry();
                    temp.setHour(list.get(i).getHour());
                    temp.setMinute(list.get(i).getMinute());
                    temp.setNodes(list.get(i).getNodes());
                    list.get(i).setHour(list.get(j).getHour());
                    list.get(i).setMinute(list.get(j).getMinute());
                    list.get(i).setNodes(list.get(j).getNodes());
                    list.get(j).setHour(temp.getHour());
                    list.get(j).setMinute(temp.getMinute());
                    list.get(j).setNodes(temp.getNodes());
                }
            }
        }
    }

    public boolean removeEntry(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public void addEntry(Entry entry) {
        list.add(entry);
    }

    public Entry getiD(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCount() == id) {
                return list.get(i);
            }
        }
        return null;
    }
}
