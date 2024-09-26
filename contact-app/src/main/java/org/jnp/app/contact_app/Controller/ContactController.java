package org.jnp.app.contact_app.Controller;
import java.util.List;

import org.jnp.app.contact_app.Entity.Contact;
import org.jnp.app.contact_app.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
// Annotation
@RestController
// Class
public class ContactController {
 
    @Autowired private ContactService contactService;
 
    // Save operation
    @PostMapping("/contacts")
 
    public Contact saveContact(
        @Validated @RequestBody Contact contact)    {
        return contactService.saveContact(contact);
    }
 
    // Read operation
    @GetMapping("/contacts")
 
    public List<Contact> fetchContactList()
    {
        return contactService.fetchContactList();
    }
 
    // Update operation
    @PutMapping("/contacts/{id}")
 
    // Delete operation
    @DeleteMapping("/contacts/{id}")
 
    public String deleteContactById(@PathVariable("id")
                                       Long contactId)
    {
        contactService.deleteContactById(
            contactId);
        return "Deleted Successfully";
    }
}