public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new Sort<>();

        sort.addElement("test1");
        sort.addElement("test2");
        sort.addElement("test3");
        sort.addElement("test4");
        sort.addElement("test5");

        sort.contains("test7");

       sort.getIndex(4);

        sort.removeElement("test4");

        sort.clear();
    }
}