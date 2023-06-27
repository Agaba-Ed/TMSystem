package com.edcompanies.data;

import com.edcompanies.data.AccountPK;
import com.edcompanies.data.Admin;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-03T23:07:19", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> passWord;
    public static volatile SingularAttribute<Account, AccountPK> accountPK;
    public static volatile SingularAttribute<Account, Admin> admin;
    public static volatile SingularAttribute<Account, String> userName;

}