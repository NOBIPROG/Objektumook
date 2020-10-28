package SmartArray;

public class SmartArray {
    private int[] data;
    private int size;
    private int[] temp;
    private int counter;

    public void add(int val) {
        if (size == data.length) {
            int[] Array = new int[size + 1];
            for (int i = 0; i < data.length; i++) {
                Array[i] = data[i];
            }
            data = Array;
        }
        data[size + 1] = val;
        size++;
    }

    public SmartArray(int size) {
        this.size = size;
        data = new int[size];
        temp = new int[size];
    }

    public int get(int idx) {
        int element = 0;
        element = data[idx];
        return element;
    }

    public void set(int idx, int val) {
        data[idx] = val;
        counter++;
        temp[idx] = counter;
    }


}
