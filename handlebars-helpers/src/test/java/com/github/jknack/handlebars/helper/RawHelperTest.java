package com.github.jknack.handlebars.helper;

import com.github.jknack.handlebars.AbstractTest;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.io.StringTemplateSource;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class RawHelperTest extends AbstractTest {

  @Test
  public void testApply() throws IOException {
    String inputTemplate = "{{#raw}}<script id='template' type='text/x-handlebars-template'><li>{{name}}</li></script>{{/raw}}";
    String expected = inputTemplate.replace("{{#raw}}", "").replace("{{/raw}}", "");

    Handlebars handlebars = super.newHandlebars();
    handlebars.registerHelper("raw", new RawHelper());
    String renderString = handlebars.compile(new StringTemplateSource("test.hbs", inputTemplate)).apply(new String());

    assertEquals(renderString, expected);
  }
}