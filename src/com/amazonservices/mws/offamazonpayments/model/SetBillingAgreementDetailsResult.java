/*******************************************************************************
 *  Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at:
 *  http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the
 *  specific language governing permissions and limitations under the
 *  License.
 * *****************************************************************************
 */

package com.amazonservices.mws.offamazonpayments.model;

import com.amazonservices.mws.offamazonpayments.OffAmazonPaymentsServiceException;
import com.amazonservices.mws.offamazonpayments.common.JSONFragmentBuilder;
import com.amazonservices.mws.offamazonpayments.common.ReflectionFragmentBuilder;
import com.amazonservices.mws.offamazonpayments.common.XmlFragmentBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingAgreementDetails" type="{http://mws.amazonservices.com/schema/OffAmazonPayments/2013-01-01}BillingAgreementDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billingAgreementDetails"
})
@XmlRootElement(name = "SetBillingAgreementDetailsResult")
public class SetBillingAgreementDetailsResult {

    @XmlElement(name = "BillingAgreementDetails")
    protected BillingAgreementDetails billingAgreementDetails;

    /**
     * Default constructor
     * 
     */
    public SetBillingAgreementDetailsResult() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public SetBillingAgreementDetailsResult(final BillingAgreementDetails billingAgreementDetails) {
        this.billingAgreementDetails = billingAgreementDetails;
    }

    /**
     * Gets the value of the billingAgreementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAgreementDetails }
     *     
     */
    public BillingAgreementDetails getBillingAgreementDetails() {
        return billingAgreementDetails;
    }

    /**
     * Sets the value of the billingAgreementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAgreementDetails }
     *     
     */
    public void setBillingAgreementDetails(BillingAgreementDetails value) {
        this.billingAgreementDetails = value;
    }

    public boolean isSetBillingAgreementDetails() {
        return (this.billingAgreementDetails!= null);
    }

    /**
     * Sets the value of the BillingAgreementDetails property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SetBillingAgreementDetailsResult withBillingAgreementDetails(BillingAgreementDetails value) {
        setBillingAgreementDetails(value);
        return this;
    }

    /**
     *
     * XML fragment representation of this object
     *
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    @Deprecated
    public String toXMLFragment() throws OffAmazonPaymentsServiceException {
        return new ReflectionFragmentBuilder(this, new XmlFragmentBuilder()).build();
    }

    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    @Deprecated
    public String toJSONFragment() throws OffAmazonPaymentsServiceException {
        return new ReflectionFragmentBuilder(this, new JSONFragmentBuilder()).build();
    }
}
