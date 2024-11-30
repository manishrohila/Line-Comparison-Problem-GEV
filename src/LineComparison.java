public class LineComparison {
    public void lengthCalculate(int x1, int y1, int x2 ,int y2){
        double diff = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double length = Math.sqrt(diff);
        System.out.println("length of lines is "+ length);
    }
}
