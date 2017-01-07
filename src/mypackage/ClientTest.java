package mypackage;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by Administrator on 2017/1/7.
 */
public class ClientTest {

    public static void main(String[] args) {
        HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
        try {
            HelloWorld helloWorld = locator.getHelloWord();

            String result = helloWorld.sayHelloWorldFrom("com.iLooking.yz");

            System.out.println(result);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
