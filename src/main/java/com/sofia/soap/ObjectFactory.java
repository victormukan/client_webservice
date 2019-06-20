
package com.sofia.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sofia.soap.soap package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoOperation_QNAME = new QName("http://soap.web.sofia.com/", "doOperation");
    private final static QName _GetHistoryByDateResponse_QNAME = new QName("http://soap.web.sofia.com/", "getHistoryByDateResponse");
    private final static QName _GetHistory_QNAME = new QName("http://soap.web.sofia.com/", "getHistory");
    private final static QName _GetHistoryResponse_QNAME = new QName("http://soap.web.sofia.com/", "getHistoryResponse");
    private final static QName _DoOperationResponse_QNAME = new QName("http://soap.web.sofia.com/", "doOperationResponse");
    private final static QName _GetHistoryByDate_QNAME = new QName("http://soap.web.sofia.com/", "getHistoryByDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sofia.soap.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHistory }
     * 
     */
    public GetHistory createGetHistory() {
        return new GetHistory();
    }

    /**
     * Create an instance of {@link GetHistoryByDate }
     * 
     */
    public GetHistoryByDate createGetHistoryByDate() {
        return new GetHistoryByDate();
    }

    /**
     * Create an instance of {@link GetHistoryResponse }
     * 
     */
    public GetHistoryResponse createGetHistoryResponse() {
        return new GetHistoryResponse();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link DoOperation }
     * 
     */
    public DoOperation createDoOperation() {
        return new DoOperation();
    }

    /**
     * Create an instance of {@link MathOperation }
     * 
     */
    public MathOperation createMathOperation() {
        return new MathOperation();
    }

    /**
     * Create an instance of {@link GetHistoryByDateResponse }
     * 
     */
    public GetHistoryByDateResponse createGetHistoryByDateResponse() {
        return new GetHistoryByDateResponse();
    }

    /**
     * Create an instance of {@link HistoryRecord }
     * 
     */
    public HistoryRecord createHistoryRecord() {
        return new HistoryRecord();
    }

    /**
     * Create an instance of {@link DoOperationResponse }
     * 
     */
    public DoOperationResponse createDoOperationResponse() {
        return new DoOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.sofia.com/", name = "doOperation")
    public JAXBElement<DoOperation> createDoOperation(DoOperation value) {
        return new JAXBElement<DoOperation>(_DoOperation_QNAME, DoOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.sofia.com/", name = "getHistoryByDateResponse")
    public JAXBElement<GetHistoryByDateResponse> createGetHistoryByDateResponse(GetHistoryByDateResponse value) {
        return new JAXBElement<GetHistoryByDateResponse>(_GetHistoryByDateResponse_QNAME, GetHistoryByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.sofia.com/", name = "getHistory")
    public JAXBElement<GetHistory> createGetHistory(GetHistory value) {
        return new JAXBElement<GetHistory>(_GetHistory_QNAME, GetHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.sofia.com/", name = "getHistoryResponse")
    public JAXBElement<GetHistoryResponse> createGetHistoryResponse(GetHistoryResponse value) {
        return new JAXBElement<GetHistoryResponse>(_GetHistoryResponse_QNAME, GetHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.sofia.com/", name = "doOperationResponse")
    public JAXBElement<DoOperationResponse> createDoOperationResponse(DoOperationResponse value) {
        return new JAXBElement<DoOperationResponse>(_DoOperationResponse_QNAME, DoOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.web.sofia.com/", name = "getHistoryByDate")
    public JAXBElement<GetHistoryByDate> createGetHistoryByDate(GetHistoryByDate value) {
        return new JAXBElement<GetHistoryByDate>(_GetHistoryByDate_QNAME, GetHistoryByDate.class, null, value);
    }

}
