public class NameRepositoryDemo {
    public static void main(String[] args) throws Exception {
        NameRepository nameRepository = new NameRepository();

        /** Previous Exercise
        Print the name left to right
        nameRepository.printForward();

        Print the name right to left
        nameRepository.printBackward();
        **/

        //Add name to the list 
        nameRepository.addName("Robert");
        nameRepository.addName("John");
        nameRepository.addName("Julie");
        nameRepository.addName("Lora");

        for (Iterator iterator1 = nameRepository.getForwardIterator(); iterator1.hasNext();){
            String name = (String) iterator1.next();
            System.out.println("Name: " + name);
        } 

        for (Iterator iterator2 = nameRepository.getBackwardIterator(); iterator2.hasNext();){
            String name = (String) iterator2.next();
            System.out.println("Name: " + name);
        } 
    }
}
