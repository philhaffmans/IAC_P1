package buurtservice.berichten;

import com.sun.xml.ws.developer.ValidationErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Created by philippehaffmans on 10-03-17.
 */
public class BuurtServiceValidationHandler extends ValidationErrorHandler {

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        packet.invocationProperties.put("error", exception);
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        throw exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {

    }
}


