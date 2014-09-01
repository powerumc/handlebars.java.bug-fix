package com.github.jknack.handlebars.helper;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import java.io.IOException;

/**
 * You can to use the handlebars template without separated template files.
 *
 * <pre>
 *  {{#raw}}
 *    <script id="raw-template" type="text/x-handlebars-template">
 *      <div>
 *        <ul>
 *          {{#some_lists}}
 *            <li>{{name}}</li>
 *          {{/some_lists}}
 *        </ul>
 *      </div>
 *    </script>
 *  {{/raw}}
 * </pre>
 *
 * @author https://github.com/powerumc
 */
public class RawHelper implements Helper<String> {

  @Override
  public CharSequence apply(String context, Options options) throws IOException {
    return options.fn.text();
  }
}
