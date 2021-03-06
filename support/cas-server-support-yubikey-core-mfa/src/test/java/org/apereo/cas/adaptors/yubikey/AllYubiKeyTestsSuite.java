package org.apereo.cas.adaptors.yubikey;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link AllYubiKeyTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.1.0
 */
@SelectClasses({
    YubiKeyMultifactorAuthenticationProviderTests.class,
    YubiKeyRestHttpRequestCredentialFactoryTests.class
})
public class AllYubiKeyTestsSuite {
}
