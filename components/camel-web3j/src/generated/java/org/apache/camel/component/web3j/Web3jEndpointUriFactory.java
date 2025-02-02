/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

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
public class Web3jEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":nodeAddress";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(39);
        props.add("blockHash");
        props.add("addresses");
        props.add("toBlock");
        props.add("headerPowHash");
        props.add("data");
        props.add("databaseName");
        props.add("signedTransactionData");
        props.add("hashrate");
        props.add("toAddress");
        props.add("transactionHash");
        props.add("gasLimit");
        props.add("sourceCode");
        props.add("bridgeErrorHandler");
        props.add("web3j");
        props.add("fullTransactionObjects");
        props.add("atBlock");
        props.add("fromAddress");
        props.add("value");
        props.add("gasPrice");
        props.add("sha3HashOfDataToSign");
        props.add("address");
        props.add("clientId");
        props.add("quorumAPI");
        props.add("topics");
        props.add("exchangePattern");
        props.add("keyName");
        props.add("index");
        props.add("privateFor");
        props.add("mixDigest");
        props.add("priority");
        props.add("nodeAddress");
        props.add("nonce");
        props.add("ttl");
        props.add("filterId");
        props.add("fromBlock");
        props.add("lazyStartProducer");
        props.add("position");
        props.add("exceptionHandler");
        props.add("operation");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "web3j".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "nodeAddress", null, true, copy);
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

