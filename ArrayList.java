public class ArrayList<T> implements List<T>
{
    T[] a;
    int size;

    public ArrayList()
    {
        a = (T[]) new Object [10];
        size =0;
    }

    public void add(T item)
    {
        if(size == a.length)
        {
            doubleArray();
        }
        a[size++] = item;

    }

    public void add(int pos, T item){
        if(size == a.length)
        {
            doubleArray();
        }

        for(int i = size-1; i > pos; i--)
        {
            a[i+1] = a[i];
        }
        a[pos] = item;
        size++;
    }

    public T get(int pos)
    {
        if(pos >= size || pos < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        return a[pos];
    }

    public T remove(int pos)
    {
        if(pos >= size || pos < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        T temp = a[pos];
        for(int i = pos; i < size-1; i++)
        {
            a[i] = a[i+1];
        }
        size--;
        return temp;
    }

    public int size()
    {
        return size;
    }

    void doubleArray()
    {
        T[] newArray = (T[])new Object[a.length*2];
        for(int i = 0; i < size; i++)
        {
            newArray[i] = a[i];
        }
        a = newArray;
    }
}