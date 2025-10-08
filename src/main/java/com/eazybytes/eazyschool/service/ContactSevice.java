package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

@Service
//@RequestScope
@Data
//@SessionScope
@ApplicationScope
public class ContactSevice {

    private int counter = 0 ;

    public ContactSevice(){
        System.out.println("Contact Service Has Been Created");
    }

    public boolean saveMsg(Contact contact) {
        boolean isSaved = true;
        System.out.println(contact.hashCode());
        return  isSaved;
    }

}
