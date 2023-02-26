public class FeetSizeEuropeCOnverter {

    private FeetSize feetSize;
    private FeetSizeEurope feetSizeEurope;

    public FeetSize feetSizeConverter(int feetNumberInEurope){
        if(feetNumberInEurope==0){
            throw new IllegalArgumentException("Value of feet can not be 0 ");
        } else {
            switch (feetNumberInEurope){
                case 7:
                    System.out.println(FeetSize.FEET_SIZE40);
                    break;
                case 8:
                    System.out.println(FeetSize.FEET_SIZE41);
                    break;
                case 9:
                    System.out.println(FeetSize.FEET_SIZE42);
                    break;
                case 10:
                    System.out.println(FeetSize.FEET_SIZE43);
                    break;
                case 11:
                    System.out.println(FeetSize.FEET_SIZE44);
                    break;


            }
        }


        return null;
    }
}
