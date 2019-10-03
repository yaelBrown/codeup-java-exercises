public class NumberBinary {

    public static Boolean isThereOne (int n) {
        if (n > 0) {
            String aa = String.valueOf(n);
            System.out.println("aa = " + aa);
            int bb = aa.indexOf("1");
            System.out.println("bb = " + bb);
            if (bb >= 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(isThereOne(003));
        System.out.println(isThereOne(010));
        System.out.println(isThereOne(342));

    }

}
