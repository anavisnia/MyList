package sarasai;

public class MyList {
    
    private Object[] list;
    

    public MyList() {
        list = new Object[0];
    }

    public void add(Object o) {
        Object[] newlist = new Object[this.list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newlist[i] = list[i];
        }
        newlist[newlist.length - 1] = o;
        this.list = newlist;
    }

    public Object get(int index) {
        if(index < 0 || index >= this.list.length) {
            return null;
        }
        return this.list[index];
    }

    public void set(int index, Object o) {
        for(int i = 0;  i < list.length; i++ ) {
            if(index < 0 || index > list.length) {
                continue;
            }
            if( i == index) {
                list[i] = o;
            }
        }
    }

    public void remove(int index) {
        Object[] editedList = new Object[this.list.length - 1];
        for(int i = 0, j = 0;  i < list.length; i++ ) {
            if( i != index) {
                editedList[j++] = list[i];
            }
        }
        this.list = editedList;
    }

    public int size() {
        return this.list.length;
    }

    // papildomai

    public void insert(int index, Object o) {
        Object[] newList = new Object[this.list.length + 1];
        for(int i = 0, j = 0; i < newList.length; i++) {
            if(index == i) {
                newList[i] = o;
            } else {
                newList[i] = list[j++];
            }
        }
        this.list = newList;
    }

    public String toString() {
        String everyEl = "";
        for (int i = 0; i < list.length; i++) {
            if(i == 0) {
                everyEl += list[i];
            } else {
                everyEl += ", " +  list[i];
            }
        }
        return "[" + everyEl + "]";
        // kur pliusas turetu buti objektai
    }

    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("---------------");
    }
    
    
}
