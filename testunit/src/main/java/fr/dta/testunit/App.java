package fr.dta.testunit;

import Connection.HttpDataService;
import Connection.MyIpService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HttpDataService httpDataServ = new HttpDataService();
        
        MyIpService myIpServ = new MyIpService(httpDataServ);
        
        System.out.println(httpDataServ.getJsonIp());
        System.out.println(myIpServ.getMyIp());
    }
}
