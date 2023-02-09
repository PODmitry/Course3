public class first_course {

    public static void main(String[] args) {

        boolean iSsunny = true;
        boolean isFriend = false;

        if (iSsunny && isFriend) {
            System.out.println("true");
        }
        else if (isFriend || iSsunny) {
            System.out.println("+-+-");
        }
        else {
            System.out.println("-");
        }
    }
}
