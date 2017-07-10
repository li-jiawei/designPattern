package enumType.use;

import enumType.basic.UserStatus;
import enumType.instance.WhoisRIR;

/**
 * Created by Jiawei on 7/10/17.
 */
public class Test {
    public static void main(String[] args) {

        // To loop a Enum object.

        for (UserStatus status : UserStatus.values()) {
            System.out.println(status);
        }

        // To compare the Enum values, use == operator.

        WhoisRIR rir = WhoisRIR.APNIC;

        if (rir == WhoisRIR.APNIC) {
            System.out.println("This is APNIC : " + rir.url());
        }

        // Switch case

        WhoisRIR r = WhoisRIR.RIPE;

        switch (r) {
            case ARIN:
                System.out.println("This is ARIN");
                break;
            case APNIC:
                System.out.println("This is APNIC");
                break;
            case RIPE:
                System.out.println("This is RIPE");
                break;
            default:
                throw new AssertionError("Unknown RIR " + rir);

        }
    }
}
