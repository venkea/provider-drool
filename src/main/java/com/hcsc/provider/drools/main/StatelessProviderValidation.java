
package com.hcsc.provider.drools.main;

import com.hcsc.provider.drools.domain.Provider;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class StatelessProviderValidation {
  public static void main(final String[] args) {
    //execute(provider);
  }

  static Provider execute(Provider provider) {

   // Provider provider = ApplicationRepository.getProvider(provider);
    KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer();
    StatelessKieSession kieSession = kieContainer.newStatelessKieSession("StatelessProviderValidation");
    System.out.println("==== DROOLS SESSION START ==== ");
    kieSession.execute(provider);
    System.out.println("==== DROOLS SESSION END ==== ");
    System.out.println("==== PROVIDER AFTER DROOLS SESSION ==== ");

    //provider.forEach(provider1 -> System.out.println(provider1.getProviderId() + " validation " + provider1.getStatus()));
    return provider;
  }
}
