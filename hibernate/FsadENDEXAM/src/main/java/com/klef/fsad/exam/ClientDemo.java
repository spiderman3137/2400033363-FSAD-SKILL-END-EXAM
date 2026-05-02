package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
 public static void main(String[] args) {

  Configuration conf = new Configuration().configure("hibernate.cfg.xml");
  SessionFactory sf = conf.buildSessionFactory();

  Session s = sf.openSession();
  Transaction tx = s.beginTransaction();

  CustomerAccount ca = new CustomerAccount(0, "Sai", "Active");
  s.persist(ca);

  tx.commit();
  s.close();

  s = sf.openSession();
  CustomerAccount ca1 = s.find(CustomerAccount.class, 1L);

  Transaction tx1 = s.beginTransaction();
  ca1.setName("Ravi");
  ca1.setStatus("Inactive");
  s.merge(ca1);
  tx1.commit();

  s.close();
  sf.close();
 }
}