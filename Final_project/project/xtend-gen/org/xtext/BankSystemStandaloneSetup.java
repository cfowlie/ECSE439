/**
 * generated by Xtext 2.14.0
 */
package org.xtext;

import org.xtext.BankSystemStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BankSystemStandaloneSetup extends BankSystemStandaloneSetupGenerated {
  public static void doSetup() {
    new BankSystemStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}