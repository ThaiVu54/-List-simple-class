import java.util.Arrays;

public class MyList<E> { //todo tao lop mylist
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //todo muc dich: tang gap doi kich thuoc mang chua cac phan tu
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //todo muc dich: them 1 phan tu vao cuoi cua danh sach
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //todo muc dich: phuong thuc get() tra ve phan tu vua o vi tri thu i trong danh sach
    //todo tham so đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + ", size " + i);
        }
        return (E) elements[i];
    }

}

