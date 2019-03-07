package Array;

public class ArrayList<E> implements List<E>{

    private int size;  //表示数组elementData中元素的实际个数
    private Object[] elementData;

    public ArrayList() {
        elementData = new Object[]{};
    }

    public ArrayList(int size) {
        this.size = size;
        elementData = new Object[size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }


    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public E get(int index) {
       return null;
    }


    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }
}
