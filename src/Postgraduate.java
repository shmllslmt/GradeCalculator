public class Postgraduate extends Student {
    private String researchArea;
    private String thesisTitle;
    protected Postgraduate(String name, String id, int[] marks, String researchArea, String thesisTitle) {
        super(name, id, marks);
        this.researchArea = researchArea;
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void printInfo() {
        System.out.println("Research Area: "+researchArea);
        System.out.println("Thesis Title: "+thesisTitle);
    }
}
