package oscarblancarte.ipd.observer.impl.observers;

import oscarblancarte.ipd.observer.impl.ConfigurationManager;
import oscarblancarte.ipd.observer.impl.IObserver;

import java.util.Date;

public class CurrencyFormatObserver implements IObserver{

    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equals("currencyFormat")){
            ConfigurationManager conf = (ConfigurationManager)source;
            System.out.println("Observer ==> CurrencyFormatObserver.currencyFormatChange > "
                    + conf.getCurrencyFormat().format(22.22));
        }
    }

}
