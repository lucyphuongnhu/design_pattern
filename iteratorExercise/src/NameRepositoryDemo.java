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

        //Print name list from left to right
        System.out.println("Print name list from left to right");
        for (Iterator iterator = nameRepository.getForwardIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }

        //Print name list from right to left
        System.out.println("Print name list from right to left");
        for (Iterator iterator = nameRepository.getBackwardIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        } 
    }
}
