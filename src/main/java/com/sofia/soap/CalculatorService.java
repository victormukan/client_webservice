package com.sofia.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2019-06-21T00:26:57.548+03:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://soap.web.sofia.com/", name = "CalculatorService")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorService {

    @WebMethod
    @RequestWrapper(localName = "doOperation", targetNamespace = "http://soap.web.sofia.com/", className = "DoOperation")
    @ResponseWrapper(localName = "doOperationResponse", targetNamespace = "http://soap.web.sofia.com/", className = "DoOperationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double doOperation(
        @WebParam(name = "arg0", targetNamespace = "")
        com.sofia.soap.MathOperation arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getHistory", targetNamespace = "http://soap.web.sofia.com/", className = "GetHistory")
    @ResponseWrapper(localName = "getHistoryResponse", targetNamespace = "http://soap.web.sofia.com/", className = "GetHistoryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.sofia.soap.HistoryRecord> getHistory();

    @WebMethod
    @RequestWrapper(localName = "getHistoryByDate", targetNamespace = "http://soap.web.sofia.com/", className = "GetHistoryByDate")
    @ResponseWrapper(localName = "getHistoryByDateResponse", targetNamespace = "http://soap.web.sofia.com/", className = "GetHistoryByDateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.sofia.soap.HistoryRecord> getHistoryByDate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
