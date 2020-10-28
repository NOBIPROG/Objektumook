package OO.basics;

public class Counter {
    int value;

    public int setValue(){
        value=0;
        return value;
    }
    public int setValue(int number){
        value=number;
        return value;
    }
    public void add(int number){
        value+=number;

    }
    public void add(){
        value++;

    }public void get(){
        System.out.println(value);

    }public void reset(){
        value=setValue();




    }
}
