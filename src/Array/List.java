package Array;

public interface List<E> {
    int size(); //判断数组中实际元素个数，已经做好了
    boolean isEmpty(); //判断数组是否为空，已经做好了
    void clear(); //清空数组，已经做好了
    E get(int index); //取第index个元素
    void add(E element); //放一个元素到数组末尾
    void add(int index, E element); //放元素element到第index个位置
    E remove(int index); //删除数组的第index个元素
    int indexOf(Object o); //求o这个元素在数组中的下标
}
