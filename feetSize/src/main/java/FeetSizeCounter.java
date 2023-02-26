import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FeetSizeCounter {

    private FeetSize feetSize;


    public FeetSize countFeetSize(int feetLengtNumber) {

        if(feetLengtNumber==0){
            throw new IllegalArgumentException ("feetLenght Number must be bigger than 0 ");
        }

        switch (feetLengtNumber) {
            case 24:
                System.out.println(FeetSize.FEET_SIZE40);
                break;
            case 25:
                System.out.println(FeetSize.FEET_SIZE41);
                break;
            case 26:
                System.out.println(FeetSize.FEET_SIZE42);
                break;
            case 27:
                System.out.println(FeetSize.FEET_SIZE43);
                break;
            case 28:
                System.out.println(FeetSize.FEET_SIZE44);
                break;

        }

        return null;
    }
}
