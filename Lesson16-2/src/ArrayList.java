public class ArrayList <T> {
    Object[] arr = new Object[10];
    int count = 0;

    public void add(T t){
        arr[count] = t;
        count++;
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}