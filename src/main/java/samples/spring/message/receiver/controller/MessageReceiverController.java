package samples.spring.message.receiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import samples.spring.message.receiver.MessageReceiver;
import samples.spring.message.receiver.message.MessageDTO;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageReceiverController {

    @Autowired
    private MessageReceiver receiver;

    @GetMapping
    public List<MessageDTO> getMessages() {
        return receiver.getMessages();
    }
}
