package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ContactSevice {

    public void saveMsg(Contact contact) {
        System.out.println(contact.hashCode());
    }

}
