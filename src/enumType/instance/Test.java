package enumType.instance;

/**
 * Created by Jiawei on 7/10/17.
 */
public class Test {

    public static void main(String[] args) {

        //whois.arin.net
        System.out.println(WhoisRIR.ARIN.url());

        System.out.println();

        for (WhoisRIR r: WhoisRIR.values()) {
            System.out.println(r);
        }

        System.out.println();

        System.out.println(WhoisRIR.valueOf("CNNIC"));

    }

}