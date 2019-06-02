package samples.spring.message.receiver;

import com.google.common.base.Strings;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import samples.spring.message.receiver.message.MessageDTO;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class MessageReceiver {

    private static final List<MessageDTO> messages = new ArrayList<>();

    public void receive(String message) {
        System.out.println(String.format("Message received: %s", message));
        if (!Strings.isNullOrEmpty(message)) {
            messages.add(new MessageDTO(message));
        }
    }

    public List<MessageDTO> getMessages() {
        return new ArrayList<>(messages);
    }
}
