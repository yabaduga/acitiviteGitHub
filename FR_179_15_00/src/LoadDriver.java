public class LoadDriver {
    public static void main (String[] args) {


    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (Exception ex) {
        ex.printStackTrace();
    }
}
}