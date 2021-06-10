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
        nameRepository.addName("Lucy");
        nameRepository.addName("Dang Khoa");
        nameRepository.addName("Bill");
        nameRepository.addName("Phuong Nhu");

        
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

        //Print name in alphabetical order
        System.out.println("Print name list in alphabetical order");
        for (Iterator iterator = nameRepository.getAlphabeticalIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        } 
    }
}
