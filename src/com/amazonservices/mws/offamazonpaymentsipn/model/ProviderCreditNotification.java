/*******************************************************************************
 *  Copyright 2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonservices.mws.offamazonpaymentsipn.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.amazonservices.mws.offamazonpayments.OffAmazonPaymentsServiceException;
import com.amazonservices.mws.offamazonpayments.common.JSONFragmentBuilder;
import com.amazonservices.mws.offamazonpayments.common.ReflectionFragmentBuilder;
import com.amazonservices.mws.offamazonpayments.common.XmlFragmentBuilder;
import com.amazonservices.mws.offamazonpaymentsipn.notifications.Notification;
import com.amazonservices.mws.offamazonpaymentsipn.notifications.NotificationType;

/**
 * An IPN notification to indicate a change in status for 
 * a providerCredit transaction notification.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "providerCreditDetails"
})
@XmlRootElement(name="ProviderCreditNotification")
public class ProviderCreditNotification extends Notification {

    /**
     * ProviderCredit details.
     */
    @XmlElement(name="ProviderCreditDetails", required = true)
    private ProviderCreditDetails providerCreditDetails;

    /**
     * Creates a new instance of the providerCredit notification.
     */
    public ProviderCreditNotification() {
        super(NotificationType.ProviderCreditNotification);
    }

    public ProviderCreditNotification(final ProviderCreditDetails details) {
        super(NotificationType.ProviderCreditNotification);
        providerCreditDetails = details;
    }

    /**
     * @return the details for this providerCredit notification
     */
    public ProviderCreditDetails getProviderCreditDetails() {
        return this.providerCreditDetails;
    }

    /**
     * Sets the details for this providerCredit notification.
     * @param details the new providerCredit details for this notification
     */
    public void setProviderCreditDetails(final ProviderCreditDetails details) {
        this.providerCreditDetails = details;
    }

    public boolean isSetProviderCreditDetails() {
        return (this.providerCreditDetails != null);
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
