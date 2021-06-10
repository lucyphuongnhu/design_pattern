import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;  

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
            return (index < nameList.size());
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
        int index1 = nameList.size() - 1;

        @Override 
        public boolean hasNext(){
            return (index1 >= 0);
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return nameList.get(index1--);
            }
            return null;
        }

    }

    //Print name lby alphabetical order
    @Override
    public Iterator getAlphabeticalIterator(){
        return new alphabeticalIterator();
    }

    private class alphabeticalIterator implements Iterator{
        int index; 
        //Alphabetical sorted list
        List<String> sortedNameList = nameList.stream().sorted().collect(Collectors.toList());  

        @Override
        public boolean hasNext(){
            return (index < nameList.size());
        }

        @Override
        public Object next(){
            if (this.hasNext()){
                return sortedNameList.get(index++);
            }
            return null;
        }
    }

}
