package mediator;

import Itertor.College;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.text.Keymap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author goodtime
 * @create 2020-03-10 4:39 下午
 */
public class ConcreteMediator extends Mediator {

    private Map<String,Colleague> colleagueList;

    public ConcreteMediator(){
        colleagueList = new HashMap<>();
    }

    @Override
    public void register(Colleague colleague, String name) {
        colleagueList.put(name,colleague);
    }

    //这里就是中介者主要的业务处理，所有的College，都是根据operation进行处理
    @Override
    public void getMessage(Object name,Object operation) {
        Colleague colleague = colleagueList.get((String) name);
        if(colleague instanceof Alarm){
            Alarm a = (Alarm)colleague;
            if((Integer) operation == 0){
                a.startAlarm();
                CofferMachine cofferMachine = (CofferMachine) colleagueList.get("咖啡机");
                cofferMachine.startCofferMachine();
            }else if((Integer) operation == 1){
                a.stopAlarm();
                CofferMachine cofferMachine = (CofferMachine) colleagueList.get("咖啡机");
                cofferMachine.stopCoffeeMachine();
            }
        }else if(colleague instanceof CofferMachine){
            CofferMachine b = (CofferMachine)colleague;
            if((Integer) operation == 0){//咖啡机发的指令，暂时不做任何事
            }else if((Integer) operation == 1){
            }
        }
    }
}
