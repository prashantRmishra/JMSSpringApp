package MessageQueue.reciever;

import com.blade.ioc.annotation.Bean;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import MessageQueue.model.Email;
@Component
public class OrderTransactionReceiver {
    @JmsListener(destination = "mailbox",containerFactory = "myFactory")
    public void receiveMessage(Email email){
        System.out.println("Receiver Message < " +email+ " >");
    }
}