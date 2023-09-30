public class ArrayWork {
    int _count;
    int[] _arr;
    public ArrayWork(int count){
        _count = count;
        _arr = new int[_count];
        this.fill();
    }

    private void fill(){
        for (int i = 0; i < _arr.length; i++) {
            _arr[i] = ((int) (Math.random() * 31) - 15);
        }
    }

    public int[] getArray(){
        return _arr;
    }

    public int getCount(){
        return _arr.length;
    }

    public int getElement(int i){
        return _arr[i];
    }
}
