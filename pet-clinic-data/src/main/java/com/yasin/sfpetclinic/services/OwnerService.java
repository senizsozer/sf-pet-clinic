package com.yasin.sfpetclinic.services;

import com.yasin.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long>{

    Owner findByLastName(String lastName);
}
