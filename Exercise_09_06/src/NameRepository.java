import java.util.List;
import java.util.ArrayList;

public class NameRepository implements Container{
    /** Previous Exercise
    public static String[] names =  {"Robert", "John", "Julie", "Lora"};

    public void printForward(){
        System.out.println("--- Print forward ---");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }

    public void printBackward(){
        System.out.println("--- Print backward ---");
        for (int i = (names.length-1); i >= 0; i--){
            System.out.println(names[i]);
        }
    }
    **/

    //Add name to the list
    private List<String> nameList = new ArrayList<>();

    public void addName(String name){
        nameList.add(name);
    }

    //Print name list from left to right
    @Override
    public Iterator getForwardIterator(){
        return new forwardIterator();
    }

    private class forwardIterator implements Iterator{
        int index; 

        @Override
        public boolean hasNext(){
            if (index < nameList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if (this.hasNext()){
                return nameList.get(index++);
            }
            return null;
        }
    }

    //Print name list from right to left
    @Override
    public Iterator getBackwardIterator(){
        return new backwardIterator();
    }

    private class backwardIterator implements Iterator{
        int index = nameList.size() - 1;

        @Override 
        public boolean hasNext(){
            if (index <= 0){
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return nameList.get(index--);
            }
            return null;
        }

    }

}
