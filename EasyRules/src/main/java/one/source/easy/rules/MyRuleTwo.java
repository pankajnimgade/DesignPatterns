package one.source.easy.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;
import org.easyrules.core.BasicRule;

/**
 * Created by Pankaj Nimgade on 09-05-2016.<br><br>
 * We can create Easy rules by  implementing the {@link org.easyrules.api.Rule} interface or extending the {@link BasicRule} class.<br><br>
 * Easy Rules provides the {@link org.easyrules.annotation.Rule} annotation that can turn a POJO into a rule. Here is an example:
 */
@Rule(name = "my rule Two", description = "my rule two description")
public class MyRuleTwo{

    private BusinessData businessData; // this is the data i need to operate on

    public MyRuleTwo(BusinessData businessData) {
        this.businessData = businessData;
    }

    @Condition
    public boolean when() {
        //my rule conditions
        return true;
    }

    @Action(order = 1)
    public void then() throws Exception {
        //my actions
    }


    @Action(order = 2)
    public void finallyDO() throws Exception {
        //my final actions
    }


}
