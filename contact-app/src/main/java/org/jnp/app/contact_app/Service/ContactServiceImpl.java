package org.jnp.app.contact_app.Service;

import java.util.List;

import org.jnp.app.contact_app.Entity.Contact;
import org.jnp.app.contact_app.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

      // Save operation
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

        // Read operation
    public List<Contact>  fetchContactList() {
        return (List<Contact>) contactRepository.findAll();
    }

  // Update operation
    public Contact updateContactById(Contact contact, Long Id){
         Contact depDB = contactRepository.findById(Id).get();
        return depDB;
    }
    // Delete operation
    public void deleteContactById(Long Id){
        contactRepository.deleteById(Id);
    }

}
