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

    public void setZeroElemMinus(){
        for (int i = 0; i < _arr.length; i++){
            if(_arr[i] < 0){
                _arr[i] = 0;
            }
        }
    }

    public void maxConsecutiveCount(){
        int maxLen = 1;
        int currLen = 1;
        for (int i = 1; i < _arr.length; i++) {
            if (_arr[i] == _arr[i - 1]) {
                currLen++;
            } else {
                currLen = 1;
            }

            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }
    }


}
