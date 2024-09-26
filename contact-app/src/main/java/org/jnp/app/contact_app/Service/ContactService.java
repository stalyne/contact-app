package org.jnp.app.contact_app.Service;
import java.util.List;

import org.jnp.app.contact_app.Entity.Contact;

    public interface ContactService {
        Contact saveContact(Contact contact);
        List<Contact>  fetchContactList();
        Contact updateContactById(Contact contact, Long Id);
        void deleteContactById(Long Id);
    }
