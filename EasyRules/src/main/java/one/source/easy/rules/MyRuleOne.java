package one.source.easy.rules;

import org.easyrules.core.BasicRule;

/**
 * Created by Pankaj Nimgade on 09-05-2016.<br><br>
 * We can create Easy rules by  implementing the {@link org.easyrules.api.Rule} interface or extending the {@link BasicRule} class.<br><br>
 * In this class we are using {@link BasicRule}
 */
public class MyRuleOne extends BasicRule {

    private BusinessData businessData; // this is the data i need to operate on

    public MyRuleOne(BusinessData businessData) {
        this.businessData = businessData;
    }

    public MyRuleOne(String name, String description, BusinessData businessData) {
        super(name, description);
        this.businessData = businessData;
    }


    @Override
    public boolean evaluate() {
        //my rule conditions
        return super.evaluate();
    }

    @Override
    public void execute() throws Exception {
        super.execute();
        //my actions
    }

    public BusinessData getBusinessData() {
        return businessData;
    }

    public void setBusinessData(BusinessData businessData) {
        this.businessData = businessData;
    }
}
