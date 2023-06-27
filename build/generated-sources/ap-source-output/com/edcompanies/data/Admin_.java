package com.edcompanies.data;

import com.edcompanies.data.Account;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-03T23:07:19", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, Integer> idAdmin;
    public static volatile SingularAttribute<Admin, String> firstName;
    public static volatile CollectionAttribute<Admin, Account> accountCollection;
    public static volatile SingularAttribute<Admin, String> role;
    public static volatile SingularAttribute<Admin, String> secondName;

}