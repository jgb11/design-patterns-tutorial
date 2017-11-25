package com.jgb.designpatterns.builder.custombuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jgb
 * @since 25/11/2017 10:25
 */
public class FormBuilderTest {

    @Test
    public void testFormBuilder() throws Exception {
        final Form form = Form.Builder
                .get("Dave", "Carter", "DavCarter", "DAvCaEr123")
                .passwordHint("MyName")
                .city("NY")
                .language("English")
                .build();
        assertEquals("FirstName must be Dave", "Dave", form.getFirstName());
        assertEquals("LastName must be Carter", "Carter", form.getLastName());
        assertEquals("UserName must be DavCarter", "DavCarter", form.getUserName());
        assertEquals("Password must be DAvCaEr123", "DAvCaEr123", form.getPassword());
        assertEquals("PasswordHint must be MyName", "MyName", form.getPasswordHint());
        assertEquals("Language must be English", "English", form.getLanguage());
        System.out.println(form);
    }

}