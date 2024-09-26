package org.jnp.app.contact_app.Repository;

import org.jnp.app.contact_app.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository  extends  JpaRepository<Contact, Long>{
  
}
