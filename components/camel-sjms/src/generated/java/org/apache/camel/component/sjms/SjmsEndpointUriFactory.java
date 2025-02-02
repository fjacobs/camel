/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SjmsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationType:destinationName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(46);
        props.add("asyncConsumer");
        props.add("mapJmsMessage");
        props.add("synchronous");
        props.add("includeAllJMSXProperties");
        props.add("explicitQosEnabled");
        props.add("transacted");
        props.add("eagerLoadingOfProperties");
        props.add("autoStartup");
        props.add("timeToLive");
        props.add("bridgeErrorHandler");
        props.add("jmsKeyFormatStrategy");
        props.add("deliveryMode");
        props.add("headerFilterStrategy");
        props.add("transferException");
        props.add("exceptionListener");
        props.add("destinationName");
        props.add("messageCreatedStrategy");
        props.add("asyncStopListener");
        props.add("destinationType");
        props.add("asyncStartListener");
        props.add("eagerPoisonBody");
        props.add("requestTimeout");
        props.add("allowNullBody");
        props.add("replyToDeliveryPersistent");
        props.add("disableReplyTo");
        props.add("replyToConcurrentConsumers");
        props.add("clientId");
        props.add("recoveryInterval");
        props.add("destinationCreationStrategy");
        props.add("exchangePattern");
        props.add("disableTimeToLive");
        props.add("messageSelector");
        props.add("deliveryPersistent");
        props.add("priority");
        props.add("preserveMessageQos");
        props.add("concurrentConsumers");
        props.add("acknowledgementMode");
        props.add("replyToType");
        props.add("lazyStartProducer");
        props.add("connectionFactory");
        props.add("testConnectionOnStartup");
        props.add("replyTo");
        props.add("replyToOverride");
        props.add("durableSubscriptionName");
        props.add("replyToSameDestinationAllowed");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sjms".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationType", "queue", false, copy);
        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

