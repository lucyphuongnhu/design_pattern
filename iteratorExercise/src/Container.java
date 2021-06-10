public interface Container {
    public Iterator getForwardIterator();   //Iterator to print name from left to right
    public Iterator getBackwardIterator();  //Iterator to print name from right to left
    public Iterator getAlphabeticalIterator();  //Iterator to print name by alphabetical order
}
