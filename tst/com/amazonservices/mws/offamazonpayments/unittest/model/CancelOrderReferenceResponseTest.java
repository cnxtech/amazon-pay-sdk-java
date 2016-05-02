package com.amazonservices.mws.offamazonpayments.unittest.model;

import org.junit.Test;

import com.amazonservices.mws.offamazonpayments.model.CancelOrderReferenceResponse;

import static junit.framework.Assert.assertNotNull;

public class CancelOrderReferenceResponseTest extends ModelTest<CancelOrderReferenceResponse>{

    @Override
    protected String getXMLTestFile(){
        return "CancelOrderReferenceResponse.xml";
    }

    @Override
    protected Class<CancelOrderReferenceResponse> getTestClassType() {
        return CancelOrderReferenceResponse.class;
    }

    @Test
    public void testObjectToXML() throws Exception{
        testForNull();
    }

    @Test
    public void testXMLToObject() throws Exception {
        testSchema();
    }

    @Test
    public void toXMLShouldNotReturnNullForObjectWithAllFieldsPopulated() throws Exception {
        String xmlFragment = getTestClassObject().toXML();

        assertNotNull(xmlFragment);
    }

    @Test
    public void toJSONShouldNotReturnNullForObjectWithAllFieldsPopulated() throws Exception {
        String jsonFragment = getTestClassObject().toJSON();

        assertNotNull(jsonFragment);
    }
}