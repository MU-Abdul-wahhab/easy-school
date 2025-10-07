package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {

    ContactSevice contactSevice;

    @Autowired
    public ContactController(ContactSevice contactSevice) {
        this.contactSevice = contactSevice;
    }

    @RequestMapping("/contact")
    public String displayContact(Model model) {
        model.addAttribute("contact", new Contact());
        System.out.println("Contact added");
        return "contact.html";
    }


    @RequestMapping(value = "/saveMsg", method = POST)
    public String saveMsg(@Validated @ModelAttribute("contact") Contact contact, Errors errors) {


//    / /        System.out.println("Name " + name);
//    / /        System.out.println("Mobile " + mobileNum);
//    / /        System.out.println("Email " + email);
//    / /        System.out.println("Subject " + subject);
//    / /        System.out.println("Message " + message);

        System.out.println(errors.hasErrors());
        if (errors.hasErrors()) {
            return "contact.html";
        }

        contactSevice.saveMsg(contact);

        return "redirect:/contact";
    }


}
