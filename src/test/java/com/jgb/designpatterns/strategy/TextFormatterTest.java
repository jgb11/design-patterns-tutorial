package com.jgb.designpatterns.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * @author jgb
 * @since 28/12/17 13:18
 */
@RunWith(MockitoJUnitRunner.class)
public class TextFormatterTest {

    private TextEditor editor;

    @Mock
    private CapTextFormatter capTextFormatter;
    @Mock
    private LowerTextFormatter lowerTextFormatter;
    @Mock
    private ArialTextFormatter arialTextFormatter;

    @Before
    public void setUp() throws Exception {
        doCallRealMethod().when(capTextFormatter).format(anyString());
        doCallRealMethod().when(lowerTextFormatter).format(anyString());
        doCallRealMethod().when(arialTextFormatter).format(anyString());
    }

    @Test
    public void testCapTextFormatter() {
        editor = new TextEditor(capTextFormatter);
        editor.publishText("Testing text in caps formatter");

        verify(capTextFormatter, times(1)).format(anyString());
    }

    @Test
    public void testLowerTextFormatter() {
        editor = new TextEditor(lowerTextFormatter);
        editor.publishText("Testing text in lower formatter");

        verify(lowerTextFormatter, times(1)).format(anyString());
    }

    @Test
    public void testArialTextFormatter() {
        editor = new TextEditor(arialTextFormatter);
        editor.publishText("Testing text in arial formatter");

        verify(arialTextFormatter, times(1)).format(anyString());
    }
}