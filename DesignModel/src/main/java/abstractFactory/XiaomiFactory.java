package abstractFactory;

/**
 * @author goodtime
 * @create 2023-12-22 23:22
 */
public class XiaomiFactory implements Factory {


    @Override
    public Phone producePhone() {
        return new XiaomiPhone();
    }

    @Override
    public Computer produceComputer() {
        return new XiaomiComputer();
    }
}
