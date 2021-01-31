public class knapSack {
    public static void main(String[] args) {
        Item items[] = new Item[4];
        items[0] = new Item(10,60);
        items[1] = new Item(20,100);
        items[2] = new Item(30,120);
        items[3] = new Item(15,200);
        System.out.println(knapSack(items,30));
    }
    public static class Item {
        private int _weight;
        private int _value;
        public Item(int w,int v) {
            _weight = w;
            _value = v;
        }
        public int getWeight() {return _weight;}
        public int getValue() {return _value;}
    }

    public static int knapSack(Item[] items,int w) {
        if(items.length == 0) return 0;
        return knapSack(items,w,0,0,"");
    }
    public static int knapSack(Item[] items,int w,int Sum,int index,String path) {
        if(w<0) {
            return 0;
        }
        if(index == items.length) {
                System.out.println(path);
                return Sum;
        }

        return Math.max(knapSack(items,w-items[index]._weight,Sum+items[index]._value,index+1,path+items[index]._value+','),knapSack(items,w,Sum,index+1,path));
    }
}
