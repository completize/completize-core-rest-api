package com.completize.core.rest.api.infrastructure.encryptor;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;

public interface Encryptor {

    String encrypt(String value) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException;

}
