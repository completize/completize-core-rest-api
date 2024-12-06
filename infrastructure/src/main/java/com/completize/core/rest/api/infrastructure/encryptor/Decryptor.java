package com.completize.core.rest.api.infrastructure.encryptor;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;

public interface Decryptor {

    String decrypt(String value) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException;

}
