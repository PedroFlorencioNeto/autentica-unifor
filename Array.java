public class Array {
    private String[] data;
    private int length;

    public Array(int length){
        data = new String[length];
        length = 0;
    }

    public void add(String line){
        data[length] = line;
        length++;
    }

    public String get(int index){
        return data[index];
    }

    public int length(){
        return length;
    }
}
